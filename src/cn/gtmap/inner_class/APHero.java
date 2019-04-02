package cn.gtmap.inner_class;

public abstract class APHero {
    String name; //姓名  
    float hp; //血量         
    float armor; //护甲         
    int moveSpeed; //移动速度
    
    public abstract void attack();
    
    public static void main(String[] args) {
    	
    	//当前APHero为抽象类，不可以直接实例化，必须得新建一个子类
		//APHero aph = new APHero();
		
    	APHero aph = new APHero(){

			@Override
			public void attack() {
				System.out.println("新的进攻手段");
			}
    		
    	};
    	
    	aph.attack();
    	System.out.println(aph);
	}
    
}
