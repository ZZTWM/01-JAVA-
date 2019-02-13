package cn.gtmap.variable;
/**
 * final:
 *   final 修饰一个变量，有很多种说法，比如不能改变等等 
 *   准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会
 * @author Administrator
 *
 */
public class Final {

	public void method1(){
		/**
		 * 1、在声明的时候赋值
		 */
		final int i =5;
		//i = 10;//i在第9行已经被赋值过了，所以这里会出现编译错误
        
	}
	
	public void method2(){
		/**
		 * 2、在声明的时候没有赋值
		 */
		final int i;
		i = 10;//i在第15行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值
		//i = 11;//i在第16行已经被赋值过了，所以这里会出现编译错误
	}
	
	public void method3(final int j){
		/**
		 * 4、练习final:
		 * 		如果final修饰的是参数，能否在方法里给这个参数赋值？
		 */
		//j = 5;//不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值
	}
	
	public static void main(String[] args) {
		
	}

}
