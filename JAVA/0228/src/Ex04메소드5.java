
public class Ex04�޼ҵ�5 {

	public static void main(String[] args) {
		
	//2���� ���� base,n�� �޾� base�� n���� ��ŭ ���� ��ȯ�ϴ� powerN()�޼ҵ带 �ۼ��ϼ���.
		
		int base = 2;
		int n = 3;
		 powerN(base,n);
		//int result 
		
		
		

	}
	public static void powerN(int base, int n) {  // void ������ �������� �������� ��ȯŸ����ġ�� void��� Ű���� ���
		int result = 1;  //0���� �ʱ�ȭ�س�� ������ ������ �ȴ�.
		
		//���� �� ���ϱ� !
		for(int i = 1; i < n+1; i++) {
		result *= base;		// base�� i(n)�� �ݺ��ؼ� ���ض� (result�� ���̽��� n������ �������״ѱ�_) �� �����ȿ��� i�� ������� �ʴ´�.
		//result = result * base
		}
		
		
		
		System.out.println("��� Ȯ�� : " + result);
//		return result;
	}
}
