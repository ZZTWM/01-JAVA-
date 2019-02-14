package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 练习：忽略倍数
 * @author Administrator
 * 打印 1-100 之间的数，如果这个数，如果是3，或者是5的倍数，就忽略掉
 */
public class Continue02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int inputNum = scan.nextInt();
		
		for(int j=1 ;j <= inputNum ; j++){
			if(0 == j % 3 || 0 == j % 5){
				continue;
			}else{
				System.out.println(j);
			}
		}
		
		
	}

}
