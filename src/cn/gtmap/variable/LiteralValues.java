package cn.gtmap.variable;
/**
 * 字面值
 * @author Administrator
 *
 */
public class LiteralValues {

	public static void main(String[] args) {
		/**
		 * 1、整数字面值：
		 */
		long val = 26L;
		//int val1 = 26L;//报错
		int decVal = 26;//默认就是int 类型
		int hexVal = 0x1a;//16进制
		int oxVal = 032;//8进制
		int binVal = 0b11010;//2进制
		System.out.println("默认十进制：" + decVal);
		System.out.println("十六进制：" + hexVal);
		System.out.println("八进制：" + oxVal);
		System.out.println("二进制：" + binVal);
		
		/**
		 * 2、浮点数字面值
		 */
		float f1 = 123.4F;//以F结尾的字面值表示float类型
		double d1 = 123.4;//默认就是double类型
		double d2 = 1.234e2;//科学计数法表示double
		
		/**
		 * 3、字符和字符串字面值
		 */
		String name = "盖伦";
		char a = 'c';
		
		//以下是转义字符
		char tab = '\t';//制表符
		char carriageReturn = '\r';//回车
		char newLine ='\n';//换行
		char doubleQuote ='\"';//双引号
		char singleQuote ='\'';//单引号
		char backslash ='\\';//反斜杠
		
		/**
		 * 4、练习-字面值
		 */
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4L;
		float f = 3.14f;
		double d = 3.14;
		char c = '中';
		String str = "中国";
		
	}

}
