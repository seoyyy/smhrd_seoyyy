import java.util.Scanner;

public class Ex01Ȧ¦���ϱ� {

	public static void main(String[] args) {
		
		// 1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		//2. �ݺ���Ű��! Ƚ���� �������� ����!
		int num = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			//3. �����Է� ��¹� ���� / ����ڿ��� ������ �Է�
			System.out.print("���� �Է� : ");
			num = sc.nextInt();	
			
		//4. ����ڰ� -1�� �Է��ϸ� �ݺ����� ����!
		if(num == -1) {
			break;
		}
		
		// �Էµ� num�� Ȧ����� Ȧ������ī��Ʈ, ¦����� ¦������ī��Ʈ
		if(num%2==1) {
			//Ȧ���϶�
			odd++;
		}else if (num%2==0){
			//¦���϶�
			even++;
		}
			
		}
			
			
//���α׷��� ����Ǿ����� Ȧ���� ¦�������� ���
		
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);
				
			
			
	}

}
