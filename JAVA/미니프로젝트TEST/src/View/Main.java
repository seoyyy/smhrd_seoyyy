package View;

import java.util.Scanner;
import Controller.DTO;
import Controller.Picture;


public class Main {
	//�̿��ڰ� �����ִ� ȭ�鸸

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DTO dto = new DTO();
		Picture pic = new Picture();
		String id = null;
		
		while (true) {
			pic.picBurger();
			System.out.print(" [1]�α��� [2]ȸ������ ");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.print("���̵� �Է� : ");
				id = sc.next(); 		//player���̺� ����
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next(); 	//player���̺� ����
				int res = dto.checkID(id, pw);

				if (res == 1) {
					System.out.println("�α��� ����!");
					break;
					// ��������!!!!!!!
				} else {
					System.out.println("�α��� ����!");
				}

			} else if (choice == 2) {

				System.out.println("���� ���̵� : ");
				String new_id = sc.next();
				System.out.println("���� ��й�ȣ : ");
				String pw = sc.next();

				int cnt = dto.insert(new_id, pw);

				if (cnt > 0) {
					System.out.println("ȸ������ ����!");
				}

			}

		}

		while (true) {
			System.out.println("[1]���ӽ��� [2]��ŷȮ�� [3] ����");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("���ӽ���");

				while (true) {
					dto.game(id);
					System.out.println("[1]�����簳 [2]��������");

					int want = sc.nextInt();
					if (want == 1) {
						continue;
					} else if (want == 2) {
						System.out.println("����Ǿ����ϴ�");
						break;
					}
				}
			} else if (choice == 2) {
				System.out.println("��ŷ Ȯ��");
				dto.rank();
			} else if (choice == 3) {
				System.out.println("����Ǿ����ϴ�");
				System.exit(0);
				//break;
			}

//		System.out.println("������ �����մϴ�.");
//		System.exit(0);

		}
	}
}

