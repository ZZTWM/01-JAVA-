package cn.gtmap.interface_.inherit;

public class APADHero extends Hero implements AD, AP {

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}

}
