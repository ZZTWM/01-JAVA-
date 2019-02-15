package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays���������Ĺ����࣬���Խ��� ���򣬲��ң��������ȹ��ܡ� �������˿�����Ա�Ĺ���Ч�ʡ�
 *
 */
public class ArraysTools07 {
	/**
	 * 7����ϰ����ά��������
	 */
	public static void main(String[] args) {
		//��ʼ����ά���飬����ֵ
		int[][] a = new int[5][8];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		
		System.out.println("��ӡ��ά���飺");
		//������ά���飬���
		for (int[] is : a) {
			System.out.println(Arrays.toString(is));
		}
		
		//�Ѷ�ά���鸴�Ƶ�һά����
		int[] b = new int[a.length * a[0].length];
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
		}
		//��һά�����������
		Arrays.sort(b);
		//��һά���鸴�Ƶ���ά����
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(b, a[i].length * i, a[i], 0, a[i].length);
		}
		
		System.out.println("��ӡ�����Ķ�ά���飺");
		for (int[] i : a) {
			System.out.println(Arrays.toString(i));
		}
	}

}
