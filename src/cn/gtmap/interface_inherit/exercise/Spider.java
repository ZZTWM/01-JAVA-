package cn.gtmap.interface_inherit.exercise;

public class Spider extends Animal{

	protected Spider(int legs) {
		super(8);
		
	}

	@Override
	public void eat() {
		System.out.println("spider eating");
	}
	
}
