package cn.gtmap.overload;

public class Supporter extends Hero {
	
	public void heal(){
		System.out.println( name + "治疗了英雄，但不知道是谁");
		
	}
	
	public void heal(Hero h){
		System.out.println(name + "治疗了" + h.name + "这个英雄");
	}
	
	public void heal(Hero h,int hp){
		System.out.println(name + "给" + h.name + "这个英雄" + "回了" + hp + "点血");
	}
	
	public static void main(String[] args) {
		Supporter soraka = new Supporter();
		soraka.name = "众星之子-索拉卡";
		
		Hero garen = new Hero();
		garen.name = "盖伦";
		Hero teemo = new Hero();
		teemo.name = "提莫";
		
		soraka.heal();
		soraka.heal(garen);
		soraka.heal(teemo, 20);
	}
	
}
