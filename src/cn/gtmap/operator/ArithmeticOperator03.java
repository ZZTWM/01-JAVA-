package cn.gtmap.operator;
/**
 * 4、任意运算单元的长度超过int
 * @author Administrator
 *
 */
public class ArithmeticOperator03 {
	int a = 5;
	long b = 6;
	int c = (int) (a + b);//a+b的运算结果是long型，所以要进行强制转换
	long d = a + b;
	
}
