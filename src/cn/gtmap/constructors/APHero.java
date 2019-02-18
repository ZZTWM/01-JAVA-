package cn.gtmap.constructors;

public class APHero {

    String name; //姓名
    
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
    
    //有参的构造方法
    //默认的无参的构造方法就失效了
    public APHero(String heroName){
    	name = heroName;
    }
	
	public static void main(String[] args) {
		APHero rz = new APHero("瑞兹");
		
		//若不显示声明无参构造方法，这里机会失效
		//APHero teemo = new APHero();////无参的构造方法“木有了”
	}

}
