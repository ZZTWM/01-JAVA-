package cn.gtmap.constructors;

public class APADHero {

    String name; //����
    
    float hp; //Ѫ��
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public APADHero(String heroName){
    	name = heroName;
    }
    
    //�����������Ĺ��췽��
    public APADHero(String heroName,float heroHp){
    	name = heroName;
    	hp = heroHp;
    }
	
	public static void main(String[] args) {
		
		APADHero bh = new APADHero("Ůǹ");
		APADHero ez = new APADHero("�������",383);
		
	}

}
