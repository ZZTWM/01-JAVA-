package cn.gtmap.operator;

/**
 * ��ϰ������
 * @author Administrator
 *
 */
public class ArithmeticOperator08 {

	public static void main(String[] args) {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		// iֵ                  2     3     4     5     6
		// ȡֵ         2     2    4      5     5
		System.out.println(j);//j = 2 + 2 + 4 + 5 + 5
	}

}
