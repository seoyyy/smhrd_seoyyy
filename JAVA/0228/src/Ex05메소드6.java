import java.util.Arrays;

public class Ex05�޼ҵ�6 {

	public static void main(String[] args) {
		
		int[] array = {1,3,4,8,7,9,10};
		int num1 = 10;
		arrayToString(array,num1); //�迭�ȿ� �ִ� �����͸� ��½�Ű�� �޼ҵ� 
		
		System.out.println("���1 : "+array[0]); //-> �迭�� �������̶� �ٲ�
		System.out.println("���2 : "+ num1);
	}

	public static void arrayToString(int[] array, int num1) { 
		//-> call-by-reference �������̶� �ּҰ��� �ѱ�. �������� ���� �Ѱ��ִ� call-by-value��� �Ҹ�.
//		for(int i =0; i < array.length; i++) {
//		System.out.print(array[i]	+ " ");
//		}
			
		array[0]=30;  //->�ҷ��� �迭�� ù��°���� 30���� �ٲ�
		num1= 30;
		System.out.println(Arrays.toString(array)); //->�Ѱܹ��� �迭�� ���� �ѹ��� ��½�ų���ִ� ���. toString�ϰ� ����ġ��
	}
	
}
