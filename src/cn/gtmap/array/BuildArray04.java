package cn.gtmap.array;
/**
 * 创建数组
 * @author Administrator
 *
 */
public class BuildArray04 {
	/**
	 * 4、数组长度
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(a.length);//打印数组的长度
		
		a[4] = 100; //下标4，实质上是“第5个”，既最后一个
		a[5] = 101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
	}

}
