package cn.gtmap.overload;

public class Supporter extends Hero {
	
	public void heal(){
		System.out.println( name + "������Ӣ�ۣ�����֪����˭");
		
	}
	
	public void heal(Hero h){
		System.out.println(name + "������" + h.name + "���Ӣ��");
	}
	
	public void heal(Hero h,int hp){
		System.out.println(name + "��" + h.name + "���Ӣ��" + "����" + hp + "��Ѫ");
	}
	
	public static void main(String[] args) {
		Supporter soraka = new Supporter();
		soraka.name = "����֮��-������";
		
		Hero garen = new Hero();
		garen.name = "����";
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		
		soraka.heal();
		soraka.heal(garen);
		soraka.heal(teemo, 20);
	}
	
}
