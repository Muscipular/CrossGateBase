package cg.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/**
 * MD5����
 * @author	fuhuiyuan
 */
public class MD5Util {
	
	/**16�����ַ�*/
	private static final char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	/**
	 * ��ȡMD5
	 * @param 	byteBuffer
	 * 			���ݻ�����
	 * @return	MD5
	 * @throws 	Exception
	 */
	public static String getMD5(ByteBuffer byteBuffer) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(byteBuffer);
        BigInteger bi = new BigInteger(1, md.digest());
        return bi.toString(16);
	}

	/**
	 * ��ȡMD5
	 * @param 	file
	 * 			�ļ�
	 * @return	MD5
	 * @throws 	Exception
	 */
	public static String getMD5(File file) throws Exception {
		FileInputStream in = new FileInputStream(file);
		try {
			MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			return getMD5(byteBuffer);
		} finally {
			in.close();
		}
	}

	/**
	 * ��ȡMD5
	 * @param 	s
	 * 			�ַ���
	 * @return	MD5
	 * @throws 	Exception
	 */
	public static String getMD5(String s) throws Exception {
		byte[] btInput = s.getBytes();
        // ���MD5ժҪ�㷨�� MessageDigest ����
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        // ʹ��ָ�����ֽڸ���ժҪ
        mdInst.update(btInput);
        // �������
        byte[] md = mdInst.digest();
        // ������ת����ʮ�����Ƶ��ַ�����ʽ
        int j = md.length;
        char str[] = new char[j * 2];
        int k = 0;
        for (int i = 0; i < j; i++) {
            byte byte0 = md[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getMD5(new File("D:/file/workspace/ServerIO/src/com/fanxing/server/io/MD5Util.java")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println(getMD5("D:/file/workspace/ServerIO/src/com/fanxing/server/io/MD5Util.java"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
