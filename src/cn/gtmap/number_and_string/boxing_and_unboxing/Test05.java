package cn.gtmap.number_and_string.boxing_and_unboxing;

/**
 * �Զ�װ��
 * ����Ҫ���ù��췽����ͨ��=�����Զ��� �������� ת��Ϊ ������ �ͽ�װ��
 */
public class Test05 {
	public static void main(String[] args) {
		//��������
		byte b = 5;
		short s = 6;
		int i = 7;
		long l = 10L;
		float f = 3.4f;
		double d = 3.1415;
		
		//01����������ת��װ��:���Զ�װ��
		Byte bt = new Byte(b);
		Short sh = new Short(s);
		Integer it = new Integer(i);
		Long lg = new Long(l);
		Float fl = new Float(f);
		Double de = new Double(d);
		
		//02����������ת��װ��:�Զ�װ��
		Byte bt2 = b;
		Short sh2 = s;
		Integer it2 = i;
		Long lg2 = l;
		Float fl2 = f;
		Double de2 = d;
		
	}
}
