package cn.gtmap.workflow;

/**
 * continue
 * ������һ��ѭ��
 * �����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
 */
public class Continue01 {

	public static void main(String[] args) {
		for(int j = 0; j < 10; j++){
			if(0 == j%2){
				continue;//�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
			}else{
				System.out.println(j);
			}
		}
	}

}
