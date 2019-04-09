package cn.gtmap.number_and_string.math_method;

import org.omg.Messaging.SyncScopeHelper;

public class Test07 {
	
	// 假如n是合数，必然存在非1的两个约数p1和p2，其中p1<=sqrt(n)，p2>=sqrt(n)。
	//由此我们可以改进上述方法优化循环次数。如下：
	private static boolean isPrime(int i){
		for(int j = 2; j <= Math.sqrt(i); j++){
			if(0 == i%j)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(3));
		
		int max = 10000 * 1000;
		int count = 0;
		for (int i = 1; i <= max; i++) {
			if(isPrime(i)){
				count ++;
			}
		}
		
		System.out.println("一千万以内的质数一共有： " + count);
		
		System.out.println(isPrime(2));
	}
	
	
}
