package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * ��ϰ������
 * @author Administrator
 *
 */
public class IF01 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		if((0 == year % 4 && 0 != year % 100)||(0 == year % 400)){
			System.out.println(year + "������");
		}else{
			System.out.println( year + "��������");
		}
		
	}

}
