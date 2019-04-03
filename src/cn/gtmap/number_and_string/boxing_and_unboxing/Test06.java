package cn.gtmap.number_and_string.boxing_and_unboxing;
/**
 * �Զ�����
 * ����Ҫ����Integer��intValue������ͨ��=���Զ�ת����int���ͣ��ͽв���
 *
 */
public class Test06 {
	//��������
	byte b = 5;
	short s = 6;
	int i = 7;
	long l = 10L;
	float f = 3.4f;
	double d = 3.1415;
	
	//��������ת��װ��
	Byte bt = new Byte(b);
	Short sh = new Short(s);
	Integer it = new Integer(i);
	Long lg = new Long(l);
	Float fl = new Float(f);
	Double de = new Double(d);
	
	//01����װ��ת��Ϊ�������ͣ����Զ�����
	byte b1 = bt.byteValue();
	short s1 = sh.shortValue();
	int i1 = it.intValue();
	long l1 = lg.longValue();
	float f1 = fl.floatValue();
	double d1 = de.doubleValue();
	
	//02����װ��תΪ�������ͣ��Զ�����
	byte b2 = bt;
	short s2 = sh;
	int i2 = it;
	long l2 = lg;
	float f2 = fl;
	double d2 = de;
	
}
