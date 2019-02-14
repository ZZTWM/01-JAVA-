package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 练习-季节
 * @author Administrator
 *
 */
public class Switch02 {
	/**
	 * 通过Scanner 输入月份，然后使用switch 判断季节
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入月份：");
		int month = scan.nextInt();
		String season;
		switch(month){
			case 1:
			case 2:
			case 3:
				season = "春天";
				break;
			case 4:
			case 5:
			case 6:
				season = "夏天";
				break;
			case 7:
			case 8:
			case 9:
				season = "秋天";
				break;
			case 10:
			case 11:
			case 12:
				season = "冬天";
				break;	
			default:
				season = "输入错误";
		}
		
		System.out.println(season);
		
	}

}
