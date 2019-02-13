package cn.gtmap.variable;
/**
 * 作用域：局部变量
 * @author Administrator
 *
 */
public class ActionScope03 {
	
	public void method1(){
		int i = 5;//其作用范围是从声明的第6行，到其方法介绍的第20行位置
		System.out.println(i);
		//字块
		{
			System.out.println(i);//可以访问i
			int j= 6;
			System.out.println(j);//可以访问j
		}
		
		//System.out.println(j);//不能访问j,因为其作用域到第16行就结束了
	}
	
	public static void main(String[] args) {
		ActionScope03 actionScope = new ActionScope03();
		actionScope.method1();
	}

}
