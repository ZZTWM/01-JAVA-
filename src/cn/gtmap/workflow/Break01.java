package cn.gtmap.workflow;
/**
 * break
 * 直接结束当前for循环
 * @author Administrator
 *
 */
public class Break01 {
	//打印单数
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if(0 == i%2){
				break;//如果是双数，直接结束循环
			}else{
				System.out.println(i);
			}
				
		}
	}

}
