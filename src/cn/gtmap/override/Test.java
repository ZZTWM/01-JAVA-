package cn.gtmap.override;

public class Test {

	/**
	 * 调用重写的方法
		调用就会执行重写的方法，而不是从父类的方法
		所以LifePotion的effect会打印：
		"血瓶使用后，可以回血"
	 * @param args
	 */
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}

}
