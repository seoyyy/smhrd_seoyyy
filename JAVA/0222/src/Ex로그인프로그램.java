import java.util.Scanner;

public class Ex�α������α׷� {

	public static void main(String[] args) {
		//1.��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		//2.�ݺ��۾��� ���ؼ� 
		//2-1 ���̵��Է��̶�� ��¹� 
		//2-2 ���̵� �Է��ϴ� �Է¹�
		//2-3 ��й�ȣ �Է��̶�� ���
		//2-4 ��й�ȣ �Է��ϴ� �Է�
		
		int cnt = 1;
		
		while(true) {
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ �Է� : ");
		String password = sc.nextLine();
		
		//3. ����!
		//3-1 ���̵� smhrd�̸鼭 ��й�ȣ�� 1234�ΰ�쿡��
		//3-2 �α��� �����̶�� ���
		//3-3 �ϳ��� Ʋ���Եȴٸ� 
		//3-4 �α��� ���ж�� ���
		
		if(id.equals("smhrd") && password.equals("12345")) {
			System.out.println("�α��� ����");
			break;
			
		}else {
			System.out.println("�α��� ����");
			System.out.print("��� �Ͻðڽ��ϱ�?");
			String answer = sc.nextLine();
				if(answer.equals("N")) {
					break;
				}else if(answer.equals("Y")) {
					if(cnt>=3) {
						System.out.println("���������� �����ϼ���");
						break;
					}
					cnt++;  //->�α��ν����ϰ� �ٽýõ��Ҷ� Ƚ���������� ī��Ʈ���ִ¸��
					
				}
		}
		
		
		}
			

	}

}
