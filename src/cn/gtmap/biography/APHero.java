package cn.gtmap.biography;

public class APHero {
	/**
	 * 在方法中，使参数引用指向一个新的对象
	 * 外面的引用是指向原来的对象？还是新的对象？
	 */
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    public APHero(){
    	
    }
    
    public APHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //复活
    public void revive(APHero apHero){
    	apHero = new APHero("提莫",383);
    }
    
	public static void main(String[] args) {
		APHero teemo = new APHero("提莫",383);
		
		//受到400伤害，挂了
		teemo.hp = teemo.hp - 400;
		teemo.revive(teemo);
		
		System.out.println(teemo.hp);
	}

}
