package cn.gtmap.number_and_string.boxing_and_unboxing;
/**
 * 自动拆箱
 * 不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
 *
 */
public class Test06 {
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
	
	//01：封装类转换为基本类型：不自动拆箱
	byte b1 = bt.byteValue();
	short s1 = sh.shortValue();
	int i1 = it.intValue();
	long l1 = lg.longValue();
	float f1 = fl.floatValue();
	double d1 = de.doubleValue();
	
	//02：封装类转为基本类型：自动拆箱
	byte b2 = bt;
	short s2 = sh;
	int i2 = it;
	long l2 = lg;
	float f2 = fl;
	double d2 = de;
	
}
