package cn.gtmap.attribute.initilization;
/**
 * ��ϰ�����Գ�ʼ����
 * 	�������Եĳ�ʼ�������ַ�ʽ
 * 	����ѳ�ʼ���飬���ڹ��췽�����棬���⣺
 * 	�����ַ�ʽ��˭��ִ�У�˭��ִ�У�
 * @author Administrator
 *
 */
public class APHero {
	
	/**
	 * �����Գ�ʼ����ʱ�򣬵�����������ķ���ֵ��
	 * �۲�������������˳��
	 * @param pos
	 * @return
	 */
	
	public static String getName(String pos){
		String result = "name" + pos;
		System.out.println(result);
		return result;
	}
	
	public String name = APHero.getName("��������");
	
	public APHero(){
		name = APHero.getName("���췽��");
	}
	
	{
		name = APHero.getName("��ʼ����");
	}
	
	public static void main(String[] args) {
		new APHero();
	}
	
}
