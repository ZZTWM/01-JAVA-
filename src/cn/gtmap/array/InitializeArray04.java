package cn.gtmap.array;
/**
 * ��ʼ������
 *
 */
public class InitializeArray04 {
	/**
	 * 3����ϰ�����鷴ת
	 */
	public static void main(String[] args) {
		/**
		 * ˼·����������β����
		 */
		//�������飬�����ֵ������ӡ
		System.out.println("ԭ���飺");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//������β����
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
		
		System.out.println("��ת��������ǣ�");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
