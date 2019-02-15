package cn.gtmap.array;
/**
 * 练习：增强的for循环
 *
 */
public class EnhancedForCycle02 {

	public static void main(String[] args) {
		int[] a = new int[]{19,63,69,83,66,10};
		//数组中的内容是：
		for (int each : a) {
			System.out.print(each + " ");
		}
		System.out.println();
		
		int max = -1;
		for (int each : a) {
			if(each > max){
				max = each;
			}
		}
		System.out.println("最大的值是：" + max);
		
	}

}
