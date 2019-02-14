package cn.gtmap.workflow;
/**
 * 使用boolean变量结束外部循环
 * @author Administrator
 *
 */
public class EndExternalLoop02 {

	public static void main(String[] args) {
		boolean breakout = false;//是否终止外部循环的标记
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println( i + ":" + j);
				if( 0 ==j %2){
					breakout = true;//终止外部循环的标记设置为true
					break;
				}
				
			}
			if(breakout)//判断是否终止外部循环
				break;
		}
	}

}
