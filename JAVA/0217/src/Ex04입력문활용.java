import java.util.Scanner;

public class Ex04�Է¹�Ȱ�� {

	public static void main(String[] args) {
		
		//�Է��� �� �ִ� ����� ȣ��
		//Scanner���
		
		Scanner sc = new Scanner(System.in);
		
		//�ڵ��� ������ ����
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�μ��� ���ϱ� : " + (num1+num2));
		System.out.println("�μ��� ���� : " + (num1-num2));
		System.out.println("�μ��� ���ϱ� : " + (num1*num2));
		System.out.println("�μ��� ������(��) : " + (num1/num2));

	}

}
