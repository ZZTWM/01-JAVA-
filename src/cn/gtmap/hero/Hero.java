package cn.gtmap.hero;
/**
 * ���������Ͷ���
 * @author Administrator
 *
 */
public class Hero {
	
	String name;//����
	
	float hp;//Ѫ��
	
	float armor;//����
	
	int moveSpeed;//�ƶ��ٶ�
	
	int killed;//��ɱ����
	int kill;//ɱ����
	int support;//������
	int money;//��Ǯ
	float attackSpeed;//�����ٶ�
	String wordAfterKill;//ɱ�˺�˵�Ļ�
	String wordAfterKilled;//��ɱ��˵�Ļ�
	
	//��ȡ����ֵ
	float getArmor(){
		return armor;
	}
	
	//�Ӷ���
	void keng(){
		System.out.println("�Ӷ���");
	}
	
	//�����ƶ��ٶ�
	void addSpeed(int speed){
		//��ԭ���Ļ����������ƶ��ٶ�
		moveSpeed = moveSpeed + speed;
	}
	
	//���� legendary(),�޲������޷�������
	void legendary(){
		System.out.println("����");
	}
	
	//��ȡ��ǰ��Ѫ�� getHp(), �޲�������float���͵ķ���ֵ
	float getHp(){
		return hp;
	}
	
	//��Ѫ recovery(float blood)�� �в��� float���Ͳ��� blood��ʾ���λָ���Ѫ�����޷�������
	void recovery(float blood){
		hp = hp + blood;
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name ="����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		
		System.out.println(garen.name + "��ǰ���ƶ��ٶ��ǣ�" + garen.moveSpeed);
		garen.addSpeed(100);
		System.out.println("���ڵ��ƶ��ٶ��ǣ�" + garen.moveSpeed);
		
		System.out.println("------------------------------------------");
		
		System.out.println(garen.name + "��ǰ��Ѫ���ǣ�" +garen.hp);
		garen.recovery(20);
		System.out.println("���ڵ�Ѫ���ǣ�" + garen.hp);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 145.6f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		
		
		
	}
}
