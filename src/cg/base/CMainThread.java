package cg.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cg.base.log.Log;
import cg.base.util.Updatable;
import cg.base.util.Updater;

/**
 * Ĭ�����߳�
 * <p>
 * ��Ϸ����Ҫ�̣߳�����������Ҫ���߼���ʵ���� {@link Runnable} �ӿڣ��������߳������С�<br>
 * �ӿ� {@link Updater} ��Ĭ��ʵ���ࡣ
 * </p>
 * @author 	hyfu
 */
class CMainThread implements Updater, Runnable {
	
	/**
	 * ���¼���
	 */
	private List<Updatable> updatables;
	
	private Queue<Updatable> waitRemove, waitAdd;
	
	private int sleepTime;
	
	private Log log;
	
	/**
	 * ����<br>
	 * ���ʱ�����߳����С�
	 */
	public CMainThread(int sleepTime, Log log) {
		this.sleepTime = sleepTime;
		this.log = log;
		updatables = new ArrayList<Updatable>(); // ����һ�����鼯��
		waitRemove = new LinkedList<Updatable>();
		waitAdd = new LinkedList<Updatable>();
		(new Thread(this, "CMainThread")).start(); // �����߳�����
	}

	@Override
	public void run() {
		while (true) { // ������ѭ��
			try {
				long time = System.currentTimeMillis(); // ��ø���ǰʱ�䣨���룩
				
				update(); // ����
				
				time = System.currentTimeMillis() - time; // ������º�ʱ�����룩
				
				if (time < sleepTime) { // ���º�ʱ������¼��ʱ
					synchronized (this) {
						wait(sleepTime - time); // ��ǰѭ���ȴ���ʱ��Ϊ������¼��
					}
				} else { // ���º�ʱ�ﵽ�򳬹����¼��ʱ
					Thread.yield();
				}
			} catch (Exception e) {
				log.error("CMainThread::run() : ", e); // ����쳣
			}
		}
	}

	@Override
	public void add(Updatable updatable) {
		synchronized (waitAdd) { // ��ס���¼��ϣ���ֹ���̲߳��������쳣
			waitAdd.add(updatable); // ��Ӹ��¶���
		}
	}

	@Override
	public void update() {
		for (Updatable updatable : updatables) { // �������¼���
			long time = System.currentTimeMillis(); // ��ø���ǰʱ�䣨���룩
			
			if (!waitRemove.contains(updatable)) {
				updatable.update(); // ���µ�ǰ���¶���
			}
			
			time = System.currentTimeMillis() - time; // ������º�ʱ�����룩
			if (time >= sleepTime) { // ����ʱ��ϳ�
				log.warning("CMainThread::update() too long : " + updatable.getClass().getName() + " ; time = " + time); // ���������Ϣ
			}
		}
		synchronized (waitRemove) {
			while (!waitRemove.isEmpty()) {
				updatables.remove(waitRemove.poll());
			}
		}
		synchronized (waitAdd) {
			while (!waitAdd.isEmpty()) {
				updatables.add(waitAdd.poll());
			}
		}
	}

	@Override
	public void remove(Updatable updatable) {
		synchronized (waitRemove) {
			waitRemove.add(updatable);
		}
	}

}
