package cn.gtmap.single.test;

/**
 * 练习：单例模式，使用饿汉式单例模式，把Hero类改造成为单例模式
 * @author Administrator
 *
 */
public class Hero {
	
	//构造方法私有化
	private Hero(){
		
	}
	
	//静态属性指向实例
	private static Hero instance = new Hero();
	
	//public static的getInstance
	public static Hero getInstance(){
		return instance;
	}
	
}
