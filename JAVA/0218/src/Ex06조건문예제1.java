import java.util.Scanner;

public class Ex06���ǹ�����1 {

	public static void main(String[] args) {
		
	Scanner	sc = new Scanner(System.in);
	
	System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		//���׿����� �̿��ؼ� age���� 20���� ũ�� ���� ���
		//age���� 20���� �۴ٸ� �̼������Դϴ�. 
		
//	 String res = (age>20)? "�����Դϴ�.":"�̼������Դϴ�.";
//	 System.out.println(res);
 
		
		if (age>=10 && age<20) {
			System.out.println("10���Դϴ�.");
		}else if(age >=20 && age <30) {
		System.out.println("20���Դϴ�.");
		}else if(age>=30 && age<40) {
			System.out.println("30���Դϴ�.");
		}else if(age>=40 && age<50) {
			System.out.println("40���Դϴ�.");
		}else {
			System.out.println("�̼������Դϴ�.");
		}
			
		System.out.println("���α׷� ����!");
		
	}

}
