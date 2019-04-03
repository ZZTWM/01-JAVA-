package cn.gtmap.interface_inherit.exercise;

public class Fish extends Animal implements Pet{

	private String name;
	
	public Fish(){
		super(0);
	}
	
	protected Fish(int legs) {
		super(0);
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void play() {
		System.out.println("playing");
	}

	@Override
	public void eat() {
		System.out.println("Fish is eating");
	}
	
	
	
}	
