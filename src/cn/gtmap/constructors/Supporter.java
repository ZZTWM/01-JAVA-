package cn.gtmap.constructors;
/**
 * 练习：构造方法
 * @author Administrator
 *
 */
public class Supporter {
	
    String name; //姓名
    
    float hp; //血量 
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
    public Supporter(String heroName,float heroHp,float heroArmor,int heroMoveSpeed){
    	name = heroName;
    	hp = heroHp;
    	armor = heroArmor;
    	moveSpeed = heroMoveSpeed;
    }
	
	public static void main(String[] args) {
		
		Supporter soraka = new Supporter("索拉卡", 318, 20.5f, 305);
		
	}

}
