package cn.gtmap.workflow;
/**
 * ʹ�ñ�ǩ�����ⲿѭ��
 * @author Administrator
 *
 */
public class EndExternalLoop03 {

	public static void main(String[] args) {
		//��ӡ����
		outloop://outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if(0 ==j%2)
					break outloop; //�����˫���������ⲿѭ��
			}
		}	
	}

}