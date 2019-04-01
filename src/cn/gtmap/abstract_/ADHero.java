package cn.gtmap.abstract_;

public class ADHero extends Hero implements AD{

	@Override
	public void attack() {
		physicAttack();
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
}
