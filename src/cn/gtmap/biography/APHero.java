package cn.gtmap.biography;

public class APHero {
	/**
	 * �ڷ����У�ʹ��������ָ��һ���µĶ���
	 * �����������ָ��ԭ���Ķ��󣿻����µĶ���
	 */
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    public APHero(){
    	
    }
    
    public APHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //����
    public void revive(APHero apHero){
    	apHero = new APHero("��Ī",383);
    }
    
	public static void main(String[] args) {
		APHero teemo = new APHero("��Ī",383);
		
		//�ܵ�400�˺�������
		teemo.hp = teemo.hp - 400;
		teemo.revive(teemo);
		
		System.out.println(teemo.hp);
	}

}
