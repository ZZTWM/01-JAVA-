package cn.gtmap.constructors;

public class Hero {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    //������������һ����������Сд��
    //û�з�������
	public Hero(){
		System.out.println("ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��");
	}
	
	
	public static void main(String[] args) {
		//ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��
		Hero h = new Hero();
	}

}
