package cn.gtmap.array;
/**
 * ��������
 *
 */
public class ArraySorting01 {
	/**
	 * ѡ������
	 */
	public static void main(String[] args) {
		//�������飬�����ֵ������ӡ
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		//��ӡ
		System.out.println("����ǰ���飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//ѡ�񷨽�����������
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if(a[i] < a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		//��������
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
