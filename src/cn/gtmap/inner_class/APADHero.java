package cn.gtmap.inner_class;

public abstract class APADHero {
    String name; //����
    
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
      
    public abstract void attack();
      
    public static void main(String[] args) {
          
        //����������������ڣ������������Զ��������
        class SomeHero extends APADHero{
            public void attack() {
                System.out.println( name+ " �µĽ����ֶ�");
            }
        }
         
        SomeHero h  =new SomeHero();
        h.name ="�������";
        h.attack();
    }
}
