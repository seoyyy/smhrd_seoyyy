
public class Ex04�迭����1 {

	public static void main(String[] args) {
		
		
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		//��¹��� ������
		//¦���� ���
		
//		System.out.println(arr[1]);
//		System.out.println(arr[3]);
//		System.out.println(arr[5]);
//		System.out.println(arr[7]);
//		System.out.println(arr[9]);
		
		for(int i =0; i<arr.length; i++) {   //-> �ε�����ȣ�� 0���Ͷ�
			if(arr[i]%2==0) {      //i��° �����Ͱ� 4�϶� 2�γ�����~
			System.out.print(arr[i] + " ");
			}
		}
		//�迭�� ũ�⸦ �ڵ����� ���ؿ��°� .length ! -> �����Ͱ� ������ �ٲ�� ���̸� �����̼������� �ٲ�����ϱ⶧��
		// �Ź� �װ��� �ٲ��� �ʱ����� ���ʿ� ��ǻ������ �� ���̸� ���϶�� ��Ű��
	}

}
