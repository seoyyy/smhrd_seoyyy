
public class Ex05for������ {

	public static void main(String[] args) {
	
	//1-50���� 369������ ����Ͻÿ�. ������
		//���ڸ����� 3,6,9 �϶��� "�ڼ�"�� ��� ->%�������� ���Ҽ� ��/ or���� ||
		//���ڸ����� 5�϶��� "����"�� ���
		// �� ���� ���� ���ڸ� �״�� ����Ͻÿ�.
		
		
//		for(int i = 1; i<=50; i++) {
//			if(i%10==3 || i%10==6 || i%10==9) {
//				System.out.print("�ڼ� ");
//			}else if(i%10==5) {
//				System.out.print("���� ");
//			}else {
//				System.out.print(i + " ");
//			}
//		}
		
		//or ��ȣ ���� Ǯ���
		for(int i=1; i<=50;i++) {
		switch(i%10) {			//-> 1���ڸ��� �����̵ǰ������� ���ذ��ڸ��� �������־��ֱ�
		case 3,6,9 :
			System.out.print("�ڼ� ");
			break; //->break�����ٸ� �ѹ� ���� ���ٸ� �Ʒ� �������� ���� ��������ֱ⶧���� �װ� �����ֱ�����
		case 5 :
			System.out.print("���� ");
			break;
		default:
			System.out.print(i+" ");
			
			
		}
		}
		
	}

}
