package cn.gtmap.starving.single;

public class TestGiantDragon {
	
	public static void main(String[] args) {
		//通过new实例化会报错
		//GiantDragon g = new GiantDragon();
		//只能通过getInstance得到对象
		
		GiantDragon g1 = GiantDragon.getInstance();
		GiantDragon g2 = GiantDragon.getInstance();
		GiantDragon g3 = GiantDragon.getInstance();
		
		System.out.println(g1 == g2);//true
		
		System.out.println(g2 == g3);//true
	}
	
}
