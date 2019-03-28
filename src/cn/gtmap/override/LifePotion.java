package cn.gtmap.override;

public class LifePotion extends Item{
	//子类LifePotion继承Item,同时也提供了方法effect
	public void effect(){
		System.out.println("血瓶使用后，可以回血");
	}
	
	
}
