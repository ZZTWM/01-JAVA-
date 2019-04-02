package cn.gtmap.inner_class;

public abstract class Weapon {
	String name;
	int price;
	
	public abstract boolean disposable();
	
	public static void main(String[] args) {
		Weapon weapon = new Weapon(){

			@Override
			public boolean disposable() {
				return false;
			}
			
		};
		System.out.println(weapon.disposable());
	}
}
