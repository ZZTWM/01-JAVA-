package cn.gtmap.array;
/**
 * ��ǿ��forѭ��
 *
 */
public class EnhancedForCycle {

	public static void main(String[] args) {
		int[] a = new int[]{18,62,68,82,65,9};
		int[] b = new int[]{19,63,69,83,66,10};
		//�������
		System.out.println("���������");
		for (int i = 0; i < a.length; i++) {
			int each = a[i];
			System.out.print(each + " ");
		}
		System.out.println();
		
		//��ǿ��forѭ������
		System.out.println("��ǿ��forѭ��������");
		for (int each : b) {
			System.out.print(each + " ");
		}
	}

}
