package cn.gtmap.this_;
/**
 * ͨ��this���������Ĺ��췽��
 * @author Administrator
 *
 */
public class APHero {
	
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public APHero(String name){
    	System.out.println("һ�������Ĺ��췽��");
    	this.name = name;
    }
    
    //�����������Ĺ��췽��
    public APHero(String name,float hp){
    	this(name);
    	System.out.println("���������Ĺ��췽��");
    	this.hp = hp;
    }
    
	public static void main(String[] args) {
		APHero teemo = new APHero("��Ī",383);
		System.out.println(teemo.name);
	}

}
