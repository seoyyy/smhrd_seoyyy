import java.util.Scanner;

public class Ex10����if������ {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(grade >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(grade >= 70) {
			System.out.println("C�����Դϴ�.");
		}else {
			System.out.println("����");
		}
		
		
		
	}

}
