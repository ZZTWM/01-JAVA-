package cn.gtmap.variable;
/**
 * 作用域：字段、属性、Field、成员变量
 * @author Administrator
 *
 */
public class ActionScope01 {
	/**
	 * 1、字段、属性、Field、成员变量
	 */
	
	int i = 1;
	int j = i + 1;//其他的属性可以访问i
	
	public void method1(){
		System.out.println("method1打印的j:" + i);//方法1里可以访问i
	}
	
	public void method2(){
		System.out.println("method2打印的j:" + j);//方法1里可以访问j
	}
	
	public static void main(String[] args) {
		
		ActionScope01 actionScope = new ActionScope01();
		actionScope.method1();
		actionScope.method2();
		
	}

}
