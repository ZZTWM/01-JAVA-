package cn.gtmap.attribute.initilization;
/**
 * �����Գ�ʼ��
 * @author Administrator
 *
 */
public class ADHero {
	
	public String name;
	protected float hp;
	float maxHp;
	
	public static int itemCapacity = 8;//������ʱ�� ��ʼ��
	
	static{
		itemCapacity = 6;//��̬��ʼ���� ��ʼ��
	}
	
	public ADHero(){
		
	}
	
	public static void main(String[] args) {
		System.out.println(ADHero.itemCapacity);
	}
	
}
