package cn.gtmap.array;
/**
 * 练习：合并数组
 *
 */
public class ArrayCopy02 {

	public static void main(String[] args) {		
		//数组a[]
		System.out.print("a[]:");
		int[] a = new int[(int) (Math.random() * 5 + 5)];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//数组b[]
		System.out.print("b[]:");
		int[] b = new int[(int) (Math.random() * 5 + 5)];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 100);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		//定义数组c[] 将a数组和b数组合并赋值给c数组
		int[] c = new int[a.length + b.length];
		//先将a数组复制给c数组
		System.arraycopy(a, 0, c, 0, a.length);
		System.out.print("将a数组赋值给c后：");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
		//再将b数组复制给c数组剩下的位置
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.print("将b数组赋值给c后：");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
	}

}
