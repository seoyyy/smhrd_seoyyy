
public class Ex03�޼ҵ�4 {

	public static void main(String[] args) {
		//2���� ������ �޾� 2���� ���� �� 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ� close10�� ��������.
		
		int num1 =11;
		int num2 = 5;
		int result = close10(num1,num2);
		System.out.println("10�� ����� �� : " + result);
	
		
		
		
		
		
	}
	public static int close10(int num1, int num2) {
		int result = 0;
		
		int dNum2 =10-num2; //-> ������ ��Ÿ���� ����(�Ÿ�) (�Ϲ������� num1�� num2�� ���ϴ°� �ƴ϶� 10���� �Ÿ��� �˾ƾ���!)
		int dNum1 = 10-num1;		//�Ÿ��� �Ƿ��� ���������
		
		
		if(dNum2<0) {		//-> ���࿡ �Ÿ����� -�� -1�� �����༭ ����� ������ִ� if�� (���̸� �Ÿ��θ�����ִ� ���ǵ�)
			dNum2 = -1*dNum2;
		}
		
		if(dNum1<0) {
			dNum1 = -1*dNum1;
		}
		//���� �Ÿ����´� ������ ���Ե�!
		
		
		if(dNum1>dNum2) {		//�Ÿ����� ���Ѱɷ� ���� �� �������� 10�� �����Ŷ�� �����ϴ� if��
			result = num2;
		}else if(dNum1<dNum2) {
			result = num1;
		}
		return result;
	}

}
