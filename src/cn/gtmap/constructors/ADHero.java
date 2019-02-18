package cn.gtmap.constructors;

public class ADHero {
	
    String name; //姓名
    
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
	
    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    public ADHero(){
    	System.out.println("调用ADHero的构造方法");
    }
    
	public static void main(String[] args) {
		ADHero garen  = new ADHero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        
        ADHero ez = new ADHero();
        ez.name = "伊泽瑞尔";
        ez.hp = 616.28f;
        ez.armor = 27.536f;
        ez.moveSpeed = 350;
        
	}

}
