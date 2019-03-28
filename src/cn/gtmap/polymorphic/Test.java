package cn.gtmap.polymorphic;

public class Test {
	public static void main(String[] args) {
		Item lp = new LifePotion();
		Item mp = new MagicPotion();
		lp.effect();
		mp.effect();
		
		/**
		 * 不使用多态
		 */
		Hero garen  = new Hero();
		garen.name = "盖伦";
		
		LifePotion lp1 = new LifePotion();
		MagicPotion mp1 = new MagicPotion();
		
		garen.useLifePotion(lp1);
		garen.useMagicPotion(mp1);
		
		/**
		 * 使用多态
		 */
		Hero teemo = new Hero();
		teemo.name = "提莫";
		LifePotion lp2 = new LifePotion();
		MagicPotion mp2 = new MagicPotion();
		
		teemo.useItem(lp2);
		teemo.useItem(mp2);
		
	}
}
