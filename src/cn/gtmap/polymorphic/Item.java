package cn.gtmap.polymorphic;

public class Item {
	public String name;
	public int price;

	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
}
