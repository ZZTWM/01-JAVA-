package cn.gtmap.inner_class;

public class Hero {
	
    private String name;
	
    float hp; // Ѫ��
 
    float armor; // ����
 
    int moveSpeed; // �ƶ��ٶ�
    
    //�Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ�������ڵ�ʱ�򣬲�������
    //ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
    class BattleScore{
    	int kill;
    	int die;
    	int assit;
    	
    	public void legendary(){
    		if(kill >= 8){
    			System.out.println(name + "����");
    		}else{
    			System.out.println(name + "��δ����");
    		}
    	}
    	
    }
    
    public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
        // ʵ�����ڲ���
        // BattleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
        // ������ʵ�������뽨����һ���ⲿ�����Ļ���֮��
		BattleScore battleScore = garen.new BattleScore();
		battleScore.kill = 9;
		battleScore.legendary();
		
	}
    
}
