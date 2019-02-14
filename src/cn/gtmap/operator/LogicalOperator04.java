package cn.gtmap.operator;
/**
 * 逻辑操作符
 * @author Administrator
 *
 */
public class LogicalOperator04 {
	/**
	 * 异或
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		//不同返回真
		System.out.println(a ^ b);//true
		//相同返回假
		System.out.println(a ^ !b);//false
	}

}
