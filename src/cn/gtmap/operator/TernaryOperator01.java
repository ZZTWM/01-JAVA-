package cn.gtmap.operator;
/**
 * ��Ԫ������
 * @author Administrator
 *
 */
public class TernaryOperator01 {
	/**
	 * 1����Ԫ������
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		int k = i < j ? 99 : 88;
		//���i < j �� k = 99
		//����k = 88
		System.out.println(k);//99
	}

}
