package cn.gtmap.this_;
/**
 * 通过this关键字访问对象属性
 * @author Administrator
 *
 */
public class ADHero {
    String name; //姓名
    
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
    
    //参数名和属性名一样
    //在方法体中，只能访问到参数name
    public void setName1(String name){
    	name = name;
    }
    
    //为了避免setName1中的问题，参数名不得不使用其他变量名
    public void setName2(String heroName){
    	name = heroName;
    }
    
    public void setName3(String name){
    	//name代表的是参数name
    	//this.name代表的是属性name
    	this.name = name;
    }
    
	public static void main(String[] args) {
		ADHero ez = new ADHero();
		ez.setName1("伊泽瑞尔");
		System.out.println(ez.name);//null
		
		ADHero bh = new ADHero();
		bh.setName2("赏金猎人");
		System.out.println(bh.name);
		
		ADHero vn = new ADHero();
		vn.setName3("薇恩");
		System.out.println(vn.name);
	}

}
