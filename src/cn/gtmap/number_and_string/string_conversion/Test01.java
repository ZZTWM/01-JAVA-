package cn.gtmap.number_and_string.string_conversion;

/**
 * 数字转字符串
 * 方法1： 使用String类的静态方法valueOf 
 * 方法2： 先把基本类型装箱为对象，然后调用对象的toString
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int i1 = 5;
		//方法1
		String str1 = String.valueOf(i1);
		//方法2
		int i2 = 6;
		Integer it = i2;
		String str2 = it.toString();
		
		System.out.println(str1 + str2);
	}
}
