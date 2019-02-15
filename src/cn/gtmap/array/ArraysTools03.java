package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
 *
 */
public class ArraysTools03 {
	/**
	 * 3、排序
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		System.out.println("排序前：");
		System.out.println(Arrays.toString(a));
		
		//排序后
		Arrays.sort(a);
		System.out.println("排序后：");
		System.out.println(Arrays.toString(a));
	}

}
