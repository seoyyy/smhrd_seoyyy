import java.util.Scanner;

public class Ex03���׿���2 {

	public static void main(String[] args) {
		
		//1.��ĳ�� ȣ��
	Scanner sc = new Scanner(System.in);
	
	//2.��¹��� ���ؼ� ù��° ������ �Է�
	//2-1. ù��° �������Է�
	System.out.print("ù��° ���� �Է� : ");
	int num1 = sc.nextInt();
	
	
	//3. ��¹��� ���ؼ� �ι�° ������ �Է��ϼ���!
	//3-1. �ι�° ������ �Է�
	System.out.print("�ι�° ���� �Է� : ");
	int num2 = sc.nextInt();
	
	//4.�Է��Ѽ����� ū���ڿ��� �������ڸ� �� ����� ����
	
	int res = (num1 > num2) ?  num1-num2 : num2-num1 ;
	
	//5.�� ����� ���
	
		System.out.print("�� ���� �� : " + res);	

	}

}
