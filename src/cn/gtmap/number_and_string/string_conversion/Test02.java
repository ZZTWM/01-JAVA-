package cn.gtmap.number_and_string.string_conversion;

/**
 * 字符串转数字
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "999";
		
		//调用Integer的静态方法parseInt
		int i = Integer.parseInt(str);
		
		System.out.println(i + 1);
	}
}
