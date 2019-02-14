package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 1、switch
 * @author Administrator
 *
 */
public class Switch01 {

	public static void main(String[] args) {
		System.out.println("使用if-else:");
		//如果使用if else
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个整数：");
		int day = scan.nextInt();
		
		if(1 == day){
			System.out.println("星期一");
		}else if(2 == day){
			System.out.println("星期二");
		}else if(3 == day){
			System.out.println("星期三");
		}else if(4 == day){
			System.out.println("星期四");
		}else if(5 == day){
			System.out.println("星期五");
		}else if(6 == day){
			System.out.println("星期六");
		}else if(7 == day){
			System.out.println("星期日");
		}else{
			System.out.println("输入错误");
		}
		
		System.out.println("----------我是分割线------------------");
		System.out.println("使用switch-case:");
		switch(day){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;				
			case 4:
				System.out.println("星期四");
				break;				
			case 5:
				System.out.println("星期五");
				break;				
			case 6:
				System.out.println("星期六");
				break;				
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误");
		}
	}

}
