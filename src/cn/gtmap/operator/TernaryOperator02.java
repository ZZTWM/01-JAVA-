package cn.gtmap.operator;

import java.util.Scanner;

/**
 * ��Ԫ������
 * @author Administrator
 *
 */
public class TernaryOperator02 {
	/**
	 * ��ϰ����Ԫ������
	 * ͨ��Scanner����һ��1-7֮���������ʹ����Ԫ�������ж��ǹ����ջ�����ĩ��
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����1~7ֱ�ӵ�������");
		int num = scan.nextInt();
		boolean isWorkDay = num >=6 ? false:true;
		if(isWorkDay)
			System.out.println("�����ǹ�����");
		else
			System.out.println("��������ĩ");
	}

}
