package cn.gtmap.abstract_;

public class APADHero extends Hero implements AD,AP{

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");	
	}

	@Override
	public void attack() {
		physicAttack();
		magicAttack();
	}
	
}
