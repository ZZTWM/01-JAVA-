package cn.gtmap.operator;
/**
 * ¸³Öµ²Ù×÷·û
 * @author Administrator
 *
 */
public class AssignmentOperator {
	/**
	 * Á·Ï°£º¸³Öµ²Ù×÷·û
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
