package cn.gtmap.array;

import java.util.Arrays;

/**
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
 *
 */
public class ArraysTools {
	/**
	 * 1、数组复制
	 */
	public static void main(String[] args) {
		int[] a = new int[] {18, 62, 68, 82, 65, 9};
		
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
		int[] b = Arrays.copyOfRange(a, 0, 3);//这里的3表示下标，只能取到a数组0、1、2的位置的值
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}

}
