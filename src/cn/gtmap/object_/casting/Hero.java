package cn.gtmap.object_.casting;

public class Hero {
	
	public String name;
	protected float hp;
	
	public static void main(String[] args) {
		
		Hero h = new Hero();
		ADHero ad = new ADHero();
		Support s = new Support();
		/**
		 * 1、子类转父类【向上转型】以及父类转子类【向下转型】
		 */
		//h = ad;
		//ad = (ADHero) h;
		
		//h = s;
		//ad = (ADHero) h;
		
		/**
		 * 2、没有继承关系的两个类，互相转换
		 * 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
		 */
		APHero ap = new APHero();
		//ad = (ADHero)ap;
		
		
		/**
		 * instanceof
		 */
		Hero h1 = ad;
		Hero h2 = ap;
		
		System.out.println(h1 instanceof ADHero);
		System.out.println(h2 instanceof APHero);
		System.out.println(h1 instanceof Hero);
	}

}
