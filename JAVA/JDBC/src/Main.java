import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);	
	
	DTO dto = new DTO();
	
	while(true) {
	
	System.out.print("[1]���� [2]��ȸ [3]���� [4]���� [5]���� >> ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			
			 System.out.print("���� ���̵� : ");
			 String id = sc.next();
			 System.out.print("���� ��й�ȣ : ");
			 String pw = sc.next();
			 System.out.print("���� �̸� : ");
			 String name = sc.next();
			 System.out.print("���� ���� : ");
			 int age = sc.nextInt();
			
		int result = dto.insert(id,pw,name,age);
			
			if(result >0) {
				System.out.println("ȸ�����Լ���!");
			}
			
		}else if(choice == 2) {
			
		}else if(choice == 3) {
			
		}else if(choice == 4) {
			
		}else if(choice == 5) {
			System.out.println("���α׷� ����");
			break;
		}
		
	}
		
		
		

	}

}
