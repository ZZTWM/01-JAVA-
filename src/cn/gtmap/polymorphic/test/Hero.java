package cn.gtmap.polymorphic.test;

public class Hero implements Mortal{
	String name;
	float hp;
	@Override
	public void die() {
		System.out.println("Ӣ������");
	}
	
	public void kill(Mortal m){
		m.die();
	}
}
