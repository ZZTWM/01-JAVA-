package cn.gtmap.constructors;

public class ADHero {
	
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
	
    //����޲εĹ��췽���������д��
    //�ͻ�Ĭ���ṩһ���޲εĹ��췽��
    public ADHero(){
    	System.out.println("����ADHero�Ĺ��췽��");
    }
    
	public static void main(String[] args) {
		ADHero garen  = new ADHero();
        garen.name = "����";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        
        ADHero ez = new ADHero();
        ez.name = "�������";
        ez.hp = 616.28f;
        ez.armor = 27.536f;
        ez.moveSpeed = 350;
        
	}

}
