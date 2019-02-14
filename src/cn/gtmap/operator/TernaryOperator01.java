package cn.gtmap.operator;
/**
 * 三元操作符
 * @author Administrator
 *
 */
public class TernaryOperator01 {
	/**
	 * 1、三元操作符
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		int k = i < j ? 99 : 88;
		//如果i < j 则 k = 99
		//否则，k = 88
		System.out.println(k);//99
	}

}
