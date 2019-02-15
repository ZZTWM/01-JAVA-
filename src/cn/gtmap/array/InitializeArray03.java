package cn.gtmap.array;
/**
 * 初始化数组
 *
 */
public class InitializeArray03 {
	/**
	 * 3、练习：数组反转
	 */
	public static void main(String[] args) {
		
		//创建数组，随机赋值，并打印
		int[] a = new int[5];
		System.out.println("数组中各个值是：");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//思路一：创建临时数组，把原数组的内容复制过来，
		//		然后把临时数组的值 倒放到原数组中
		int[] temp = new int[a.length];
		//把原数组的内容复制给临时数组
		System.out.println("临时数组中的值是：");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a[i];
			System.out.print(temp[i] + " ");
		}
		
		System.out.println();
		
		//反转的做法是把临时数组的数据，挨个 倒 放入原数组中
		System.out.println("反转后的数组中各个值是：");
		for (int i = 0; i < temp.length; i++) {
			a[i] = temp[temp.length - i - 1];
			System.out.print(a[i] + " ");
		}
		
	}

}
