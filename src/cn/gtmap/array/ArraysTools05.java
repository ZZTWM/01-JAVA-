package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ� �������˿�����Ա�Ĺ���Ч�ʡ�
 *
 */
public class ArraysTools05 {
	/**
	 * 5���ж��Ƿ���ͬ
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		int[] b = new int[] {18, 62, 68, 82, 65, 9};
		int[] c = new int[] {18, 63, 68, 82, 65, 9};
		
		System.out.println("����a������b�Ƿ���ͬ��" + Arrays.equals(a, b));
		System.out.println("����a������c�Ƿ���ͬ��" + Arrays.equals(a, c));
	}

}
