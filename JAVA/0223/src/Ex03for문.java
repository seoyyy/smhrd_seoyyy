import java.util.Scanner;

public class Ex03for�� {
		//��ĳ�� ����Ʈ
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//�� �ΰ� �Է¹ޱ�
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//������ �ʿ�!
		//ex) num1>num2�϶��� num2�� �����ϴ� ��/ num1�� ������ ��
		//ex) num1<num2�϶��� num1�� �����ϴ� ��/ num2�� ������ ��
		//���ǹ� �ӿ� �ݺ��� 2���� �ۼ��ؼ� Ǯ�̰��� !
		if(num1>num2) {
			for(int i1 = num2; i1<=num1;i1++) {
				System.out.print(i1 + " ");
			}			
		}else if(num1<num2) {
			for(int i2= num1; i2<=num2; i2++) {
				System.out.print(i2 + " ");
			}
		}
		
		//�� Ǭ ��� ���׿����ڷ� Ȱ���ؼ� �ݺ��� �ϳ��� ���ϼ�����.
		//���ǹ� ? �� : ���� ;
		 	int big = (num1 > num2) ? num1 : num2;
			int small = (num2 > num1) ? num1 : num2;
			for(int i = small; i <= big; i++) {
				System.out.print(i);
			}
		

	}

}
