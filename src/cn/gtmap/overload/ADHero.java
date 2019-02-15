package cn.gtmap.overload;

public class ADHero extends Hero{
	
	public void attack(){
		System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
	}
	
	public void attack(Hero h1){
		System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
	}
	
	public void attack(Hero h1,Hero h2){
		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
	}
	
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "赏金猎人";
		Hero garen = new Hero();
		garen.name = "盖伦";
		Hero teemo = new Hero();
		teemo.name = "提莫";
		
		bh.attack();
		bh.attack(garen);
		bh.attack(teemo, garen);
	}
	
}
