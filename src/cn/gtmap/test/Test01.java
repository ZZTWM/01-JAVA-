package cn.gtmap.test;
/**
 * ��1���������еĽ������A����Ϊ��A��print������private�ģ����ܱ�����B��д��
 * 		B���print����ֻ��һ����A��print����ͬ���ķ��������ڵ���fun����ʱ��java��ȡ�ͽ�ԭ��
 * 		��fun��������õ�print��������fun����ͬ��һ�����print��������A�����print������
 * ��2��������A��print������Ϊ��private����ô��B���print�������ǶԸ���A print��������д��
 * 		��ʱ���ΪB����java��̬��
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		a.fun();
		b.fun();
	}

}

class A {
	private void print() {         
		System.out.println("A");
	}
	
	public void fun() {
		this.print(); //thisд��дЧ��һ��
	}
}

class B extends A{ 
	public void print() {
		System.out.println("B");
	}
}
