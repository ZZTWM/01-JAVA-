package cn.gtmap.array;
/**
 * ��ϰ���ϲ�����
 *
 */
public class ArrayCopy02 {

	public static void main(String[] args) {		
		//����a[]
		System.out.print("a[]:");
		int[] a = new int[(int) (Math.random() * 5 + 5)];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//����b[]
		System.out.print("b[]:");
		int[] b = new int[(int) (Math.random() * 5 + 5)];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 100);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		//��������c[] ��a�����b����ϲ���ֵ��c����
		int[] c = new int[a.length + b.length];
		//�Ƚ�a���鸴�Ƹ�c����
		System.arraycopy(a, 0, c, 0, a.length);
		System.out.print("��a���鸳ֵ��c��");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
		//�ٽ�b���鸴�Ƹ�c����ʣ�µ�λ��
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.print("��b���鸳ֵ��c��");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
	}

}
