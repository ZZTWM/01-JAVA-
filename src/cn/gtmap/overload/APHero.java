package cn.gtmap.overload;
/**
 * 继承：可变数量的参数
 *
 */
public class APHero extends Hero{
	
	public void attack(){
		System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
	}
	 
	//可变数量的参数
	public void attack(Hero ...heros){
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "攻击了" + heros[i].name);
		}
	}
	
	public static void main(String[] args) {
		APHero rz = new APHero();
		rz.name = "瑞兹";
		
		Hero garen = new Hero();
		garen.name = "盖伦";
		Hero teemo = new Hero();
		teemo.name = "提莫";
		
		rz.attack();
		rz.attack(garen);
		rz.attack(garen,teemo);
	}

}
