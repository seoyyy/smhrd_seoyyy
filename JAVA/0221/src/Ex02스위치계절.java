import java.util.Scanner;

public class Ex02����ġ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��(1~12) �Է� : ");
		int season = sc.nextInt();
		
		//->�ϵ��ڵ� ��� (�������ڵ�)
//		switch(season) {
//		case 1:
//			System.out.println(season + "���� �ܿ��Դϴ�");
//			break;
//		case 2:
//			System.out.println(season + "���� �ܿ��Դϴ�");
//			break;
//		case 12:
//			System.out.println(season + "���� �ܿ��Դϴ�");
//			break;
//		case 3:
//			System.out.println(season + "���� ���Դϴ�");
//			break;
//		case 4:
//			System.out.println(season + "���� ���Դϴ�");
//			break;
//		case 5:
//			System.out.println(season + "���� ���Դϴ�");
//			break;
//		case 6:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//		case 7:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//		case 8:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//		case 9:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//		case 10:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//		case 11:
//			System.out.println(season + "���� �����Դϴ�");
//			break;
//			
			
		//���� ȿ������ �ڵ����
		// case 1:
		//	case 2: �̷��� �극��ũ�� �Ȱɰ� 
		// s y s o �ؼ� ������൵ ����
		switch(season) {
		case 12,1,2:
			System.out.println(season + "���� �ܿ��Դϴ�");
			break;
		case 3,4,5:
			System.out.println(season + "���� ���Դϴ�");
			break;
		case 6,7,8:
			System.out.println(season + "���� �����Դϴ�");
			break;
		case 9,10,11:
			System.out.println(season + "���� �����Դϴ�");
			break;
		}
		
		
		}
		
		
		

	}


