package cn.gtmap.number_and_string.boxing_and_unboxing;

/**
 * 自动装箱
 * 不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
 */
public class Test05 {
	public static void main(String[] args) {
		//基本类型
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 10L;
		float f = 3.4f;
		double d = 3.1415;
		
		//01：基本类型转封装类:不自动装箱
		Byte bt = new Byte(b);
		Short sh = new Short(s);
		Integer it = new Integer(i);
		Long lg = new Long(l);
		Float fl = new Float(f);
		Double de = new Double(d);
		
		//02：基本类型转封装类:自动装箱
		Byte bt2 = b;
		Short sh2 = s;
		Integer it2 = i;
		Long lg2 = l;
		Float fl2 = f;
		Double de2 = d;
		
	}
}
