package cn.gtmap.workflow;
/**
 * while��do-whileѭ�����
 * @author Administrator
 *
 */
public class While01 {

	public static void main(String[] args) {
		/**
		 * 1��while
		 */
		int i = 0;
		while (i < 5){
			System.out.println(i);
			i++;
		}
		
		System.out.println("--------���Ƿָ���------------");
		/**
		 * do-while
		 */
        //��ӡ0��4
        //��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
		int j = 0;
		do{
			System.out.println(j);
			j++;
		}while(j < 5);
		
	}

}
