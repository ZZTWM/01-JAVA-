package cn.gtmap.enumeration;

public class Test01 {
	public static void main(String[] args) {
		HeroType heroType = HeroType.TANK;
		switch(heroType){
		case TANK:
			System.out.println("̹��");
			break;
		case ASSASSIN:
			System.out.println("�̿�");
			break;
		case ASSIST:
			System.out.println("����");
			break;
		case FARMING:
			System.out.println("��Ұ");
			break;
		case PANGED:
			System.out.println("Զ��");
			break;
		case PUSH:
			System.out.println("�ƽ�");
			break;
		case WARRIOR:
			System.out.println("��ս");
			break;
		case WIZARD:
			System.out.println("��ʦ");
			break;
		}
		
		
	}
}
