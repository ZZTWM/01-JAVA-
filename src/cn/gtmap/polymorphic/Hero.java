package cn.gtmap.polymorphic;

public class Hero {
	public String name;
	protected float hp;
	
	public void useLifePotion(LifePotion lp){
		lp.effect();
	}
	
	public void useMagicPotion(MagicPotion mp){
		mp.effect();
	}
	
	public void useItem(Item i){
		i.effect();
	}
}
