package cn.gtmap.operator;
/**
 * ��ֵ������
 * @author Administrator
 *
 */
public class AssignmentOperator {
	/**
	 * ��ϰ����ֵ������
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		i += ++i;
		//i = i + (++i)
		//i = 1 + 2 = 3
		System.out.println(i);//3
	}

}
