package cn.gtmap.constructors;

public class APHero {

    String name; //����
    
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�
    
    //�вεĹ��췽��
    //Ĭ�ϵ��޲εĹ��췽����ʧЧ��
    public APHero(String heroName){
    	name = heroName;
    }
	
	public static void main(String[] args) {
		APHero rz = new APHero("����");
		
		//������ʾ�����޲ι��췽�����������ʧЧ
		//APHero teemo = new APHero();////�޲εĹ��췽����ľ���ˡ�
	}

}
