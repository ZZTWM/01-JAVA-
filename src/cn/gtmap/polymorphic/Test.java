package cn.gtmap.polymorphic;

public class Test {
	public static void main(String[] args) {
		Item lp = new LifePotion();
		Item mp = new MagicPotion();
		lp.effect();
		mp.effect();
		
		/**
		 * ��ʹ�ö�̬
		 */
		Hero garen  = new Hero();
		garen.name = "����";
		
		LifePotion lp1 = new LifePotion();
		MagicPotion mp1 = new MagicPotion();
		
		garen.useLifePotion(lp1);
		garen.useMagicPotion(mp1);
		
		/**
		 * ʹ�ö�̬
		 */
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		LifePotion lp2 = new LifePotion();
		MagicPotion mp2 = new MagicPotion();
		
		teemo.useItem(lp2);
		teemo.useItem(mp2);
		
	}
}
