package �޼ҵ�;

public class Ex01�޼ҵ�1 {

	public static void main(String[] args) {
		
	int num1 = 10;
	int num2 = 20;
	
	int result = add(num1,num2);		//�ؿ��� ������ add��� �޼ҵ带 �ҷ���-> ȣ�� �Ͽ� �޼ҵ��� ������ ����
	System.out.println("��� : " + result);
	
	//minus ��� ����ϰ�;��
	//�޼ҵ� �̸����� ȣ�� : �޼ҵ带 ����Ҳ�����!

	//���� !! ���� ��ü�� �޼ҵ�� �Ѱ��ִ°� �ƴ϶� ���� �ȿ� �ִ� ��!�� �Ѱ��ش�.
	int result2 = minus(num1,num2);
	System.out.println("��� : " + result2);
	
	int result3 = mul(num1,num2);
	System.out.println("��� : " + result3);
	
	int result4 = div(num1,num2);
	System.out.println("��� : " + result4);
	
	
// ���� �� ����� �Ź� �������� �ʰ� main �Ʒ��� �޼ҵ�� �־ ���� �������� �ҷ��������ϴ°� �޼ҵ�	
//	 int result = num1 + num2;
//	
//	int num1 = 34;
//	int num2 = 40
//			System.out.println("��� : " + result);
	
	}
	
	//�޼ҵ� : ���� ����ϴ� ����� ���� ���� �����س����� !!!�� �ǹ�
	//�ʿ��Ҷ����� �ҷ��ͼ� �������!
	//public : ���� ������ --> �� �޼ҵ带 ������ �������� ����� ���ΰ�? ���ǹ�
	//public�� ���� ����ص����ƿ� 
	//static : �����ϴ�! ���� main���� �Ӥ����� �����ϵ���
	//int :���� Ÿ��(��ȯŸ��)
	//add(int num1, int num2) : �޼ҵ� �̸�(�ʿ����,�ʿ���� intŸ�� ������ �ΰ������ž�)
	//{�޼ҵ� ���� ����(���Ѵ�)
	// return result;  --> �ش��ϴ� �� result��� �����͸� ��ȯ�Ұſ���!  �ڡڡڡڡ��߿�!! 
	//						(������ ����� ���� Ÿ�Կ� �°� �����͸� ��ȯ������Ѵ�.)
	// }
	
	public static int add(int num1, int num2) {
		int result = num1 +num2;
		return result;  //->ȣ��� ��ġ�� ������ add�� ȣ���ߴ� �� ��ġ�� ���Ե�.
	}
	//���� ����� �ϴ� minus ��� �޼ҵ带 ���鲨����!
	public static int minus(int num1, int num2) {
		int result = num1 -num2;
		return result;
	}
	//���ϱ� ����� �ϴ� mul�̶�� �޼ҵ�
	
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	//���� ���� ���ϴ� div��� �޼ҵ�
	public static int div(int num1, int num2) {
		int result = num1 /num2;
		return result;
	}
	
	
	
}
