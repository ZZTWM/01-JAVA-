package cn.gtmap.biography;

/**
 * �������ʹ���:�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
 * @author Administrator
 *
 */
public class Hero {

    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    public Hero(){
    	
    }
    
   
    public Hero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //��Ѫ
    //�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
    public void recovery(int xp){
    	hp = hp + xp;
    	xp = 0;
    }
	
	public static void main(String[] args) {
		Hero teemo = new Hero("��Ī",383);
		//Ѫƿ����ֵ��100
		int bloodVial = 100;
		
		//��Īͨ�����Ѫƿ��Ѫ
		teemo.recovery(bloodVial);
		
		System.out.println(bloodVial);//�����bloodVial�Ƿ�����Ĳ������޷��޸ģ����������100
		
		System.out.println(teemo.hp);
	}

}
