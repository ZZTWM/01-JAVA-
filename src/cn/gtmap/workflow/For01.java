package cn.gtmap.workflow;

public class For01 {

	public static void main(String[] args) {
		/**
		 * 1、使用while打印0到4
		 */
		int i = 0;
		while(i < 5){
			System.out.println("while循环输出的:" + i);
			i++;
		}
		
		/**
		 * 2、使用for打印0到4
		 */
		for(int j = 0; j < 5; j++){
			System.out.println("for循环输出的:" + j);
		}
		
	}

}
