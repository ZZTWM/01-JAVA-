package cn.gtmap.operator;

import java.util.Scanner;

/**
 * ��ϰ-��ϵ������
 * @author Administrator
 * ����Scanner��ȡ����̨����������������֣�Ȼ��ʹ��
	> ����
	>= ���ڻ����
	< С��
	<= С�ڻ����
	== �Ƿ����
	!= �Ƿ񲻵�
	
	�ж�����ֵ֮��Ĺ�ϵ
 *
 */
public class RelationalOperator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����һ��������");
		int a = scan.nextInt();
		System.out.println("����ĵ�һ�������ǣ�" + a);
		
		System.out.println("����ڶ���������");
		int b = scan.nextInt();
		System.out.println("����ĵڶ��������ǣ�" + b);
		
		System.out.println("�Ƚ�" + a + ">" + b + ":" + (a>b));
		System.out.println("�Ƚ�" + a + ">=" + b + ":" + (a>=b));
		System.out.println("�Ƚ�" + a + "<" + b + ":" + (a<b));
		System.out.println("�Ƚ�" + a + "<=" + b + ":" + (a<=b));
		System.out.println("�Ƚ�" + a + "==" + b + ":" + (a==b));
		System.out.println("�Ƚ�" + a + "!=" + b + ":" + (a!=b));
		
		
	}

}
