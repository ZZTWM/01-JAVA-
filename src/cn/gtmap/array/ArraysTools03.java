package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ� �������˿�����Ա�Ĺ���Ч�ʡ�
 *
 */
public class ArraysTools03 {
	/**
	 * 3������
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		System.out.println("����ǰ��");
		System.out.println(Arrays.toString(a));
		
		//�����
		Arrays.sort(a);
		System.out.println("�����");
		System.out.println(Arrays.toString(a));
	}

}
