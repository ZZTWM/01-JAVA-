package cn.gtmap.array;
/**
 * ��������
 *
 */
public class ArraySorting02 {
	/**
	 * ð�ݷ�����
	 */
	public static void main(String[] args) {
		
		int[] a = new int[5];
		System.out.println("����ǰ���飺");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//ð������
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - j - 1; i++) {
				if(a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		//��������
		System.out.println("���������飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
