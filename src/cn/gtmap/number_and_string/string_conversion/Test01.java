package cn.gtmap.number_and_string.string_conversion;

/**
 * ����ת�ַ���
 * ����1�� ʹ��String��ľ�̬����valueOf 
 * ����2�� �Ȱѻ�������װ��Ϊ����Ȼ����ö����toString
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int i1 = 5;
		//����1
		String str1 = String.valueOf(i1);
		//����2
		int i2 = 6;
		Integer it = i2;
		String str2 = it.toString();
		
		System.out.println(str1 + str2);
	}
}
