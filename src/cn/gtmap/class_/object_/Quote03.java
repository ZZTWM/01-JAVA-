package cn.gtmap.class_.object_;

/**
 * 一个引用，多个对象
 *
 */
public class Quote03 {
	
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	public static void main(String[] args) {
		/**
		 * 第22行，引用quote指向新创建的对象（对象1）
		 * 第23行，同一个引用quote指向新创建的对象（对象2）
		 * 这个时候，对象1，就没有任何引用指向了
		 * 换句话说，就没有任何手段控制和访问该对象，那么该对象就变得没有意义。
		 */
		//一个引用同一时间只能指向一个对象
		Quote03 quote = new Quote03();
		quote  = new Quote03();
	}

}
