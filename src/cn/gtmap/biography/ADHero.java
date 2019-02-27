package cn.gtmap.biography;

public class ADHero {
	
    String name; // 姓名
    
    float hp; // 血量
 
    float armor; // 护甲
 
    int moveSpeed; // 移动速度
    
    public ADHero(String name,float hp){
    	this.name = name;
    	this.hp = hp;
    }
    
    //攻击一个英雄，并让他掉damage点血
    public void attack(ADHero adHero,int damage){
    	adHero.hp = adHero.hp - damage;
    }
    
	public static void main(String[] args) {
		ADHero ez = new ADHero("伊泽瑞尔", 383);
		ADHero bh = new ADHero("赏金猎人", 456);
		
		bh.attack(ez, 100);
		
		System.out.println(ez.hp);
	}

}
