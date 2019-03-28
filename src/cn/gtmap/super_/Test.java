package cn.gtmap.super_;

public class Test {
	public static void main(String[] args) {
		ADHero ad = new ADHero("µÂÀ³ÎÄ");
		System.out.println(ad.getMoveSpeed());
		System.out.println(ad.getMoveSpeed2());
		
		LifePotion lp = new LifePotion();
		ad.useItem(lp);
	}
}
