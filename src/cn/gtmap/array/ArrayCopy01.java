package cn.gtmap.array;
/**
 * ��������
 *
 */
public class ArrayCopy01 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[3];//�����˳�����3�Ŀռ䣬����û�и�ֵ
		int[] c = new int[3];//�����˳�����3�Ŀռ䣬����û�и�ֵ
		System.out.print("����a[]:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		 //ͨ�����鸳ֵ�ѣ�a�����ǰ3λ��ֵ��b����
		 //����һ��forѭ��
		System.out.print("����b[]:");
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
        //������: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: Դ����
        //srcPos: ��Դ���鸴�����ݵ���ʼλ��
        //dest: Ŀ������
        //destPos: ���Ƶ�Ŀ���������ʼλ��
        //length: ���Ƶĳ���
		System.arraycopy(a, 1, c, 1, 2);
		System.out.print("����c[]:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
	}

}
