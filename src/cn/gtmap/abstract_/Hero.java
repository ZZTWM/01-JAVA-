package cn.gtmap.abstract_;

public abstract class Hero {
    String name;
    
    float hp;
 
    float armor;
 
    int moveSpeed;
    
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    public abstract void attack();
    
    public static void main(String[] args) {
    	//虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
		//Hero hero = new Hero();
	}
}
