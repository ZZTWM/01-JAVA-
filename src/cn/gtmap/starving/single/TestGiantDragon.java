package cn.gtmap.starving.single;

public class TestGiantDragon {
	
	public static void main(String[] args) {
		//ͨ��newʵ�����ᱨ��
		//GiantDragon g = new GiantDragon();
		//ֻ��ͨ��getInstance�õ�����
		
		GiantDragon g1 = GiantDragon.getInstance();
		GiantDragon g2 = GiantDragon.getInstance();
		GiantDragon g3 = GiantDragon.getInstance();
		
		System.out.println(g1 == g2);//true
		
		System.out.println(g2 == g3);//true
	}
	
}
