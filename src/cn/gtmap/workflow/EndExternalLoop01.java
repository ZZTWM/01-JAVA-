package cn.gtmap.workflow;

/**
 * 1��������ǰѭ��
 * 	break; ֻ�ܽ�����ǰѭ��
 * @author Administrator
 *	
 */
public class EndExternalLoop01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if( 0 ==j%2)
					break;//�����˫����������ǰѭ��
			}
		}
	}

}
