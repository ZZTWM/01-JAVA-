package cn.gtmap.super_;

public class ADHero extends Hero{
	
	int moveSpeed = 400;
	
	public ADHero(){
		System.out.println("AD Hero�޲εĹ��췽��");
	}
	
	public ADHero(String name){
		super(name);
		System.out.println("AD Hero��һ�������Ĺ��췽��");
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
