package cn.gtmap.variable;
/**
 * �������ֶΡ����ԡ�Field����Ա����
 * @author Administrator
 *
 */
public class ActionScope01 {
	/**
	 * 1���ֶΡ����ԡ�Field����Ա����
	 */
	
	int i = 1;
	int j = i + 1;//���������Կ��Է���i
	
	public void method1(){
		System.out.println("method1��ӡ��j:" + i);//����1����Է���i
	}
	
	public void method2(){
		System.out.println("method2��ӡ��j:" + j);//����1����Է���j
	}
	
	public static void main(String[] args) {
		
		ActionScope01 actionScope = new ActionScope01();
		actionScope.method1();
		actionScope.method2();
		
	}

}
