package cn.gtmap.operator;

import java.util.Scanner;
/**
 * ��ϰ-��ͣ�
 * 	ʹ��Scanner�ӿ���̨��ȡ�������֣�Ȼ��������������ֵĺ�
 * 	�������ʹ��Scanner����ο� ���ʹ��Scanner��ȡ����
 * @author Administrator
 *
 */
public class ArithmeticOperator02 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������һ��������");
        int a = scan.nextInt();
        System.out.println("����ĵ�һ������Ϊ��"+a);
        
        System.out.println("������ڶ���������");
        int b = scan.nextInt();
        System.out.println("����ĵڶ�������Ϊ��"+b);
        int c = a+b;
        System.out.println("��������������ĺ��� ��" + c);
	}

}
