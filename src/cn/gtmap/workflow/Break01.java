package cn.gtmap.workflow;
/**
 * break
 * ֱ�ӽ�����ǰforѭ��
 * @author Administrator
 *
 */
public class Break01 {
	//��ӡ����
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if(0 == i%2){
				break;//�����˫����ֱ�ӽ���ѭ��
			}else{
				System.out.println(i);
			}
				
		}
	}

}
