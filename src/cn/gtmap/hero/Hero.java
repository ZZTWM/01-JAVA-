package cn.gtmap.hero;
/**
 * 面向对象：类和对象
 * @author Administrator
 *
 */
public class Hero {
	
	String name;//姓名
	
	float hp;//血量
	
	float armor;//护甲
	
	int moveSpeed;//移动速度
	
	int killed;//被杀人数
	int kill;//杀人数
	int support;//助攻数
	int money;//金钱
	float attackSpeed;//攻击速度
	String wordAfterKill;//杀人后说的话
	String wordAfterKilled;//被杀后说的话
	
	//获取护甲值
	float getArmor(){
		return armor;
	}
	
	//坑队友
	void keng(){
		System.out.println("坑队友");
	}
	
	//增加移动速度
	void addSpeed(int speed){
		//在原来的基础上增加移动速度
		moveSpeed = moveSpeed + speed;
	}
	
	//超神 legendary(),无参数，无返回类型
	void legendary(){
		System.out.println("超神");
	}
	
	//获取当前的血量 getHp(), 无参数，有float类型的返回值
	float getHp(){
		return hp;
	}
	
	//回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
	void recovery(float blood){
		hp = hp + blood;
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name ="盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		System.out.println(garen.name + "当前的移动速度是：" + garen.moveSpeed);
		garen.addSpeed(100);
		System.out.println("现在的移动速度是：" + garen.moveSpeed);
		
		System.out.println("------------------------------------------");
		
		System.out.println(garen.name + "当前的血量是：" +garen.hp);
		garen.recovery(20);
		System.out.println("现在的血量是：" + garen.hp);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 145.6f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
		
		
	}
}
