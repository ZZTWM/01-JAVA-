package cn.gtmap.operator;
/**
 * �߼�������
 * @author Administrator
 *
 */
public class LogicalOperator02 {
	/**
	 * 2����·�� �� ��·��
	 * @param args
	 */
	public static void main(String[] args) {
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int i = 2;
		//System.out.println(i == 1);//false
		//System.out.println(i++ == 2);//true
		//System.out.println(i);//3
		
		//i��ʱΪ2 (i == 1Ϊfalse) (i++ == 2)Ϊtrue
		//�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(i == 1 | i++ ==2);// false | true --> true 
		System.out.println(i);//3
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		//��Ϊj==2����true,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j == 2 || j++ == 2);//true
		System.out.println(j);//2
	}

}
