package cn.gtmap.number_and_string.formatted_output;

public class Test01 {
	public static void main(String[] args) {
		String name = "����";
		int kill = 8;
		String title = "����";
		
		//ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�,�׶��Բ�
		String sentence = name + "�ڽ���������" + kill + "�λ�ɱ�󣬻����" + title + "�ĳƺ�";
		System.out.println(sentence);
		
		String sentenceFormat = "%s�ڽ��������� %d�λ�ɱ�󣬻����%s�ĳƺ�%n";
		
        //ʹ�ø�ʽ�����
        //%s��ʾ�ַ�����%d��ʾ����,%n��ʾ����
		System.out.printf(sentenceFormat,name,kill,title);
		
		
	}
}
