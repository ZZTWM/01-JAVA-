package cn.gtmap.super_;

public class Hero {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed = 20; //�ƶ��ٶ�
    
    public Hero(){
    	System.out.println("Hero���޲ι��췽��");
    }
    
    public Hero(String name){
    	System.out.println("Hero��һ���в����Ĺ��췽��");
    	this.name = name;
    }
    
    public void useItem(Item i){
    	System.out.println("hero use item");
    	i.effect();
    }
    
    
}
