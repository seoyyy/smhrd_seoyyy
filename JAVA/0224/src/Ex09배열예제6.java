import java.util.Scanner;

public class Ex09�迭����6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int[] ans = {1,4,3,2,1};
	int[] user = new int[5];
	
	//1.uner��� �迭�� ����ڰ� �Է��� ���� �־��ּ���.
	
	for(int i = 0; i < user.length; i++) {
	System.out.print((i+1)+"��° ������ >> ");
	user[i] = sc.nextInt();
	}
	
	int total =0;
	
	//2. ans ��� �迭�� user��� �迭�� ���ؼ�
	// ���� ���ٸ� 'O', �ٸ��ٸ� 'X'�� ��½����ּ���!
	
	System.out.println("����Ȯ��");
	
	for(int i = 0; i < user.length; i++) {
		
		if(ans[i]==user[i]) {
	System.out.print("O ");
	total+=20;
		}else {
	System.out.print("X ");
	}
	}
	System.out.println("���� : "+ total);
	
	
	
	}

}
