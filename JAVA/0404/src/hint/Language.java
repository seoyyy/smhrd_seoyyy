package hint;

import java.util.ArrayList;

public abstract class Language {
	//����Ҷ� ����Ŭ����(�θ�Ŭ����)
	//�߻�Ŭ���� : �̱����� Ŭ���� ->�ǵ������� 
		//1.�߻�Ŭ������ ��ü������ �Ұ��� // Language lang = new Language();  XXX
		//2.�߻�Ŭ������ ��ӹ��� ����Ŭ������ ����Ŭ���� ������ �߻�޼ҵ带 ������ �������� ������.->�θ� �߻�ȭ�س����� �ڽĵ��� ������ ��üȭ������� ��밡��
	
	
	
	//�߻�޼ҵ� : �̱����� �޼ҵ� -> {}��ü�����ʾƵ���
	//���� ����޼ҵ带 ������ ���پ��°� �ƴϰ� ����Ŭ���� �޼ҵ带 �����پ��� ����� �߻������γ�Ÿ����
	//������ ����Ŭ�������� ������(�������̵�)�ؼ� �� �޼ҵ带 ��������
	public abstract String getTitleMSG();
	
	public abstract String getInputMoneyMSG();
	
	public abstract String getShowMenuMSG1();

	public String getShowMenuMSG2(ArrayList<MenuDTO> menuList) {
		String msg = "";
		for (int i = 0; i < menuList.size(); i++) {
			msg += (i+1)+"."+menuList.get(i).getMenu_name()+" ";
			msg += "("+ menuList.get(i).getMenu_price()+")";
		}
		msg += ">>";
		return msg;
	}

	public abstract String getReturnChange1();
	
	public abstract String getReturnChange2(int money);
	
	
	
	

}
