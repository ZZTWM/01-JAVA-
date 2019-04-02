package cn.gtmap.inner_class;

public abstract class APADHero {
    String name; //姓名
    
    float hp; //血量
          
    float armor; //护甲
          
    int moveSpeed; //移动速度
      
    public abstract void attack();
      
    public static void main(String[] args) {
          
        //与匿名类的区别在于，本地类有了自定义的类名
        class SomeHero extends APADHero{
            public void attack() {
                System.out.println( name+ " 新的进攻手段");
            }
        }
         
        SomeHero h  =new SomeHero();
        h.name ="伊泽瑞尔";
        h.attack();
    }
}
