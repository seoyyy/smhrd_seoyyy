import java.util.Scanner;

public class Ex10����for��2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�� �Է� : ");
	int dan = sc.nextInt();
	
	System.out.print("��� ������ ��� : ");
	int num = sc.nextInt();
	
		System.out.println(dan+"��");
		
	for(int i = 1; i <= num; i++) {   //->�����κп� num�־��ֱ�
		System.out.println(dan + "*" + i +"="+ dan*i);
	}	
		
		
		
		

	}

}
