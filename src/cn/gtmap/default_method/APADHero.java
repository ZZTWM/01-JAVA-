package cn.gtmap.default_method;

public class APADHero implements AD,AP{

	public static void main(String[] args) {
		
	}
	
    //作为同时继承了AD和AP中的 默认方法attack，就必须在实现类中重写该方法
    //从而免去到底调用哪个接口的attack方法这个模棱两可的问题
	@Override
	public void attack() {
		System.out.println("apad的攻击");
	}

}
