package cn.gtmap.single.test;

/**
 * ����ģʽ����ϰ��ʹ������ʽ����ģʽ����Item������Ϊ����ģʽ
 * @author Administrator
 *
 */
public class Item {
	
	//���췽��˽�л�
	private Item(){
		
	}
	
	private static Item instance = new Item();
	
	public static Item getInstance(){
		
		if(null == instance){
			instance = new Item();
		}
		
		return instance;
	}
	
}
