package cn.gtmap.super_;

public class ADHero extends Hero{
	
	int moveSpeed = 400;
	
	public ADHero(){
		System.out.println("AD Hero无参的构造方法");
	}
	
	public ADHero(String name){
		super(name);
		System.out.println("AD Hero带一个参数的构造方法");
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2(){
		return super.moveSpeed;
	}
	
	public void useItem(Item i){
		System.out.println("adhero ues item");
		super.useItem(i);
	}
}
