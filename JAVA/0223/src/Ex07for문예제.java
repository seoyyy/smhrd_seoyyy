
public class Ex07for������ {

	public static void main(String[] args) {
		
		// 1-2+3-4+...+99-100�� ����Ͽ� ���� ����Ͻÿ�.
		// 1. 1���� 100���� ���
		//2. ¦���� ���� Ȧ���� ����� ���
		//3.�������� ���ϱ�
		int sum = 0; 	//���� �������� ���� ���� ����
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {			// ¦����� ���� 
				System.out.print(-i +" ");
				sum -= i;
			}else if(i%2==1) {		//Ȧ����� ����� ���
				System.out.print(i +" ");
				sum += i;
			}
		}
	System.out.println(); //���� �ٲܰſ���!->����� �����γ��������ؼ� �ѹ������ֱ� \n
	System.out.println("��� : " + sum); //-> syso("\n ��� : " + sum); �̰͵����� �������� ��
		
		
	}

}
