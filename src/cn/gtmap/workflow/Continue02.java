package cn.gtmap.workflow;

import java.util.Scanner;

/**
 * ��ϰ�����Ա���
 * @author Administrator
 * ��ӡ 1-100 ֮����������������������3��������5�ı������ͺ��Ե�
 */
public class Continue02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
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
