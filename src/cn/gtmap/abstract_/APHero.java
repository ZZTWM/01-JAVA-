package cn.gtmap.abstract_;

public class APHero extends Hero implements AP {

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void attack() {
		magicAttack();
	}

}
