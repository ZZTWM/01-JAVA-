package cn.gtmap.overload;

public class ADHero extends Hero{
	
	public void attack(){
		System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
	}
	
	public void attack(Hero h1){
		System.out.println(name + "��" + h1.name + "������һ�ι��� ");
	}
	
	public void attack(Hero h1,Hero h2){
		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
	}
	
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "�ͽ�����";
		Hero garen = new Hero();
		garen.name = "����";
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		
		bh.attack();
		bh.attack(garen);
		bh.attack(teemo, garen);
	}
	
}
