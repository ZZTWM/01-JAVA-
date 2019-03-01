package cn.gtmap.attribute.initilization;
/**
 * 1、对象属性初始化
 * @author Administrator
 *
 */
public class Hero {
	public String name = "some hero";
	protected float hp;
	float maxHp;
	
	{
		maxHp = 200;
	}
	
	public Hero(){
		hp = 100;//构造方法中初始化
	}
	
}
