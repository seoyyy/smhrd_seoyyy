import java.util.Scanner;

public class Ex02���׿���1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//������ �Է¹޾� Ȧ������ ¦������ �Ǻ��ϼ���.
		//1.������ �Է��϶�� ��¹��� ����
		System.out.print("������ �Է��ϼ��� : ");
			
		//2.����ڿ��� ������ �Է¹ޱ�
		int num = sc.nextInt();
		
		//3.(�Է��� ���ڰ� 2�� �������� �������� 0�̸�) ¦��! �ƴϸ� Ȧ��!
		
		String result = (num%2 == 0) ? "¦��" : "Ȧ��";
		
		//4.���� �Է��� ���ڴ� + ��(��) + (¦��,Ȧ��) +�Դϴ�.
		
		System.out.println("���� �Է��� ���ڴ� " + num + "��(��) " + result + "�Դϴ�.");

	}

}
