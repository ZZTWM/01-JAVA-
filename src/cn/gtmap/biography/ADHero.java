package cn.gtmap.biography;

public class ADHero {
	
    String name; // ����
    
    float hp; // Ѫ��
 
    float armor; // ����
 
    int moveSpeed; // �ƶ��ٶ�
    
    public ADHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //����һ��Ӣ�ۣ���������damage��Ѫ
    public void attack(ADHero adHero,int damage){
    	adHero.hp = adHero.hp - damage;
    }
    
	public static void main(String[] args) {
		ADHero ez = new ADHero("�������", 383);
		ADHero bh = new ADHero("�ͽ�����", 456);
		
		bh.attack(ez, 100);
		
		System.out.println(ez.hp);
	}

}
