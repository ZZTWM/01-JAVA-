package cn.gtmap.operator;
/**
 * �߼�������
 * @author Administrator
 *
 */
public class LogicalOperator01 {
	/**
	 * 1����·�� �� ��· ��
	 * @param args
	 */
	public static void main(String[] args) {
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int i = 2;
		System.out.println(i++ == 2);//true
		System.out.println(i);//3
		
		System.out.println(i == 1 & i++ == 2);//false & true --> false
		System.out.println(i);//4
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��false�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		//��Ϊj==1����false,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j == 1 && j++ ==2);//false && true --> false
		System.out.println(j);//2
		
	}

}
