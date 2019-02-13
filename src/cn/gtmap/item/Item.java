package cn.gtmap.item;
/**
 * 面向对象：类和对象
 * @author Administrator
 *
 */
public class Item {
	
	String name;
	int price;
	
	public static void main(String[] args) {
		Item bloodBottle = new Item();
		bloodBottle.name = "血瓶";
		bloodBottle.price = 50;
		
		Item grassShoes = new Item();
		grassShoes.name = "草鞋";
		grassShoes.price = 300;
		
		Item sword = new Item();
		sword.name = "长剑";
		sword.price = 350;
	}

}
