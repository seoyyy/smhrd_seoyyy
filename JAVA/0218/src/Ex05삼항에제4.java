import java.util.Scanner;

public class Ex05���׿���4 {


	public static void main(String[] args) {
		//1.��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		//2.�뵿�ð��� �Է��϶�� ��¹�
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		//3.�뵿�ð��� �Է�
		int hour = sc.nextInt();
		
		//4.8�ð������� 9000���� �⺻�ñ��� �ް�, 8�ð� ���ʹ� 1�ð����� 1.5���� ����ޱ�
//		
//		int pay = (hour<=8) ? (hour*9000) : (int)(8*9000+(hour-8)*9000*1.5);
//		
//		System.out.println("�� �ӱ��� " + pay + "�� �Դϴ�.");
		
		//if~else ������ �̿��ؼ� Ǯ���ּ���
		
		if(hour>8) {
			System.out.println("��� �� : " + ((int)(8*9000+(hour-8)*9000*1.5)));
		}else {
			System.out.println("��� �� : " + hour*9000);
		}
			

		
		
	}

}
