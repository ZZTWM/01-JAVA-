package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * ��ϰ���׳�
 *  N�Ľ׳˵��� N* (N-1) * (N-2) * ... * 1
 * @author Administrator
 * 
 */
public class While02 {
	/**
	 * 1��0��1�Ľ׳���1
	 * 2��N�Ľ׳˵��� N* (N-1) * (N-2) * ... * 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = scan.nextInt();
		
		int factorial = 1;
		if(0 == num || 1 == num){
			factorial = 1;
			System.out.println("�����������Ľ׳��ǣ�" + factorial);
		}else if(num >=2){
			while(num >= 1){
				factorial = factorial * num;
				num--;
			}
			System.out.println("�����������Ľ׳��ǣ�" + factorial);
		}else{
			System.out.println("������һ������0������");
		}
		
		
	}

}
