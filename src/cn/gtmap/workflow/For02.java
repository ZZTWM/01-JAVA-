package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * ��ϰ-��ؤ
	�쳯��һ����ؤ�պ飬ȥ����ҪǮ
	��һ��Ҫ��1��Ǯ
	�ڶ���Ҫ��2��Ǯ
	������Ҫ��4��Ǯ
	������Ҫ��8��Ǯ
	�Դ�����
	
	���⣺ ����ؤ��10�죬�����Ƕ��٣�
 *
 */
public class For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ؤ��������");
		String name = scan.nextLine();
		System.out.println("������ؤ�ɵ�������");
		int day = scan.nextInt();
		int income = 0;
		int perDayIncome = 1;
		if(day > 0){
			for(int i= 1; i <= day; i++){
				income = income + perDayIncome;
				perDayIncome = perDayIncome * 2;
				System.out.println("��" + i +"�죬" + name + "��ؤ������" + income + "Ԫ");
			}
			System.out.println( name + "��ؤ����" + day + "�죬" + "�������ǣ�" + income + "Ԫ");
		}else{
			System.out.println("���������0��������");
		}
		
	}

}
