import java.util.Scanner;

public class Ex00�����Է� {

	public static void main(String[] args) {
		
		// .next() vs .nextLine()
		//next�� /t,/n ����, �����̽��� ���� �� �������� ���ڰ� �߷��� ���
		// nextLine /t,/t �����̽��� �ν�
		
		
		Scanner sc = new Scanner(System.in);
		
//		String txt = sc.next();
//		System.out.println(txt);
		//�ȳ� �ȳ� => �ȳ�
		
		String txt2 = sc.nextLine();
		System.out.println(txt2);
		//�ȳ� �ȳ� => �ȳ� �ȳ�

	}

}
