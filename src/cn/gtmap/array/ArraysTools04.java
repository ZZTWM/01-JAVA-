package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ� �������˿�����Ա�Ĺ���Ч�ʡ�
 *
 */
public class ArraysTools04 {
	/**
	 * 4������
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 62, 82, 65, 9};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("����  62 ����λ�ã�" + Arrays.binarySearch(a, 62));
	}

}
