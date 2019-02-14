package cn.gtmap.operator;
/**
 * 逻辑操作符
 * @author Administrator
 *
 */
public class LogicalOperator05 {
	/**
	 * 练习：逻辑操作符
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;    
		//（1）i =1，i++ 先运算再自增，此时1 == 3，为 false，然后i自增，i=2，所以（i++ == 3）为false
		//（2）此时i=2，i++先运算再自增，所以 i++ == 2为true，然后i自增，i=3，所以（i++ == 2）为true
		//（3）此时i=3，i++先运算再自增，所以 i++ == 3 为true，然后i自增，i=4，所以（i++ == 3）为true
		//（4）所以!(i++ == 3)^(i++ == 2)&&(i++ == 3)--> 
		//				!false^true&&true-->true^true&&true-->false&&true-->false
		//（5）所以b=false
		//在最后false && true ，以为是短路与，所以 （i++ == 3）不会执行，此时i还是3
		boolean b = !(i++ == 3)^(i++ == 2)&&(i++ == 3);//false
		System.out.println(b);//false
		System.out.println(i);//3
	}

}
