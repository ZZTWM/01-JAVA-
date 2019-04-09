package cn.gtmap.number_and_string.math_method;

public class Test02 {
	public static void main(String[] args) {
		
		//得到一个0-1之间的随机浮点数（取不到1）
		System.out.println(Math.random());
		//得到一个0-10之间的随机浮点数（取不到10）
		System.out.println((int)(Math.random()*10));
		
	}
}
