package cn.gtmap.class_.attribute;
/**
 * ������
 * @author Administrator
 *
 */
public class Hero {
	
	public String name;//ʵ�����ԣ��������ԣ��Ǿ�̬����
	protected float hp;
	static String copyright;//�����ԣ���̬����
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		Hero.copyright = "��Ȩ��Riot Games��˾����";
		
		System.out.println(garen.name);
		System.out.println(Hero.copyright);
		
		garen.copyright = "����";
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		System.out.println(teemo.name);
		System.out.println(Hero.copyright);
	}
	
}
