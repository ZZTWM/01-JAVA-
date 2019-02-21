package cn.gtmap.this_;
/**
 * 练习-构造方法(this)
 * @author Administrator
 *
 */
public class APADHero {
	
    String name; //姓名
    
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
    
    //两个参数的构造方法
    public APADHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //四个参数的构造方法
    public APADHero(String name,float hp,float armor,int moveSpeed){
    	this(name,hp);
    	this.armor = armor;
    	this.moveSpeed = moveSpeed;
    }
    
	public static void main(String[] args) {
		
	}

}
