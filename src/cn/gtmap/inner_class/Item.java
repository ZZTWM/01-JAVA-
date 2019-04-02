package cn.gtmap.inner_class;

public abstract class Item {
	
	public abstract void effect();
	
	public static void main(String[] args) {
		//在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
		final int price = 5;
		
		Item item = new Item(){

			@Override
			public void effect() {
				System.out.printf("效果感人，价格不菲，价格是%d",price);
			}
			
		};
		
	}
}
