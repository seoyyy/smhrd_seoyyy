
public class Ex01for������ {

	public static void main(String[] args) {
	
	//������ ���� ���ϴ� ���� +=
	//(77*1)+(76*2)+++++(1*77) �ڿ����� ���ذ����������� ����
	//������� 79079
		int total=0;
		for(int i = 1; i<78; i++){
				total += (78-i)*i;				//�����ϴ� �ڵ�
		}
		System.out.println(total);
		
	}

}
