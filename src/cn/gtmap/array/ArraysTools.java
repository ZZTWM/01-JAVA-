package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ� �������˿�����Ա�Ĺ���Ч�ʡ�
 *
 */
public class ArraysTools {
	/**
	 * 1�����鸴��
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		
        // copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
		int[] b = Arrays.copyOfRange(a, 0, 3);//�����3��ʾ�±ֻ꣬��ȡ��a����0��1��2��λ�õ�ֵ
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}

}
