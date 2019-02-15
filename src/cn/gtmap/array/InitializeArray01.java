package cn.gtmap.array;
/**
 * 初始化数组
 *
 */
public class InitializeArray01 {
	/**
	 * 1、分配空间与赋值分步进行
	 */
	public static void main(String[] args) {
		int[] a = new int[5];//分配了长度是5的数组，但是没有赋值
		
        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
		System.out.println(a[0]);
		
		//进行赋值
		a[0] = 101;
		a[1] = 102;
		a[2] = 103;
		a[3] = 104;
		a[4] = 105;
	}

}
