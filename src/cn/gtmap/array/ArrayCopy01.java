package cn.gtmap.array;
/**
 * 复制数组
 *
 */
public class ArrayCopy01 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[3];//分配了长度是3的空间，但是没有赋值
		int[] c = new int[3];//分配了长度是3的空间，但是没有赋值
		System.out.print("数组a[]:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		 //通过数组赋值把，a数组的前3位赋值到b数组
		 //方法一：for循环
		System.out.print("数组b[]:");
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的启始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
		System.arraycopy(a, 1, c, 1, 2);
		System.out.print("数组c[]:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
	}

}
