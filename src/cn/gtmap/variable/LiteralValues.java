package cn.gtmap.variable;
/**
 * ����ֵ
 * @author Administrator
 *
 */
public class LiteralValues {

	public static void main(String[] args) {
		/**
		 * 1����������ֵ��
		 */
		long val = 26L;
		//int val1 = 26L;//����
		int decVal = 26;//Ĭ�Ͼ���int ����
		int hexVal = 0x1a;//16����
		int oxVal = 032;//8����
		int binVal = 0b11010;//2����
		System.out.println("Ĭ��ʮ���ƣ�" + decVal);
		System.out.println("ʮ�����ƣ�" + hexVal);
		System.out.println("�˽��ƣ�" + oxVal);
		System.out.println("�����ƣ�" + binVal);
		
		/**
		 * 2������������ֵ
		 */
		float f1 = 123.4F;//��F��β������ֵ��ʾfloat����
		double d1 = 123.4;//Ĭ�Ͼ���double����
		double d2 = 1.234e2;//��ѧ��������ʾdouble
		
		/**
		 * 3���ַ����ַ�������ֵ
		 */
		String name = "����";
		char a = 'c';
		
		//������ת���ַ�
		char tab = '\t';//�Ʊ��
		char carriageReturn = '\r';//�س�
		char newLine ='\n';//����
		char doubleQuote ='\"';//˫����
		char singleQuote ='\'';//������
		char backslash ='\\';//��б��
		
		/**
		 * 4����ϰ-����ֵ
		 */
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4L;
		float f = 3.14f;
		double d = 3.14;
		char c = '��';
		String str = "�й�";
		
	}

}
