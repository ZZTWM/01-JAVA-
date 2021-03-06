package cn.gtmap.array;
/**
 * 练习：排序
 * 先选择法正排序（从小到大）
 * 然后冒泡法倒排序（从大到小）
 */
public class ArraySorting03 {

	public static void main(String[] args) {
		//初始化数组，打印
		int[] a = new int[5];
		System.out.println("选择法排序前数组：");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//选择法正序排序
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if(a[i] < a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("选择排序，正排序的数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//冒泡法倒排序
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - j - 1; i++) {
				if(a[i] < a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		System.out.println("冒泡法排序，倒序的数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
