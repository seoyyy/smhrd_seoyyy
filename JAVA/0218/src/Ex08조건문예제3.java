import java.util.Scanner;

public class Ex08���ǹ�����3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA ���� �Է� : ");
		int java = sc.nextInt();
		
		System.out.print("Python ���� �Է� : ");
		int python = sc.nextInt();
		
		System.out.print("Android ���� �Է� : ");
		int android = sc.nextInt();
		
		if((java+python+android)/3>=80) {
			System.out.println("�հ�");
		}

	}

}
