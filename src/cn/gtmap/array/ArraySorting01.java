package cn.gtmap.array;
/**
 * 数组排序
 *
 */
public class ArraySorting01 {
	/**
	 * 选择法排序
	 */
	public static void main(String[] args) {
		//创建数组，随机赋值，并打印
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		//打印
		System.out.println("排序前数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//选择法进行排序：升序
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if(a[i] < a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		//排序后输出
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
