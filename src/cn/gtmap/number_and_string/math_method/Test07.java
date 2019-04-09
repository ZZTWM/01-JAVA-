package cn.gtmap.number_and_string.math_method;

import org.omg.Messaging.SyncScopeHelper;

public class Test07 {
	
	// ����n�Ǻ�������Ȼ���ڷ�1������Լ��p1��p2������p1<=sqrt(n)��p2>=sqrt(n)��
	//�ɴ����ǿ��ԸĽ����������Ż�ѭ�����������£�
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
		
		System.out.println("һǧ�����ڵ�����һ���У� " + count);
		
		System.out.println(isPrime(2));
	}
	
	
}
