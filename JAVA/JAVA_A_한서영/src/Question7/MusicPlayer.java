package Question7;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.println("====���� �÷��̾�====");
		System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >>");
		int choose = sc.nextInt();
		
		if(choose < 1 || choose >6) {
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
		}
		
		if(choose == 1) {
			System.out.println("====���====");
			System.out.println("����  : ");
			String new_title = sc.next();
			System.out.println("����  : ");
			String new_singer = sc.next();
			System.out.println("�ð�  : ");
			int new_playTime = sc.nextInt();
			
		
			
		}
		
		if(choose == 6) {
			System.out.println("�����մϴ�");
			break;
		}
		
		
		
		}
	}

}
