package cn.gtmap.array;
/**
 * 数组排序
 *
 */
public class ArraySorting02 {
	/**
	 * 冒泡法排序
	 */
	public static void main(String[] args) {
		
		int[] a = new int[5];
		System.out.println("排序前数组：");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//冒泡排序
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - j - 1; i++) {
				if(a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		//排序后输出
		System.out.println("排序后的数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
