package cn.gtmap.abstract_;

public class APADHero extends Hero implements AD,AP{

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");	
	}

	@Override
	public void attack() {
		physicAttack();
		magicAttack();
	}
	
}
