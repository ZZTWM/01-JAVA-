package cn.gtmap.variable;

/**
 * 作用域：参数
 * @author Administrator
 *
 */
public class ActionScope02 {
	/**
	 * 2、参数
	 */
	int i = 6;
	public void method1(int i){
		//i =1;
		System.out.println("method1的参数i:" + i);
		
	}
	
	public void method2(int i){
		//i = 5;
		System.out.println("method2的参数i:" + i);//method2 不能访问参数i,会报错
	}
	
	int j = i;//类里面也不能访问参数i
	
	public static void main(String[] args) {
		ActionScope02 actionScope = new ActionScope02();
		System.out.println("此时i是类属性，需要使用对象.属性来调用：" + actionScope.i);
		
		actionScope.method1(100);
		actionScope.method2(200);
	}

}
