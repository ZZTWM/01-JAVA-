package cn.gtmap.object_.casting;

public class Hero {
	
	public String name;
	protected float hp;
	
	public static void main(String[] args) {
		
		Hero h = new Hero();
		ADHero ad = new ADHero();
		Support s = new Support();
		/**
		 * 1������ת���ࡾ����ת�͡��Լ�����ת���ࡾ����ת�͡�
		 */
		//h = ad;
		//ad = (ADHero) h;
		
		//h = s;
		//ad = (ADHero) h;
		
		/**
		 * 2��û�м̳й�ϵ�������࣬����ת��
		 * û�м̳й�ϵ�����ͽ��л���ת��һ����ʧ�ܣ����Ի���ֱ������
		 */
		APHero ap = new APHero();
		//ad = (ADHero)ap;
		
		
		/**
		 * instanceof
		 */
		Hero h1 = ad;
		Hero h2 = ap;
		
		System.out.println(h1 instanceof ADHero);
		System.out.println(h2 instanceof APHero);
		System.out.println(h1 instanceof Hero);
	}

}
