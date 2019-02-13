package cn.gtmap.variable;
/**
 * 命名规则
 * @author Administrator
 *
 */
public class NamingRules {

	public static void main(String[] args) {
		/**
		 * 1、命名规则
		 */
		int a1 = 5;
		int a_12 = 5;
		int $a43 = 5;
		int a434 = 5;
		int _3a4 = 5;
		//第一个是数字，是不行的
		//int 3_a$4 = 5;
		
		/**
		 * 2、使用完整的单词命名，而非缩写
		 */
		//使用完整单词命名，易于理解
		String name;
		float hp;
		float armor;
		int moveSpeed;
		//使用缩写，不易理解
		String n;
		float h;
		float a;
		int m;
		
		/**
		 * 3、不能只使用关键字，但可以包含关键字
		 */
		//int class = 5;//class是关键字报错
		int class5 = 5;
		
		/**
		 * 6、中文也是可以用来命名变量的
		 */
		NamingRules 命名规则 = new NamingRules();
		命名规则.什么是命名规则();
		
		/**
		 * 7、练习-命名规范
		 */
		int a_;
		//int a@;//不可以
		int a3;
		//int 8@;//不可以
		//int 9_;//不可以
		int X$_;
		int y;
		int _$_;
		//int $*$;//不可以
		int $1$;
		int _1_;
		//int _@_;//不可以
		//int a#;//不可以
		//int a";//不可以
		//int 123a;//不可以
		//int 123a_;//不可以
		int $123b_;
		
	}
	
	public void 什么是命名规则(){
		System.out.println("变量命名必须满足一系列的条件，不能随意命名");
	}
	
}
