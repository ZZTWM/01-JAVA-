package cn.gtmap.operator;

import java.util.Scanner;

/**
 * 练习-关系操作符
 * @author Administrator
 * 借助Scanner获取控制台输入的两个任意数字，然后使用
	> 大于
	>= 大于或等于
	< 小于
	<= 小于或等于
	== 是否相等
	!= 是否不等
	
	判断两个值之间的关系
 *
 */
public class RelationalOperator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入第一个整数：");
		int a = scan.nextInt();
		System.out.println("输入的第一个整数是：" + a);
		
		System.out.println("输入第二个整数：");
		int b = scan.nextInt();
		System.out.println("输入的第二个整数是：" + b);
		
		System.out.println("比较" + a + ">" + b + ":" + (a>b));
		System.out.println("比较" + a + ">=" + b + ":" + (a>=b));
		System.out.println("比较" + a + "<" + b + ":" + (a<b));
		System.out.println("比较" + a + "<=" + b + ":" + (a<=b));
		System.out.println("比较" + a + "==" + b + ":" + (a==b));
		System.out.println("比较" + a + "!=" + b + ":" + (a!=b));
		
		
	}

}
