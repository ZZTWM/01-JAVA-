package cn.gtmap.abstract_;

public abstract class Hero {
    String name;
    
    float hp;
 
    float armor;
 
    int moveSpeed;
    
    // ���󷽷�attack
    // Hero������ᱻҪ��ʵ��attack����
    public abstract void attack();
    
    public static void main(String[] args) {
    	//��Ȼû�г��󷽷�������һ��������Ϊ�˳����࣬�Ͳ��ܹ�ֱ�ӱ�ʵ����
		//Hero hero = new Hero();
	}
}
