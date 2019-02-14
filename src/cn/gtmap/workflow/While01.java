package cn.gtmap.workflow;
/**
 * while和do-while循环语句
 * @author Administrator
 *
 */
public class While01 {

	public static void main(String[] args) {
		/**
		 * 1、while
		 */
		int i = 0;
		while (i < 5){
			System.out.println(i);
			i++;
		}
		
		System.out.println("--------我是分割线------------");
		/**
		 * do-while
		 */
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
		int j = 0;
		do{
			System.out.println(j);
			j++;
		}while(j < 5);
		
	}

}
