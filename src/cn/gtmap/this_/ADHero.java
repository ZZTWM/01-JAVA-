package cn.gtmap.this_;
/**
 * ͨ��this�ؼ��ַ��ʶ�������
 * @author Administrator
 *
 */
public class ADHero {
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�
    
    //��������������һ��
    //�ڷ������У�ֻ�ܷ��ʵ�����name
    public void setName1(String name){
    	name = name;
    }
    
    //Ϊ�˱���setName1�е����⣬���������ò�ʹ������������
    public void setName2(String heroName){
    	name = heroName;
    }
    
    public void setName3(String name){
    	//name������ǲ���name
    	//this.name�����������name
    	this.name = name;
    }
    
	public static void main(String[] args) {
		ADHero ez = new ADHero();
		ez.setName1("�������");
		System.out.println(ez.name);//null
		
		ADHero bh = new ADHero();
		bh.setName2("�ͽ�����");
		System.out.println(bh.name);
		
		ADHero vn = new ADHero();
		vn.setName3("ޱ��");
		System.out.println(vn.name);
	}

}
