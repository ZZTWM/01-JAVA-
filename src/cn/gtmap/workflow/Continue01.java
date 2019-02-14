package cn.gtmap.workflow;

/**
 * continue
 * 继续下一次循环
 * 如果是双数，后面的代码不执行，直接进行下一次循环
 */
public class Continue01 {

	public static void main(String[] args) {
		for(int j = 0; j < 10; j++){
			if(0 == j%2){
				continue;//如果是双数，后面的代码不执行，直接进行下一次循环
			}else{
				System.out.println(j);
			}
		}
	}

}
