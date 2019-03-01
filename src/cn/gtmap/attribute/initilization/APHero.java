package cn.gtmap.attribute.initilization;
/**
 * 练习：属性初始化：
 * 	对象属性的初始化有三种方式
 * 	故意把初始化块，放在构造方法下面，问题：
 * 	这三种方式，谁先执行？谁后执行？
 * @author Administrator
 *
 */
public class APHero {
	
	/**
	 * 在属性初始化的时候，调用这个方法的返回值。
	 * 观察这个方法的输出顺序
	 * @param pos
	 * @return
	 */
	
	public static String getName(String pos){
		String result = "name" + pos;
		System.out.println(result);
		return result;
	}
	
	public String name = APHero.getName("属性声明");
	
	public APHero(){
		name = APHero.getName("构造方法");
	}
	
	{
		name = APHero.getName("初始化块");
	}
	
	public static void main(String[] args) {
		new APHero();
	}
	
}
