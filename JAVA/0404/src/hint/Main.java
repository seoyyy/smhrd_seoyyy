package hint;

import java.util.Scanner;

public class Main {
	//���α׷��� ������ : �����丵 ->������ ¥���� �ڵ带 ȿ���������� �ڵ带 ����� �ٲ��ִ�

	//�ٱ��� ����� ž��� ���Ǳ�� ���׷��̵� ->������ �̿� 
	
	public static void main(String[] args) {

//		VendingMachine vm = new VendingMachine();  //��ü ����  (���Ǳ� �Ѵ밡 § ����)
		VendingMachine vm = new VendingMachine(new English());  //���� ���� �̺κ��� ��� �ڸ��ưų� ���⸸�ٲ��ָ� ��
		
		
	//	vm.showTitle();  //�����Ǳ����� Ÿ��Ʋ�����޶� ��û�ҷ���
		vm.inputMoney();
		vm.showMenu();
		vm.calculateChange();
		vm.returnChange();
		

		
		

		
	}

}
