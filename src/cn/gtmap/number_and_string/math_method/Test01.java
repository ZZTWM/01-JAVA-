package cn.gtmap.number_and_string.math_method;

public class Test01 {
	public static void main(String[] args) {
		float f1 = 5.4f;
		float f2 = 5.5f;
		//5.4四舍五入即5
		System.out.println(Math.round(f1));//5
		//5.5四舍五入即6
		System.out.println(Math.round(f2));//6
	}
}
