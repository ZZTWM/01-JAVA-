package cn.gtmap.variable;
/**
 * �����򣺾ֲ�����
 * @author Administrator
 *
 */
public class ActionScope03 {
	
	public void method1(){
		int i = 5;//�����÷�Χ�Ǵ������ĵ�6�У����䷽�����ܵĵ�20��λ��
		System.out.println(i);
		//�ֿ�
		{
			System.out.println(i);//���Է���i
			int j= 6;
			System.out.println(j);//���Է���j
		}
		
		//System.out.println(j);//���ܷ���j,��Ϊ�������򵽵�16�оͽ�����
	}
	
	public static void main(String[] args) {
		ActionScope03 actionScope = new ActionScope03();
		actionScope.method1();
	}

}
