import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String id = "dldmsql";
	int pw = 1214;
	
	while(true) {
		
		System.out.print("id : ");
		String new_id = sc.next();
		System.out.print("pw : ");
		int new_pw = sc.nextInt();
		
		 if(!id.equals(new_id) || pw != new_pw) {
			 System.out.println("�ٽ� Ȯ���ϼ���!");
			 
		 }else if(id.equals(new_id) && pw == new_pw){
			 System.out.println( id + "�� ȯ���մϴ�!");
			 break;
		 }
	}
	
	
	
	
	}

}
