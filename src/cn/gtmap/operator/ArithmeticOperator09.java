package cn.gtmap.operator;

import java.util.Scanner;

/**
 * 11����ϰ-BMI
 * 	BMI�ļ��㹫ʽ�� ����(kg) / (���*���)
 * @author Administrator
 *
 */
public class ArithmeticOperator09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ߣ�m����");
		float height = scan.nextFloat();
		System.out.println("���������ǣ�" + height);
		
		System.out.println("���������أ�kg��");
		float weight = scan.nextFloat();
		System.out.println("����������ǣ�" + weight);
		
		float bmi = weight/(height*height);
		
		System.out.println("BMI�ǣ�" + bmi);
		
		if(bmi> 0 &&bmi < 18.5){
			System.out.println("���ع��ᣡ");
		}else if(bmi>=18.5 && bmi<24){
			System.out.println("������Χ!");
		}else if(bmi>=24 && bmi<27){
			System.out.println("���ع���!");
		}else if(bmi>=27 && bmi<30){
			System.out.println("��ȷ��֣�");
		}else if(bmi>=30 && bmi<35){
			System.out.println("�жȷ���");
		}else if(bmi >=35){
			System.out.println("�ضȷ��֣�");
		}else {
			System.out.println("���󣬷����࣡");
		}
		
	}

}
