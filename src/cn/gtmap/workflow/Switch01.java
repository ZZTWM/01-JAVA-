package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * 1��switch
 * @author Administrator
 *
 */
public class Switch01 {

	public static void main(String[] args) {
		System.out.println("ʹ��if-else:");
		//���ʹ��if else
		Scanner scan = new Scanner(System.in);
		System.out.println("����һ��������");
		int day = scan.nextInt();
		
		if(1 == day){
			System.out.println("����һ");
		}else if(2 == day){
			System.out.println("���ڶ�");
		}else if(3 == day){
			System.out.println("������");
		}else if(4 == day){
			System.out.println("������");
		}else if(5 == day){
			System.out.println("������");
		}else if(6 == day){
			System.out.println("������");
		}else if(7 == day){
			System.out.println("������");
		}else{
			System.out.println("�������");
		}
		
		System.out.println("----------���Ƿָ���------------------");
		System.out.println("ʹ��switch-case:");
		switch(day){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;				
			case 4:
				System.out.println("������");
				break;				
			case 5:
				System.out.println("������");
				break;				
			case 6:
				System.out.println("������");
				break;				
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("�������");
		}
	}

}
