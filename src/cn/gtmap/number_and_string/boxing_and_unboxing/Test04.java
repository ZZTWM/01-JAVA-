package cn.gtmap.number_and_string.boxing_and_unboxing;

public class Test04 {
	
	public static void main(String[] args) {
		//基本类型
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 10L;
		float f = 3.4f;
		double d = 3.1415;
		
		//01:基本类型转封装类
		Byte bt = new Byte(b);
		Short sh = new Short(s);
		Integer it = new Integer(i);
		Long lg = new Long(l);
		Float fl = new Float(f);
		Double de = new Double(d);
		
		//02:封装类转基本类型
		byte b1 = bt.byteValue();
		short s1 = sh.shortValue();
		int i1 = it.intValue();
		long l1 = lg.longValue();
		float f1 = fl.floatValue();
		double d1 = de.doubleValue();
		
		
	}
	
	
}
