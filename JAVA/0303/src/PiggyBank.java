
public class PiggyBank {

	private int money; //�ݾ׿� ���� ������ intŸ���� ����
	
	//�ݾ׺����� ��� �ʿ�
	public void showMoney() {
		System.out.println("�ܾ� :"+ money);
	}
	
	//������ �ݾ��� �������س��� ��� 
	public void deposit( int inputMoney) {
		money+=inputMoney;
	}
	
	public void withdrawal(int outputMoney) {
		money-=outputMoney;
	}
}
