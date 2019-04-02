package cn.gtmap.default_method;

public interface Moral {
	public void die();
	
	default public void revive(){
		System.out.println("±æ”¢–€∏¥ªÓ¡À");
	}
	
}
