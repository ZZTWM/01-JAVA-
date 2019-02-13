package cn.gtmap.variable;
/**
 * 类型转换
 * @author Administrator
 *
 */
public class TypeConversion {

	public static void main(String[] args) {
		/**
		 * 1、转换规则
		 */
		char c1 ='A';
		short s1 = 80;
		s1 = (short)c1;
        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
		char c2 ='B';
		short s2 =90;
		c2 = (char)s2;
		//直接进行转换，会出现编译错误
		//s2 = c2;
		
		/**
		 * 2、低精度向高精度转换
		 */
		long l1 = 50L;
		int i1 = 50;
		//int比较小，要放进比较大的long,随便怎么样，都放的进去
		l1 = i1;
		
		long l2 = 60L;
		int i2 = 60;
		//但是将long类型赋值给int类型就需要强制转换
		i2 =(int)l2;
		
		/**
		 * 3、高精度向低精度转换
		 */
		byte b1 = 5;
		byte b2 = 6;
		int i3 = 10;
		int i4 = 300;
		
        //因为i3的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
		b1 = (byte) i3;
		System.out.println(b1);
		
        //因为i4的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i4的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
		b2 = (byte) i4;
		System.out.println(b2);
		
		//查看一个整数对应的二进制的方法：
		System.out.println(Integer.toBinaryString(i4));
		
		/**
		 * 4、练习-类型转换
		 */
		short a = 1;
		short b = 2;
		
		short c = (short) (a + b);
		
	}

}
