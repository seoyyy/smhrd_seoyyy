package hint;

public class English extends Language {
	//�ϳ��� Ŭ���� �� �޼ҵ�� �Ѱ��� ���Ҹ� ����ϵ��� �����ϴ°� good
	public String getTitleMSG() {
		return "===Welcome Vending Machine===";
	}
	
	
	public String getInputMoneyMSG() {
		return "insert coin please >>";
	}
	
	public String getShowMenuMSG1() {
		return "choose your flavor";
	}
	
	
	
	public String getReturnChange1() {
		return "not enough money.";
	}
	
	public String getReturnChange2(int money) {
		return "You have" + money + "won left";
		}
}
