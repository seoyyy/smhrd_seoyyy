import java.util.Scanner;

public class Ex07�迭����4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//�Էº� -> �迭�� ���� �Էºο� ��º� �̷��� ����
		for(int i = 0; i<arr.length; i++) {		//i�� �ε�����ȣ�� Ȱ��
		System.out.print((i+1)+"��° �Է�>> ");
		arr[i] = sc.nextInt();	
		}
		
		//��º�
		System.out.print("�Էµ� ���� : ");
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		
		int max=arr[0];
		for(int i =0 ; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}		
		//intŸ���� �迭�� �⺻��(����Ʈ������)���� 0�� �������ִ�. �׷��� �������Է¹ޱ����� �����ϸ� 0���� ������
		System.out.println("�ְ����� : " + max);
		
		int min=arr[0];
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("�������� : " + min);
		
		int sum =0;
		for(int i= 0; i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("���� : "+ sum);
		
		float ave = 0;
		for(int i = 0; i <arr.length ; i++) {
			ave += arr[i];
		}
		System.out.println("��� : "+ ave/arr.length);
		
		//�ѹ��� ��ĥ��������
//		int max = arr[0];
//		int min = arr[0];
//		int sum = 0;
//		
//		for(int i =0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			
//			sum += arr[i];			
//		}
//		
//		System.out.println("�ְ� ���� : "+ max);
//		System.out.println("���� ���� : "+ min);
//		System.out.println("���� : "+ sum);
//		System.out.println("��� : "+ (double)sum/arr.length );
	}

}
