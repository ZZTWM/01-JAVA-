package cn.gtmap.class_.object_;

/**
 * 引用：多个引用，一个对象
 *
 */
public class Quote02 {
	
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	public static void main(String[] args) {
		Quote02 q1 = new Quote02();
		Quote02 q2 = q1;//q2指向q1所指向的对象
		Quote02 q3 = q1;
		Quote02 q4 = q1;
		Quote02 q5 = q4;
		
		//q1、q2、 q3 、q4、 q5 五个引用都指向同一个对象
	}

}
