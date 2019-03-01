package cn.gtmap.attribute.initilization;
/**
 * 类属性初始化
 * @author Administrator
 *
 */
public class ADHero {
	
	public String name;
	protected float hp;
	float maxHp;
	
	public static int itemCapacity = 8;//声明的时候 初始化
	
	static{
		itemCapacity = 6;//静态初始化块 初始化
	}
	
	public ADHero(){
		
	}
	
	public static void main(String[] args) {
		System.out.println(ADHero.itemCapacity);
	}
	
}
