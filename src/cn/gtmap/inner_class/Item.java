package cn.gtmap.inner_class;

public abstract class Item {
	
	public abstract void effect();
	
	public static void main(String[] args) {
		//����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal
		final int price = 5;
		
		Item item = new Item(){

			@Override
			public void effect() {
				System.out.printf("Ч�����ˣ��۸񲻷ƣ��۸���%d",price);
			}
			
		};
		
	}
}
