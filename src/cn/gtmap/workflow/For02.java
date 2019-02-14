package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 练习-乞丐
	天朝有一个乞丐姓洪，去天桥要钱
	第一天要了1块钱
	第二天要了2块钱
	第三天要了4块钱
	第四天要了8块钱
	以此类推
	
	问题： 洪乞丐干10天，收入是多少？
 *
 */
public class For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入乞丐的姓名：");
		String name = scan.nextLine();
		System.out.println("输入乞丐干的天数：");
		int day = scan.nextInt();
		int income = 0;
		int perDayIncome = 1;
		if(day > 0){
			for(int i= 1; i <= day; i++){
				income = income + perDayIncome;
				perDayIncome = perDayIncome * 2;
				System.out.println("第" + i +"天，" + name + "乞丐手里有" + income + "元");
			}
			System.out.println( name + "乞丐干了" + day + "天，" + "总收入是：" + income + "元");
		}else{
			System.out.println("请输入大于0的整数！");
		}
		
	}

}
