package cn.gtmap.variable;
/**
 * 基本变量类型
 * 1、八种
 * 2、整型（4种）、字符型（1种）、浮点型（2种）、布尔型（1种）
 * @author Administrator
 *
 */
public class BascicVariable {

	public static void main(String[] args) {
		/**
		 * 1、整型
		 */
		byte b = 1;
		short s = 200;
		int i = 300;
		long l = 400;
		/*
		 * 如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误
		 */
		//byte b2 = 200;
		
		/**
		 * 2、字符型
		 */
		char c = '中';
		//char 只能存放一个字符，超过一个字符就会产生编译错误
		//char c2 = '中国';//报错
		//char c3 = 'ab';//报错
		
		/**
		 * 3、浮点型
		 */
		double d = 123.45;
		//该行会出现编译错误，因为54.321是double型的
		//float f = 54.321;
		
		float f2 = 54.321f;
		
		/**
		 * 4、布尔型
		 */
		boolean b1 = true;
		boolean b2 = false;
        //虽然布尔型真正存放的数据是0(false) 1(true)
        //但是，不能直接使用0 1 进行赋值
		//boolean b3 = 1;
		
		/**
		 * 注：String类型
		 */
		String str = "hello world";
		
		/**
		 * 练习变量类型
		 */
		float f1 = 3.14f;
		double d1 = 3.14;
		float f3 = 2.769343f;
		double d2 = 2.769343;
		
		int i1 = 365;
		short s1 = 365;
		long l1 = 365L;
		
		int i2 = 12;
		byte b3 = 12;
		short s2 = 12;
		long l2 = 12L;
		
		char c2 = '吃';
		String str2 = "吃";
		
		boolean b4 = false;
		
		String str3 = "不可描述";
		
	}

}
