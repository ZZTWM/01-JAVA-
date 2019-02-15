package cn.gtmap.array;
/**
 * 增强型for循环
 *
 */
public class EnhancedForCycle {

	public static void main(String[] args) {
		int[] a = new int[]{18,62,68,82,65,9};
		int[] b = new int[]{19,63,69,83,66,10};
		//常规遍历
		System.out.println("常规遍历：");
		for (int i = 0; i < a.length; i++) {
			int each = a[i];
			System.out.print(each + " ");
		}
		System.out.println();
		
		//增强的for循环遍历
		System.out.println("增强的for循环遍历：");
		for (int each : b) {
			System.out.print(each + " ");
		}
	}

}
