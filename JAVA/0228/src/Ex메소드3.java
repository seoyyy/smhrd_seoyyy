
public class Ex�޼ҵ�3 {

	public static void main(String[] args) {
		
	//�ΰ��� ����� �޾� 2���� ���� �� �� ū���� ��ȯ�����ִ� �޼ҵ� lagerNumber ������
		// ���� �μ��ڰ� ���ٸ� 0�� ��ȯ
		
	int num1 = 24;
	int num2 = 24;
	
	int result = lagerNumber(num1,num2); //����� ��ū�� result��� ������ ����ְڴ�(����),������ū���Ǻ��� �޼ҵ尡! �� �޼ҵ� ȣ��
	System.out.println("ū �� Ȯ�� : " + result); 
		
		
		
		
		
		
	}
	public static int lagerNumber(int num1, int num2) {
		
		int result = 0; //�� result������ �����͸� ��Ƽ� ��ȯ�����ٰ� //�׸��� 0���� �����س��� �μ��� ������ ��if�� �ش�ȵǼ� 0�� �״�� ���
		
		if(num1>num2) {
			result = num1;
		}else if (num1<num2) {
			result = num2;}
//		else {
//			result = 0;
//		}
//		
	//���׿����� �̿��ص� ����
		
		
		return result;
		
	}

}
