package cn.gtmap.test;
/**
 * （1）程序运行的结果都是A，因为类A的print方法是private的，不能被子类B重写，
 * 		B类的print方法只是一个和A类print方法同名的方法，而在调用fun方法时，java采取就近原则，
 * 		在fun方法里调用的print方法是与fun方法同在一个类的print方法，即A类里的print方法。
 * （2）若把类A的print方法改为非private，那么类B里的print方法就是对父类A print方法的重写，
 * 		此时结果为B，即java多态。
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		a.fun();
		b.fun();
	}

}

class A {
	private void print() {         
		System.out.println("A");
	}
	
	public void fun() {
		this.print(); //this写不写效果一样
	}
}

class B extends A{ 
	public void print() {
		System.out.println("B");
	}
}
