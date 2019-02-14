package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 练习：闰年
 * @author Administrator
 *
 */
public class IF01 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		if((0 == year % 4 && 0 != year % 100)||(0 == year % 400)){
			System.out.println(year + "是闰年");
		}else{
			System.out.println( year + "不是闰年");
		}
		
	}

}
