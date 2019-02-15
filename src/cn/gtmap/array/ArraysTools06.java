package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
 *
 */
public class ArraysTools06 {
	/**
	 * 6、填充
	 */
	public static void main(String[] args) {
		int[] a = new int[10];
		Arrays.fill(a, 5);
		System.out.println(Arrays.toString(a));
		
	}

}
