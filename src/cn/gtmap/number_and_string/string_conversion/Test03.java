package cn.gtmap.number_and_string.string_conversion;

public class Test03 {
	public static void main(String[] args) {
		float f = 3.14f;
		//浮点数转字符串
		String s = String.valueOf(f);
		//字符串转浮点数
		f = Float.parseFloat(s);
		
		//如果字符串内容不是合法的数字表达，那么转换就会报错(抛出异常)
		Float.parseFloat("3.14a");
	}
}
