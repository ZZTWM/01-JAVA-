package cn.gtmap.number_and_string.boxing_and_unboxing;

public class Test01 {

	public static void main(String[] args) {
		int i = 5;
		
		//��һ���������͵ı���,ת��ΪInteger����
		Integer it = new Integer(i);
		//��һ��Integer����ת��Ϊһ���������͵�int
		int i2 = it.intValue();
		
		System.out.println(it instanceof Integer);
	}

}
