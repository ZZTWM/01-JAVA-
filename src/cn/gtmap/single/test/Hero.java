package cn.gtmap.single.test;

/**
 * ��ϰ������ģʽ��ʹ�ö���ʽ����ģʽ����Hero������Ϊ����ģʽ
 * @author Administrator
 *
 */
public class Hero {
	
	//���췽��˽�л�
	private Hero(){
		
	}
	
	//��̬����ָ��ʵ��
	private static Hero instance = new Hero();
	
	//public static��getInstance
	public static Hero getInstance(){
		return instance;
	}
	
}
