import java.util.Scanner;

public class Ex05�ú��� {

	public static void main(String[] args) {
	
		//1.��ĳ�� ����Ʈ
		
		Scanner sc = new Scanner(System.in);
		
		//2.��¹� "�� �Է�: "
		System.out.print("�� �Է� : ");
		
		//3.�����Է¹ޱ�!

		int num1 = sc.nextInt();
		
		//4.�Է¹��� ������ ��,��,�� ����ϸ�˴ϴ�
		//ex) 1�ð��� 3600��, 60��
		int hour = num1 / 3600;
		int min = num1 % 3600/60;
		int sec = num1 % 3600 % 60;
				
		System.out.print( hour + "�� " + min + "�� " + sec + "��");
		
		
		
	}

}
