import java.util.Random;
import java.util.Scanner;

public class Ex04���� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int suc = 0;  //->�����̳� �����ϴ� ������while�� �ۿ� ���� �ȱ׷��� �ݺ��ɶ����� �ʱ�ȭ��
		int fail = 0;  //->Ʋ���������庯��
		
		//�ݺ����� ���ؼ�
		//���� ��Ȯ�Ѱ�쿡�� success���
		//Ʋ������ fail ���
		
		while(true) {
			//1.�������� �̴� ���(��ĳ�ʺҷ����±�ɰ� ���)
			Random rd = new Random();
		int num1 = rd.nextInt(10)+1;  //->10�� �����̸� ���ڰ� 0���ͽ����ؼ� 10���� 9���� ������ �ű⿡ +1�����༭ 1���ͽ����ϵ������ֱ�
		int num2 = rd.nextInt(10)+1;	
		
		System.out.print(num1 + "+"+ num2 + "=");  // ->�������� ��¹�
		int input = sc.nextInt();
		
		if(input == num1+num2) {
			System.out.println("Success!");
			suc++;
			
		}else {
			System.out.println("Fail!");
			fail++;
		}
			
		System.out.print("����Ͻðڽ��ϱ�?");
		String answer = sc.next();
		
		if (answer.equals("Y")) {
			continue;
		}else if(answer.equals("N")) {
			System.out.println("����!");
			System.out.println("���ᰳ�� : " + suc);
			System.out.println("Ʋ������ : " + fail);
			break;
		}
		
		}
		
		
	}

}
