package cn.gtmap.variable;
/**
 * final:
 *   final ����һ���������кܶ���˵�������粻�ܸı�ȵ� 
 *   ׼ȷ�������� ��һ��������final���ε�ʱ�򣬸ñ���ֻ��һ�θ�ֵ�Ļ���
 * @author Administrator
 *
 */
public class Final {

	public void method1(){
		/**
		 * 1����������ʱ��ֵ
		 */
		final int i =5;
		//i = 10;//i�ڵ�9���Ѿ�����ֵ���ˣ������������ֱ������
        
	}
	
	public void method2(){
		/**
		 * 2����������ʱ��û�и�ֵ
		 */
		final int i;
		i = 10;//i�ڵ�15�У�ֻ�Ǳ�����������û�б���ֵ��������������Խ��е�һ�θ�ֵ
		//i = 11;//i�ڵ�16���Ѿ�����ֵ���ˣ������������ֱ������
	}
	
	public void method3(final int j){
		/**
		 * 4����ϰfinal:
		 * 		���final���ε��ǲ������ܷ��ڷ���������������ֵ��
		 */
		//j = 5;//�����ԣ���Ϊ�ڵ��÷�����ʱ�򣬾�һ�����һ�θ�ֵ�ˣ����治���ٽ��ж�θ�ֵ
	}
	
	public static void main(String[] args) {
		
	}

}
