package �߻�;

public class Main {

	public static void main(String[] args) {
		
	//����������ڸ޼ҵ尡�ƴ� ���� �����ڸ޼ҵ������� �� ���Ĵ�� �����ͳ־���	
	RegularEmployee regular = new RegularEmployee("SMHRD001","ȫ����", 4000, 400);
	
		System.out.println(regular.print());
		
		System.out.println(regular.getMoneyPay() + "����");
		
		System.out.println();
		
	TempEmployee temp = new TempEmployee("SMHRD002","�ڤ���",3000);
	
	System.out.println(temp.print());
	System.out.println(temp.getMoneyPay() + "����");
	
	
	PartTimeEmployee part = new PartTimeEmployee("SMHRD003","�褷��",10,10);
	System.out.println(part.print());
	System.out.println(part.getMoneyPay()+"����");
	
	}
}
