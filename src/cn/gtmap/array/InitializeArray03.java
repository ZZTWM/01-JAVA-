package cn.gtmap.array;
/**
 * ��ʼ������
 *
 */
public class InitializeArray03 {
	/**
	 * 3����ϰ�����鷴ת
	 */
	public static void main(String[] args) {
		
		//�������飬�����ֵ������ӡ
		int[] a = new int[5];
		System.out.println("�����и���ֵ�ǣ�");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//˼·һ��������ʱ���飬��ԭ��������ݸ��ƹ�����
		//		Ȼ�����ʱ�����ֵ ���ŵ�ԭ������
		int[] temp = new int[a.length];
		//��ԭ��������ݸ��Ƹ���ʱ����
		System.out.println("��ʱ�����е�ֵ�ǣ�");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a[i];
			System.out.print(temp[i] + " ");
		}
		
		System.out.println();
		
		//��ת�������ǰ���ʱ��������ݣ����� �� ����ԭ������
		System.out.println("��ת��������и���ֵ�ǣ�");
		for (int i = 0; i < temp.length; i++) {
			a[i] = temp[temp.length - i - 1];
			System.out.print(a[i] + " ");
		}
		
	}

}
