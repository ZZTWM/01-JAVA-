package cn.gtmap.array;
/**
 * ��������
 *
 */
public class BuildArray05 {
	/**
	 * 1����ϰ��������Сֵ
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
		//�������и����ֵ
		for (int i = 0; i <a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("�����еĸ���������ǣ�");
		
		//ѭ�����������ֵ��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		//����������С��ֵ��
		int min = 100;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.println("�ҳ�������С��ֵ�ǣ�" + min);
		
	}

}
