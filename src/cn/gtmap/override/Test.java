package cn.gtmap.override;

public class Test {

	/**
	 * ������д�ķ���
		���þͻ�ִ����д�ķ����������ǴӸ���ķ���
		����LifePotion��effect���ӡ��
		"Ѫƿʹ�ú󣬿��Ի�Ѫ"
	 * @param args
	 */
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}

}
