import java.util.Scanner;

public class Ex04for������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� 2���� �Է¹޾� �μ� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//ù��° �Է°� ������, �ι�°�� ū��
		System.out.print("���� �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� �� : ");
		int num2 = sc.nextInt();
		
		int total = 0; //->�����Ҷ� �ݺ��� �ۿ��� ���������ؼ� �ʤ���ȭ�����ʵ���
	
		
	for(int i = num1; i<=num2; i++ ){
		 	total += i;
		}
	System.out.println("���� : " + total); //->����� �ѹ����̶� �ݺ���������

	}

}
