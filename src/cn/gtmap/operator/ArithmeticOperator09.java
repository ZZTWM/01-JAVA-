package cn.gtmap.operator;

import java.util.Scanner;

/**
 * 11、练习-BMI
 * 	BMI的计算公式是 体重(kg) / (身高*身高)
 * @author Administrator
 *
 */
public class ArithmeticOperator09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身高（m）：");
		float height = scan.nextFloat();
		System.out.println("输入的身高是：" + height);
		
		System.out.println("请输入体重（kg）");
		float weight = scan.nextFloat();
		System.out.println("输入的体重是：" + weight);
		
		float bmi = weight/(height*height);
		
		System.out.println("BMI是：" + bmi);
		
		if(bmi> 0 &&bmi < 18.5){
			System.out.println("体重过轻！");
		}else if(bmi>=18.5 && bmi<24){
			System.out.println("正常范围!");
		}else if(bmi>=24 && bmi<27){
			System.out.println("体重过重!");
		}else if(bmi>=27 && bmi<30){
			System.out.println("轻度肥胖！");
		}else if(bmi>=30 && bmi<35){
			System.out.println("中度肥胖");
		}else if(bmi >=35){
			System.out.println("重度肥胖！");
		}else {
			System.out.println("错误，非人类！");
		}
		
	}

}
