package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
 *
 */
public class ArraysTools05 {
	/**
	 * 5、判断是否相同
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		int[] b = new int[] {18, 62, 68, 82, 65, 9};
		int[] c = new int[] {18, 63, 68, 82, 65, 9};
		
		System.out.println("数组a和数组b是否相同：" + Arrays.equals(a, b));
		System.out.println("数组a和数组c是否相同：" + Arrays.equals(a, c));
	}

}
