package cn.gtmap.inner_class;

public class ADHero {
	
	public String name;
	protected float hp;
	private static void battleWin(){
		System.out.println("battle win");
	}
	
	//�з���ˮ��
	static class EnemyCrystal{
		int hp = 5000;
		
		//���ˮ����Ѫ��Ϊ0��������ʤ��
		public void checkIfVictory(){
			if(hp == 0){
				ADHero.battleWin();
				
				//��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
				//System.out.println(name + "win this game");
			}else{
				System.out.println("battle not win");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		ADHero.EnemyCrystal enemyCrystal = new ADHero.EnemyCrystal();
		enemyCrystal.checkIfVictory();
	}
	
}
