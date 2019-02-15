package cn.gtmap.array;

/**
 * 练习：二维数组
 *
 */
public class TwoDimensionalArray02 {
	public static void main(String[] args) {
		//初始化数组，赋随机值
		int[][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		
		//打印这个二维数组
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//找出这个二维数组中最大的值，并打印下标
		int max = -1;//最大值
		//最大值的下标
		int index_i = -1;
		int index_j = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] > max){
					max = a[i][j];
					index_i = i;
					index_j = j;
				}
			}
		}
		
		System.out.println("找出来的最大值是：" + max);
		System.out.println("其坐标是：[" + index_i + "][" + index_j + "]");
		
		
		
		
	}
}
