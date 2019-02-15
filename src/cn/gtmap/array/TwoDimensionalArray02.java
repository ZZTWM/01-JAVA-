package cn.gtmap.array;

/**
 * ��ϰ����ά����
 *
 */
public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		//��ʼ�����飬�����ֵ
		int[][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		
		//��ӡ�����ά����
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//�ҳ������ά����������ֵ������ӡ�±�
		int max = -1;//���ֵ
		//���ֵ���±�
		int index_i = -1;
		int index_j = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max){
					max = a[i][j];
					index_i = i;
					index_j = j;
				}
			}
		}
		
		System.out.println("�ҳ��������ֵ�ǣ�" + max);
		System.out.println("�������ǣ�[" + index_i + "][" + index_j + "]");
		
		
		
		
	}
}
