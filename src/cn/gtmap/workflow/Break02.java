package cn.gtmap.workflow;

/**
 * break：练习
 * @author Administrator
 *假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。

	然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
	
	那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
	（复利计算按照每年12000投入计算，不按照每月计息）
	
	复利公式：
	F = p* ( (1+r)^n );
	F 最终收入
	p 本金
	r 年利率
	n 存了多少年
	
	假设情景一：
	p = 10000
	r = 0.05
	n = 1
	
	解读：
	本金是10000
	年利率是5%
	存了一年 1次
	复利收入 10000*( (1+0.05)^1 ) = 10500
	
	假设情景二：
	p = 10000
	r = 0.05
	n = 2
	
	解读：
	本金是10000
	年利率是5%
	存了两年
	复利收入 10000*( (1+0.05)^2 ) = 11025
 */
public class Break02 {
	/**
	 * 1、第一年：
	 * 		投资本金：12000    
	 *  	年利率：0.2
	 *  	年数：1年
	 *  	 复利：12000 *((1 + 0.2)^1) = 14400
	 *  2、第二年：
	 *  	投资本金：12000 + 14400 = 26400
	 *  	年利率：0.2
	 *  	复利：26400 *((1 + 0.2)^1) = 31680
	 *  3、第三年：
	 *  	投资本金：12000 + 31680 = 43680
	 *  	年利率：0.2
	 *  	复利：43680 *((1 + 0.2)^1) = 52416
	 */
	public static void main(String[] args) {
		int perYearInvesment = 12000;
		float rate = 0.2f;
		int goalMoney = 1000000;
		int sum = 0;
		
		
		for (int j = 1; j < 100; j++) {
			int year = j;
			float compoundInterestRate = 1;
			//内层循环控制复利的利率
			//第一年：12000*(1 + 0.2)^1  
			//第二年：12000*((1 + 0.2)^2 +(1 + 0.2)^1)
			//     =12000*(1 + 0.2)^2 + 12000*(1 + 0.2)^1
			//第三年：12000*((1 + 0.2)^3 +(1 + 0.2)^2 + (1 + 0.2)^1)
			//     =12000*(1 + 0.2)^3 + 12000*(1 + 0.2)^2 + 12000*(1 + 0.2)^1
			for(int i=1;i<=year;i++){
				compoundInterestRate = compoundInterestRate * (1 + rate);
				
			}
			
			int compoundInterest = (int) (perYearInvesment * compoundInterestRate);
			sum = sum + compoundInterest;
			System.out.println("经过" + year + " 年， 总收入 " + sum);
			if(sum >= goalMoney){
				System.out.println("一共需要" + year + "年，累计收入超过" + goalMoney );
				break;
			}
		}

		
		
	}

}
