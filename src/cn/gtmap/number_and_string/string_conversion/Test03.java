package cn.gtmap.number_and_string.string_conversion;

public class Test03 {
	public static void main(String[] args) {
		float f = 3.14f;
		//������ת�ַ���
		String s = String.valueOf(f);
		//�ַ���ת������
		f = Float.parseFloat(s);
		
		//����ַ������ݲ��ǺϷ������ֱ���ôת���ͻᱨ��(�׳��쳣)
		Float.parseFloat("3.14a");
	}
}
