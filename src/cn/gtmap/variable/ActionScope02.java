package cn.gtmap.variable;

/**
 * �����򣺲���
 * @author Administrator
 *
 */
public class ActionScope02 {
	/**
	 * 2������
	 */
	int i = 6;
	public void method1(int i){
		//i =1;
		System.out.println("method1�Ĳ���i:" + i);
		
	}
	
	public void method2(int i){
		//i = 5;
		System.out.println("method2�Ĳ���i:" + i);//method2 ���ܷ��ʲ���i,�ᱨ��
	}
	
	int j = i;//������Ҳ���ܷ��ʲ���i
	
	public static void main(String[] args) {
		ActionScope02 actionScope = new ActionScope02();
		System.out.println("��ʱi�������ԣ���Ҫʹ�ö���.���������ã�" + actionScope.i);
		
		actionScope.method1(100);
		actionScope.method2(200);
	}

}
