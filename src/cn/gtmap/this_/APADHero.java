package cn.gtmap.this_;
/**
 * ��ϰ-���췽��(this)
 * @author Administrator
 *
 */
public class APADHero {
	
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    
    //���������Ĺ��췽��
    public APADHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //�ĸ������Ĺ��췽��
    public APADHero(String name,float hp,float armor,int moveSpeed){
    	this(name,hp);
    	this.armor = armor;
    	this.moveSpeed = moveSpeed;
    }
    
	public static void main(String[] args) {
		
	}

}
