package cn.gtmap.array;
/**
 * ��ϰ����ǿ��forѭ��
 *
 */
public class EnhancedForCycle02 {

	public static void main(String[] args) {
		int[] a = new int[]{19,63,69,83,66,10};
		//�����е������ǣ�
		for (int each : a) {
			System.out.print(each + " ");
		}
		System.out.println();
		
		int max = -1;
		for (int each : a) {
			if(each > max){
				max = each;
			}
		}
		System.out.println("����ֵ�ǣ�" + max);
		
	}

}
