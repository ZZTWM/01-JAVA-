package cn.gtmap.biography;

/**
 * 基本类型传参:在方法内，无法修改方法外的基本类型参数
 * @author Administrator
 *
 */
public class Hero {

    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    public Hero(){
    	
    }
    
   
    public Hero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //回血
    //在方法内，无法修改方法外的基本类型参数
    public void recovery(int xp){
    	hp = hp + xp;
    	xp = 0;
    }
	
	public static void main(String[] args) {
		Hero teemo = new Hero("提莫",383);
		//血瓶，其值是100
		int bloodVial = 100;
		
		//提莫通过这个血瓶回血
		teemo.recovery(bloodVial);
		
		System.out.println(bloodVial);//这里的bloodVial是方法外的参数，无法修改，所以输出是100
		
		System.out.println(teemo.hp);
	}

}
