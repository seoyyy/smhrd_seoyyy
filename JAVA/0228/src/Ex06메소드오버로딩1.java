
public class Ex06�޼ҵ�����ε�1 {

	public static void main(String[] args) {
		
	int num1 = 10;
	int num2 = 20;
	
		System.out.println("���1 : "+ add(num1,num2));
		
		double num3 = 10.5;
		double num4 = 21.7;
		System.out.println("���2 :" + add(num3,num4));
		
		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("���3 : "+ add(num5,num6));
		
		
		
		
	}
	//�޼ҵ� �����ε� : ���� �޼ҵ� �̸����� �������� �Ű����� Ÿ���� �ٸ��� �ؼ� �ٸ� ����� �����Ű�°�.
	//�޼ҵ� �����ε� ���� 
	//1.�޼ҵ� �̸��� ���ƾ���. 2.�Ű������� ���� �Ǵ� Ÿ���� �޶����. 3.�Ű������� ���� ���Ϥ�Ÿ���� �ٸ� ���� �����ε��̾ƴ�.
	
	
	// num1�� num2�� ���ؼ� ��ȯ�����ִ� add��� �޼ҵ� ����� �ּ��� !
	public static int add(int num1, int num2) {
		
//		int result = num1 + num2;
		
		return num1+num2;
					
	}
	//num3�� num4�� ���� ���� ��ȯ���ִ� �޼ҵ� ������ּ���.
	public static double add(double num3, double num4) {
		return num3+num4;
	}
	
	public static float add(float num5, float num6) {
		return num5+num6;
	}
}
