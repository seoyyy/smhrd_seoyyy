import java.util.Scanner;

public class Ex01����ġ�����Է� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		// .next(): ��Ʈ�������� �����͸� �Է��ϴ� �޼ҵ�.
		String data = sc.next();
		
		//string �����ʹ� ������ ������Ÿ���̶� == �񱳰� �Ұ���. 
		//�������� ����� �������־ ����� �ҷ��;���.-> equals
		//�������¸� ���Ҷ��� equals��� �޼ҵ带 ���
//		if(data.equals("�ѱ���")) {
//			System.out.println("�ȳ��ϼ���!");
//		}else if(data.equals("����")) {
//			System.out.println("���!");
//		}
//		
		
		//����ġ������ �ۼ�-> truefalse��� ������ �ִ°� �ƴϰ� , Ư������ �־� ���ϴ°�
		//case�� �񱳿��� -��쿡��
		
		switch(data) {
		case "�ѱ���":
			System.out.println("�ȳ��ϼ���");
			break;
		case "����":
			System.out.println("���!");
			break;
		case "�߱���":
			System.out.println("���Ͽ�");
			break;
		case "�Ϻ���":
			System.out.println("������");
			break;
		}
		
		
		
		
		

	}

}
