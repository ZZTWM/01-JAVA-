package cn.gtmap.variable;
/**
 * ����ת��
 * @author Administrator
 *
 */
public class TypeConversion {

	public static void main(String[] args) {
		/**
		 * 1��ת������
		 */
		char c1 ='A';
		short s1 = 80;
		s1 = (short)c1;
        //��Ȼshort��char����16λ�ģ�������һ����
        //���Ǳ˴�֮�䣬��Ȼ��Ҫ����ǿ��ת��
		char c2 ='B';
		short s2 =90;
		c2 = (char)s2;
		//ֱ�ӽ���ת��������ֱ������
		//s2 = c2;
		
		/**
		 * 2���;�����߾���ת��
		 */
		long l1 = 50L;
		int i1 = 50;
		//int�Ƚ�С��Ҫ�Ž��Ƚϴ��long,�����ô�������ŵĽ�ȥ
		l1 = i1;
		
		long l2 = 60L;
		int i2 = 60;
		//���ǽ�long���͸�ֵ��int���;���Ҫǿ��ת��
		i2 =(int)l2;
		
		/**
		 * 3���߾�����;���ת��
		 */
		byte b1 = 5;
		byte b2 = 6;
		int i3 = 10;
		int i4 = 300;
		
        //��Ϊi3��ֵ����byte��Χ֮�ڣ����Լ������ǿ��ת��
        //���õ���ֵ��Ҳ��10
		b1 = (byte) i3;
		System.out.println(b1);
		
        //��Ϊi4��ֵ����byte��Χ֮�⣬���Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
        //i4��ֵ��300�����Ӧ�Ķ��������� 100101100
        //����byte�ĳ���8λ���н�ȡ����ֵΪ 00101100 ��44
		b2 = (byte) i4;
		System.out.println(b2);
		
		//�鿴һ��������Ӧ�Ķ����Ƶķ�����
		System.out.println(Integer.toBinaryString(i4));
		
		/**
		 * 4����ϰ-����ת��
		 */
		short a = 1;
		short b = 2;
		
		short c = (short) (a + b);
		
	}

}
