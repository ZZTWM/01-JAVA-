package cn.gtmap.operator;
/**
 * �߼�������
 * @author Administrator
 *
 */
public class LogicalOperator05 {
	/**
	 * ��ϰ���߼�������
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;    
		//��1��i =1��i++ ����������������ʱ1 == 3��Ϊ false��Ȼ��i������i=2�����ԣ�i++ == 3��Ϊfalse
		//��2����ʱi=2��i++������������������ i++ == 2Ϊtrue��Ȼ��i������i=3�����ԣ�i++ == 2��Ϊtrue
		//��3����ʱi=3��i++������������������ i++ == 3 Ϊtrue��Ȼ��i������i=4�����ԣ�i++ == 3��Ϊtrue
		//��4������!(i++ == 3)^(i++ == 2)&&(i++ == 3)--> 
		//				!false^true&&true-->true^true&&true-->false&&true-->false
		//��5������b=false
		//�����false && true ����Ϊ�Ƕ�·�룬���� ��i++ == 3������ִ�У���ʱi����3
		boolean b = !(i++ == 3)^(i++ == 2)&&(i++ == 3);//false
		System.out.println(b);//false
		System.out.println(i);//3
	}

}
