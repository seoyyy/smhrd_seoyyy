
public class Ex05�迭����2 {

	public static void main(String[] args) {
	
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		
		//arr�迭 �ȿ��� �ִ밪(���� ū��) ��� ->47
		//�ϳ��� �������� ���ư��鼭 ���������.
		//���� ���� ���� - arr�� ù��° ���ڸ� ����=>index��ȣ0���ڸ� �� !
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length ; i++) {
			//���� ������ ������ max�� arr�ȿ� �ִ� ���ڵ���
			//�ϳ��� �������鼭 �񱳸��غ�����
			//max���� ū���� �ִ밪 �װ� max�� ����
			if( arr[i] > max) {
				max = arr[i];
			}
			
			
		}
		//��¹��� ���� max�� ���
			System.out.println(max);
			
		//�ּҰ����ϱ�	
			for(int i = 0; i < arr.length; i++) {
				if (arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println(min);
	}

}
