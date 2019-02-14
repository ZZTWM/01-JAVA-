package cn.gtmap.operator;

import java.util.Scanner;

/**
 * 三元操作符
 * @author Administrator
 *
 */
public class TernaryOperator02 {
	/**
	 * 练习：三元操作符
	 * 通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入1~7直接的整数：");
		int num = scan.nextInt();
		boolean isWorkDay = num >=6 ? false:true;
		if(isWorkDay)
			System.out.println("今天是工作日");
		else
			System.out.println("今天是周末");
	}

}
