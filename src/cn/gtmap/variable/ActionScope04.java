package cn.gtmap.variable;
/**
 * 作用域：练习
 * @author Administrator
 *
 */
public class ActionScope04 {
	int i = 1;//属性名是i
	
	public void method1(int i){//参数也是i
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ActionScope04 actionScope = new ActionScope04();
		//输出是5，当访问的变量被多个作用域影响的时候，按照就近原则取
		actionScope.method1(5);
	}

}
