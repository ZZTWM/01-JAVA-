package cn.gtmap.starving.single;

/**
 * 	GiantDragon Ӧ��ֻ��һֻ��ͨ��˽�л��乹�췽����ʹ���ⲿ�޷�ͨ��new �õ��µ�ʵ����
 * 	GiantDragon �ṩ��һ��public static��getInstance�������ⲿ������ͨ���÷�����ȡ12�ж���Ķ��󣬶���ÿһ�ζ��ǻ�ȡͬһ������ �Ӷ��ﵽ������Ŀ�ġ�
 * 	���ֵ���ģʽ�ֽ�������ʽ����ģʽ��������ζ��ᴴ��һ��ʵ��
 *
 */
public class GiantDragon {
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragon(){
		
	}
	
	//׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
	private static GiantDragon instance = new GiantDragon();
	
	//public static �������ṩ�������߻�ȡ11�ж���Ķ���
	public static GiantDragon getInstance(){
		return instance;
	}
	
}
