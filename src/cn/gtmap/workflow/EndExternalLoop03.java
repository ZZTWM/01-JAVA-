package cn.gtmap.workflow;
/**
 * 使用标签结束外部循环
 * @author Administrator
 *
 */
public class EndExternalLoop03 {

	public static void main(String[] args) {
		//打印单数
		outloop://outloop这个标示是可以自定义的比如outloop1,ol2,out5
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if(0 ==j%2)
					break outloop; //如果是双数，结束外部循环
			}
		}	
	}

}
