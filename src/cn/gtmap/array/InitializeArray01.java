package cn.gtmap.array;
/**
 * ��ʼ������
 *
 */
public class InitializeArray01 {
	/**
	 * 1������ռ��븳ֵ�ֲ�����
	 */
	public static void main(String[] args) {
		int[] a = new int[5];//�����˳�����5�����飬����û�и�ֵ
		
        //û�и�ֵ����ô�ͻ�ʹ��Ĭ��ֵ
        //��Ϊint���͵����飬Ĭ��ֵ��0
		System.out.println(a[0]);
		
		//���и�ֵ
		a[0] = 101;
		a[1] = 102;
		a[2] = 103;
		a[3] = 104;
		a[4] = 105;
	}

}
