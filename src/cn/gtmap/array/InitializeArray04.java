package cn.gtmap.array;
/**
 * 初始化数组
 *
 */
public class InitializeArray04 {
	/**
	 * 3、练习：数组反转
	 */
	public static void main(String[] args) {
		/**
		 * 思路二：进行首尾调换
		 */
		//创建数组，赋随机值，并打印
		System.out.println("原数组：");
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//进行首尾调换
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = temp;
		}
		
		System.out.println("反转后的数组是：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
