package cn.gtmap.operator;
/**
 * �߼�������
 * @author Administrator
 *
 */
public class LogicalOperator04 {
	/**
	 * ���
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		//��ͬ������
		System.out.println(a ^ b);//true
		//��ͬ���ؼ�
		System.out.println(a ^ !b);//false
	}

}
