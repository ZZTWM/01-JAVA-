package cn.gtmap.item;
/**
 * ���������Ͷ���
 * @author Administrator
 *
 */
public class Item {
	
	String name;
	int price;
	
	public static void main(String[] args) {
		Item bloodBottle = new Item();
		bloodBottle.name = "Ѫƿ";
		bloodBottle.price = 50;
		
		Item grassShoes = new Item();
		grassShoes.name = "��Ь";
		grassShoes.price = 300;
		
		Item sword = new Item();
		sword.name = "����";
		sword.price = 350;
	}

}
