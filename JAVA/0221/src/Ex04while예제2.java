import java.util.Scanner;

public class Ex04while����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int total = 0; 		//->������ ������� ������ �ʿ� (num������ �����ؼ� ��������ִ� ����)
		
		
//		while(num!=-1) {   			//-> -1�̾ƴѰ�쿡 �ݺ����ּ���
//			total += num;		//-> -1�������̵Ǵ°� �������� �ڵ� ������ �߿� ���¸� ������ �÷���
//			System.out.println("���� �Է� : ");
//			num = sc.nextInt();
//			//total = num+total;
//	
//		} 
		
		//�޸��� �Ѽ� �ڵ� �ؼ��ϸ� �ϴ°� ���ڵ� ->�����?��°�?
		//true���� �־ ��������
		
		while(true){
			total += num;		
			//-> break���������� �ݸ��� �������ü���� ������ �ٽ� ���� �ö󰡼� total += num�� ��ġ�� �߿������� 
			// break�� ������ �������ü��ִ� ��ġ�� total += num�� ��ġ�� �߿����� ����.
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if (num ==-1) {
			break;
				}
		}
	
		System.out.println("������ ����� " + total);
		
		

	}

}
