package cn.gtmap.class_.method;

public class Hero {
	
	public String name;
	protected float hp;
	
    //ʵ������,���󷽷����Ǿ�̬����
    //�����ж�����ܹ�����
	public void die(){
		hp = 0;
	}
    //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
	public static void battleWin(){
		System.out.println("battle win");
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.die();
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		
		teemo.battleWin();
		
		//�������ֱ��ͨ�������
		Hero.battleWin();
	}
}
