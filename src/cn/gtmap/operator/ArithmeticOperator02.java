package cn.gtmap.operator;

import java.util.Scanner;
/**
 * 练习-求和：
 * 	使用Scanner从控制台获取两个数字，然后计算这两个数字的和
 * 	如果不会使用Scanner，请参考 如何使用Scanner读取整数
 * @author Administrator
 *
 */
public class ArithmeticOperator02 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scan.nextInt();
        System.out.println("输入的第一个整数为："+a);
        
        System.out.println("请输入第二个整数：");
        int b = scan.nextInt();
        System.out.println("输入的第二个整数为："+b);
        int c = a+b;
        System.out.println("输入的两个整数的和是 ：" + c);
	}

}
