package cg.base.util;

public class StringUtils {

	/**
	 * ����ĸ��д
	 * @param 	text
	 * 			�ı�
	 * @return	����ĸ��д����ı�
	 */
	public static String firstUpper(String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	/**
	 * ����ĸСд
	 * @param 	text
	 * 			�ı�
	 * @return	����ĸСд����ı�
	 */
	public static String firstLower(String text) {
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}

}
