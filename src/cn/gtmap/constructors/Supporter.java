package cn.gtmap.constructors;
/**
 * ��ϰ�����췽��
 * @author Administrator
 *
 */
public class Supporter {
	
    String name; //����
    
    float hp; //Ѫ�� 
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    public Supporter(String heroName,float heroHp,float heroArmor,int heroMoveSpeed){
    	name = heroName;
    	hp = heroHp;
    	armor = heroArmor;
    	moveSpeed = heroMoveSpeed;
    }
	
	public static void main(String[] args) {
		
		Supporter soraka = new Supporter("������", 318, 20.5f, 305);
		
	}

}
