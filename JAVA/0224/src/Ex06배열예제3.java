import java.util.Scanner;

public class Ex06�迭����3 {

	public static void main(String[] args) {
	//1.��ĳ�� ����Ʈ	
	Scanner sc = new Scanner(System.in);
	//2. 10ĭ¥�� ��Ʈ�� �迭���� - ����������
	int[]arr = new int[10];
	
	//3.�� 10�� ���� ����ڿ��� ����(����)�Է�
	//3-1. 10ĭ¥�� �迭�� �����͸� �������� ����
	for(int i =0; i <10; i++) {   //->�ε�����ȣ�� �����������ֱ� �װԴ� �߿�
		System.out.print((i+1)+"��° ���� �Է� : ");
		arr[i] = sc.nextInt();	
	}
	//4. 3�� ��� ��� : ��¹� ����
	System.out.print("3�� ��� ��� : ");
	
	//5. �迭 �ӿ� 3�� ����鸸 ������ ���! print
	 	for(int j = 0; j <arr.length; j++) {
	 		if(arr[j]%3==0) {
	 			System.out.print(arr[j] + " ");
	 		}	 		
		
	 	}
		
		

	}

}
