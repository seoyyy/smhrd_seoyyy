package sy;
import java.util.Scanner;

public class Main {
	//���α׷��� ������ ->���� ���Ǳ⸦ ������Ű�� Ŭ����
	public static void main(String[] args) {
		//���õ� ���Ǳ� �ڵ带 ���Ǳ� ��ü�� Ȱ���ϴ� �ڵ�� �����غ���
		//main�޼ҵ忡���� �� ����� 1���� ȣ���ϵ��� �غ���
		Scanner sc = new Scanner(System.in);
		
		
		VendingMachine vm = new VendingMachine();
		
		vm.showTitle();
		
		vm.insertMoney();
		
		vm.chooseMenu();
		
//		vm.showbalance();
		
		
		
		
		
	}

}
