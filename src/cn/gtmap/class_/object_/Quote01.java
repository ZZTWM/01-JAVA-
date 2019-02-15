package cn.gtmap.class_.object_;
/**
 * 引用：引用和指向
 *
 */
public class Quote01 {

	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	public static void main(String[] args) {
		//创建一个对象
		new Quote01();
		
		//使用一个引用来指向这个对象
		Quote01 q = new Quote01();
	}

}
