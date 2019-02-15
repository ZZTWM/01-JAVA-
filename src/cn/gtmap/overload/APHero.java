package cn.gtmap.overload;
/**
 * �̳У��ɱ������Ĳ���
 *
 */
public class APHero extends Hero{
	
	public void attack(){
		System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
	}
	 
	//�ɱ������Ĳ���
	public void attack(Hero ...heros){
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "������" + heros[i].name);
		}
	}
	
	public static void main(String[] args) {
		APHero rz = new APHero();
		rz.name = "����";
		
		Hero garen = new Hero();
		garen.name = "����";
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		
		rz.attack();
		rz.attack(garen);
		rz.attack(garen,teemo);
	}

}
