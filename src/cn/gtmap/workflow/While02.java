package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 练习：阶乘
 *  N的阶乘等于 N* (N-1) * (N-2) * ... * 1
 * @author Administrator
 * 
 */
public class While02 {
	/**
	 * 1、0和1的阶乘是1
	 * 2、N的阶乘等于 N* (N-1) * (N-2) * ... * 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = scan.nextInt();
		
		int factorial = 1;
		if(0 == num || 1 == num){
			factorial = 1;
			System.out.println("输入的这个数的阶乘是：" + factorial);
		}else if(num >=2){
			while(num >= 1){
				factorial = factorial * num;
				num--;
			}
			System.out.println("输入的这个数的阶乘是：" + factorial);
		}else{
			System.out.println("请输入一个大于0的整数");
		}
		
		
	}

}
