package �޼ҵ�;

public class Ex02�޼ҵ�2 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		// op�� ��� ���� ���� ����� �ٸ��� �������!
		
//		int result = 0;
//		
//		if(op == '+') {
//			result = num1 + num2;
//		}else if(op == '-'){
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
				//�̰� �޼ҵ� ��ɾȿ� �־�� 
		
		
		//������ �޼ҵ� ȣ���ϱ�
		System.out.println(cal(num1,num2,op));
		
		

	}
	
	public static int cal(int num1, int num2, char op) {
		int result = 0;   //int reuslt��� ������ �ϴ� 0�� �־ �����ϰ� ���� ������ ������
		
		//op�ȿ� �ִ� ���� ���� �ٸ� ��Ģ������ ��������ּ��� !
//		if(op == '+') { //char�� ���ڿ� string�̾ƴϰ� ���� ��ü���� .equals���ƴϰ� ���ڿ����ó�� ==�� ���.
//			result = num1 + num2;
//		}else if(op == '-'){
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
//		return result;
		
		switch (op) {
		case '-':
			result =  num1 - num2;
		break;
		case '+':result =  num1 + num2;
		break;
		case '*':result =  num1 * num2;
		break;
		case '/':result =  num1 / num2;
		break;
				}
		return  result;
		
		
		}
		
		
					}
	
	

