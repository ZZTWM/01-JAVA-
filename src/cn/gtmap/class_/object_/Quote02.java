package cn.gtmap.class_.object_;

/**
 * ���ã�������ã�һ������
 *
 */
public class Quote02 {
	
	String name;//����
	float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	
	public static void main(String[] args) {
		Quote02 q1 = new Quote02();
		Quote02 q2 = q1;//q2ָ��q1��ָ��Ķ���
		Quote02 q3 = q1;
		Quote02 q4 = q1;
		Quote02 q5 = q4;
		
		//q1��q2�� q3 ��q4�� q5 ������ö�ָ��ͬһ������
	}

}
