package hint;

public class Japanese extends Language{
	//���Ǳ⿡ ����Ϸ��� language Ÿ���̿�����.
		//�� �� ������ ��ӹ޾Ҿ�? �׷� �̱����� �޼ҵ�� ��üȭ(����)���Ѿ��� ->������
	//add-unemplemented methods 
	
	@Override
	public String getTitleMSG() {
		// TODO Auto-generated method stub
		return "������";
	}

	@Override
	public String getInputMoneyMSG() {
		// TODO Auto-generated method stub
		return "insert coin please >>";
	}

	@Override
	public String getShowMenuMSG1() {
		// TODO Auto-generated method stub
		return "choose your flavor";
	}


	@Override
	public String getReturnChange1() {
		// TODO Auto-generated method stub
		return "not enough money.";
	}

	@Override
	public String getReturnChange2(int money) {
		// TODO Auto-generated method stub
		return "You have" + money + "won left";
	}
	
	
	

}
