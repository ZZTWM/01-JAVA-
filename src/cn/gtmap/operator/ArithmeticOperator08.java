package cn.gtmap.operator;

/**
 * 练习：自增
 * @author Administrator
 *
 */
public class ArithmeticOperator08 {

	public static void main(String[] args) {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		// i值                  2     3     4     5     6
		// 取值         2     2    4      5     5
		System.out.println(j);//j = 2 + 2 + 4 + 5 + 5
	}

}
