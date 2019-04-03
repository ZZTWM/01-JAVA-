package cn.gtmap.number_and_string.boxing_and_unboxing;

public class Test02 {
	public static void main(String[] args) {
		/**
		 * 基本类型
		 */
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 10L;
		float f = 3.4f;
		double d = 3.1415;
		
		/**
		 * 封装类：Number类是 ：
		 * 	 	 Byte,Short,Integer,Long,Float,Double的父类
		 */
		Byte bt = new Byte(b);
		Short sh = new Short(s);
		Integer it = new Integer(i);
		Long lg = new Long(l);
		Float fl = new Float(f);
		Double de = new Double(d);
		
		System.out.println("bt instanceof Number:" + (bt instanceof Number));
		System.out.println("sh instanceof Number:" + (sh instanceof Number));
		System.out.println("it instanceof Number:" + (it instanceof Number));
		System.out.println("lg instanceof Number:" + (lg instanceof Number));
		System.out.println("fl instanceof Number:" + (fl instanceof Number));
		System.out.println("de instanceof Number:" + (de instanceof Number));
		
		System.out.println("--------------------分割线----------------------");
		
		System.out.println("bt instanceof Byte:" + (bt instanceof Byte));
		System.out.println("sh instanceof Short:" + (sh instanceof Short));
		System.out.println("it instanceof Integer:" + (it instanceof Integer));
		System.out.println("lg instanceof Long:" + (lg instanceof Long));
		System.out.println("fl instanceof Float:" + (fl instanceof Float));
		System.out.println("de instanceof Double:" + (de instanceof Double));
		
	}
}
