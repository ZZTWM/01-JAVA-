package cn.gtmap.variable;
/**
 * ��������ϰ
 * @author Administrator
 *
 */
public class ActionScope04 {
	int i = 1;//��������i
	
	public void method1(int i){//����Ҳ��i
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ActionScope04 actionScope = new ActionScope04();
		//�����5�������ʵı��������������Ӱ���ʱ�򣬰��վͽ�ԭ��ȡ
		actionScope.method1(5);
	}

}
