package cn.gtmap.attribute.initilization;
/**
 * 1���������Գ�ʼ��
 * @author Administrator
 *
 */
public class Hero {
	public String name = "some hero";
	protected float hp;
	float maxHp;
	
	{
		maxHp = 200;
	}
	
	public Hero(){
		hp = 100;//���췽���г�ʼ��
	}
	
}
