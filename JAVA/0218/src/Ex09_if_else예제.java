import java.util.Scanner;

public class Ex09_if_else���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//������ �Է¹޾� 1�� �ڸ��� 5���� ũ�ų� ���ٸ� �ø�
		//1�� �ڸ��� 5���� �۴ٸ� ������ ����� ����Ͻÿ�.
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num%10>=5 ) {
			System.out.println("�ݿø� �� : " + (num - num % 10 + 10) );
		}else {
			System.out.println("�ݿø� �� : " + (num-num%10));
		}
		
		
		
		
		
		
	}

}
