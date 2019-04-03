package cn.gtmap.number_and_string.boxing_and_unboxing;

public class Test03 {

	public static void main(String[] args) {
		
		//基本类型
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 10L;
		float f = 3.4f;
		double d = 3.1415;
		
		//基本类型转封装类
		Byte bt = new Byte(b);
		Short sh = new Short(s);
		Integer it = new Integer(i);
		Long lg = new Long(l);
		Float fl = new Float(f);
		Double de = new Double(d);
		
		
	}

}
