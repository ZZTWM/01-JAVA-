package cn.gtmap.this_;
/**
 * 通过this调用其他的构造方法
 * @author Administrator
 *
 */
public class APHero {
	
    String name; //姓名
    
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
    
    //带一个参数的构造方法
    public APHero(String name){
    	System.out.println("一个参数的构造方法");
    	this.name = name;
    }
    
    //代两个参数的构造方法
    public APHero(String name,float hp){
    	this(name);
    	System.out.println("两个参数的构造方法");
    	this.hp = hp;
    }
    
	public static void main(String[] args) {
		APHero teemo = new APHero("提莫",383);
		System.out.println(teemo.name);
	}

}
