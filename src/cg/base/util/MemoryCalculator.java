/*
 * @(#)MemoryCalculator.java	1.0 2010-11-8
 *
 * Copyright 2010 Richard Chen(utopia_rabbi@sse.buaa.edu.cn) All Rights Reserved.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package cg.base.util;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * �ṩʵ��ռ���ڴ��С�ļ��㹦��. �ڲ�����JVM��{@link Instrumentation}ʵ��.
 *
 * @author Rich, 2010-11-8.
 * @version 1.0
 * @since 1.0
 */
public final class MemoryCalculator {
	
	/** JVM��������ʱͨ��{@link #premain}��ʼ���˳�Ա����. */
	private static Instrumentation instrumentation = null;
	
	/**
	 * JVM�ڳ�ʼ�����ڵ���Ӧ�ó���main����ǰ�����ñ�����, �������п���д�κ�main�����п�д�Ĵ���.
	 *
	 * @param agentArgs �����д��������Ĵ������, �ڲ������н���.
	 * @param inst JVMע��ľ��.
	 */
	public static void premain(String agentArgs, Instrumentation inst) {
		instrumentation = inst;
	}
	
	/**
	 * ����ʵ������ռ�õ��ڴ��С. ע��:
	 * 1. ��ε��ÿ��ܽ����һ��, ��Ҫ��ʵ����״̬�й�
	 * 2. ʵ���г�Ա���������reference����, ��reference��ָ���ʵ��ռ���ڴ��С��ͳ������
	 *
	 * @param obj �������ڴ�ռ�ô�С��ʵ��.
	 * @return �ڴ�ռ�ô�С, ��λΪbyte.
	 */
	public static long shallowSizeOf(Object obj) {
		if (instrumentation == null) {
			throw new IllegalStateException("Instrumentation initialize failed");
		}
		if (isSharedObj(obj)) {
			return 0;
		}
		return instrumentation.getObjectSize(obj);
	}
	
	/**
	 * ����ʵ��ռ�õ��ڴ��С, �����Ա���������õ�ʵ��, �ݹ����.
	 *
	 * @param obj �������ڴ�ռ�ô�С��ʵ��.
	 * @return �ڴ�ռ�ô�С, ��λΪbyte.
	 */
	public static long deepSizeOf(Object obj) {
		Map<Object, Object> calculated = new IdentityHashMap<Object, Object>();
		Stack<Object> unCalculated = new Stack<Object>();
		unCalculated.push(obj);
		long result = 0;
		do {
			result += doSizeOf(unCalculated, calculated);
		} while (!unCalculated.isEmpty());
		return result;
	}
	
	/**
	 * �ж�obj�Ƿ��ǹ������. ��Щ����, ��interned Strings, Boolean.FALSE��Integer#valueOf()��.
	 *
	 * @param obj ���жϵĶ���.
	 * @return true, �ǹ������, ���򷵻�false.
	 */
	private static boolean isSharedObj(Object obj) {
		if (obj instanceof Comparable) {
			if (obj instanceof Enum) {
				return true;
			} else if (obj instanceof String) {
				return (obj == ((String) obj).intern());
			} else if (obj instanceof Boolean) {
				return (obj == Boolean.TRUE || obj == Boolean.FALSE);
			} else if (obj instanceof Integer) {
				return (obj == Integer.valueOf((Integer) obj));
			} else if (obj instanceof Short) {
				return (obj == Short.valueOf((Short) obj));
			} else if (obj instanceof Byte) {
				return (obj == Byte.valueOf((Byte) obj));
			} else if (obj instanceof Long) {
				return (obj == Long.valueOf((Long) obj));
			} else if (obj instanceof Character) {
				return (obj == Character.valueOf((Character) obj));
			}
		}
		return false;
	}
	
	/**
	 * ȷ���Ƿ������obj���ڴ�ռ��, ����������������.
	 *
	 * @param obj ���жϵĶ���.
	 * @param calculated �Ѽ�����Ķ���.
	 * @return true, ��ָ�������, ���򷵻�false.
	 */
	private static boolean isEscaped(Object obj, Map<Object, Object> calculated) {
		return obj == null || calculated.containsKey(obj) || isSharedObj(obj);
	}
	
	/**
	 * ����ջ����������ڴ�ռ��.
	 *
	 * @param unCalculated �������ڴ�ռ�õĶ���ջ.
	 * @param calculated ����ͼ�����Ѽ�����Ķ���.
	 * @return ջ����������ڴ�ռ��, ��λΪbyte.
	 */
	private static long doSizeOf(Stack<Object> unCalculated, Map<Object, Object> calculated) {
		Object obj = unCalculated.pop();
		if (isEscaped(obj, calculated)) {
			return 0;
		}
		Class<?> clazz = obj.getClass();
		if (clazz.isArray()) {
			doArraySizeOf(clazz, obj, unCalculated);
		} else {
			while (clazz != null) {
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					if (!Modifier.isStatic(field.getModifiers())
							&& !field.getType().isPrimitive()) {
						field.setAccessible(true);
						try {
							unCalculated.add(field.get(obj));
						} catch (IllegalAccessException ex) {
							throw new RuntimeException(ex);
						}
					}
				}
				clazz = clazz.getSuperclass();
			}
		}
		calculated.put(obj, null);
		return shallowSizeOf(obj);
	}
	
	/**
	 * �������е�����Ԫ�ؼ��뵽�������ڴ�ռ�õ�ջ��, �ȴ�����.
	 *
	 * @param arrayClazz ������ͱ�.
	 * @param array ����ʵ��.
	 * @param unCalculated �������ڴ�ռ�õĶ���ջ.
	 */
	private static void doArraySizeOf(Class<?> arrayClazz, Object array, Stack<Object> unCalculated) {
		if (!arrayClazz.getComponentType().isPrimitive()) {
			int length = Array.getLength(array);
			for (int i = 0; i < length; i++) {
				unCalculated.add(Array.get(array, i));
			}
		}
	}
	
}
