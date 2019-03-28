package cn.gtmap.polymorphic.test;

public class Test {
	public static void main(String[] args) {
		Hero garen  = new Hero();
		garen.name = "¸ÇÂ×";
		
		ADHero ez = new ADHero();
		APHero annie = new APHero();
		APADHero bh = new APADHero();
		
		garen.kill(ez);
		garen.kill(annie);
		garen.kill(bh);
		
	}
}
