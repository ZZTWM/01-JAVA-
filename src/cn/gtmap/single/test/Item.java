package cn.gtmap.single.test;

/**
 * 单例模式：练习，使用懒汉式单例模式，把Item类改造成为单例模式
 * @author Administrator
 *
 */
public class Item {
	
	//构造方法私有化
	private Item(){
		
	}
	
	private static Item instance = new Item();
	
	public static Item getInstance(){
		
		if(null == instance){
			instance = new Item();
		}
		
		return instance;
	}
	
}
