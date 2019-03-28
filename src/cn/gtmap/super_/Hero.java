package cn.gtmap.super_;

public class Hero {
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed = 20; //移动速度
    
    public Hero(){
    	System.out.println("Hero的无参构造方法");
    }
    
    public Hero(String name){
    	System.out.println("Hero的一个有参数的构造方法");
    	this.name = name;
    }
    
    public void useItem(Item i){
    	System.out.println("hero use item");
    	i.effect();
    }
    
    
}
