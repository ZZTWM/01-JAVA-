package cn.gtmap.constructors;

public class APADHero {

    String name; //姓名
    
    float hp; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
    //带一个参数的构造方法
    public APADHero(String heroName){
    	name = heroName;
    }
    
    //带两个参数的构造方法
    public APADHero(String heroName,float heroHp){
    	name = heroName;
    	hp = heroHp;
    }
	
	public static void main(String[] args) {
		
		APADHero bh = new APADHero("女枪");
		APADHero ez = new APADHero("伊泽瑞尔",383);
		
	}

}
