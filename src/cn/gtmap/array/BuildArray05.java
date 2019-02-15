package cn.gtmap.array;
/**
 * 创建数组
 *
 */
public class BuildArray05 {
	/**
	 * 1、练习：数组最小值
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
		//给数组中赋随机值
		for (int i = 0; i <a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("数组中的各个随机数是：");
		
		//循环遍历数组的值：
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		//找数组中最小的值：
		int min = 100;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.println("找出来的最小数值是：" + min);
		
	}

}
