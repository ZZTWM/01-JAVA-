package cn.gtmap.inherit;

/**
 * �����࣬�̳���Ʒ��
 *
 */
public class Weapon extends Item {
	int damage;//������
	
	public static void main(String[] args) {
		Weapon infinityEdge = new Weapon();
		infinityEdge.damage = 65;//damage��������Weapon������Ƶ�
		
		infinityEdge.name = "�޾�֮��";
		infinityEdge.price = 3600;//name���ԣ��Ǵ�Item�м̳����ģ��Ͳ���Ҫ�ظ������
	}
}
