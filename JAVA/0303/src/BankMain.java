import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
	PiggyBank p1 = new PiggyBank(); //->��ü����
	
	//->��ü�� money�� �־��ֱ�
//	p1.money = 5000;
	//���� ����ڰ� �Է��� �ݾ׸�ŭ money�� ������Ű�� �;��!
	Scanner sc = new Scanner(System.in);
	System.out.print("������ �ݾ� �Է� :");
	int inputMoney = sc.nextInt();
	//�Է��� �ݾ��� money�� ������Ű��;�� ->money�� private�� �����س��� money�� �ٷ������Ҽ�����
	//��ȸ�ؼ� ���� 
	p1.deposit(inputMoney);
	
	p1.showMoney();
	
	//1.������ �ݾ��� �Է¹޾Ƽ�
	//2.�ش��ϴ� �ݾ׸�ŭ money�� ���� �����ּ���.
	//3. �ܾ��� ��½����ּ���.
	System.out.print("���� �� �ݾ� �Է� :");
	int outputMoney = sc.nextInt();
	p1.withdrawal(outputMoney);
	p1.showMoney();
	
		
		
		
		
		
	}

}
