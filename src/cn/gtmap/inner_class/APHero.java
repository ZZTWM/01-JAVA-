package cn.gtmap.inner_class;

public abstract class APHero {
    String name; //����  
    float hp; //Ѫ��         
    float armor; //����         
    int moveSpeed; //�ƶ��ٶ�
    
    public abstract void attack();
    
    public static void main(String[] args) {
    	
    	//��ǰAPHeroΪ�����࣬������ֱ��ʵ������������½�һ������
		//APHero aph = new APHero();
		
    	APHero aph = new APHero(){

			@Override
			public void attack() {
				System.out.println("�µĽ����ֶ�");
			}
    		
    	};
    	
    	aph.attack();
    	System.out.println(aph);
	}
    
}
