
public class PhoneMain {

	public static void main(String[] args) {
	
	int num = 5;
	//Ŭ������?? �ڷ� + ��� ����� ������ �ڷ��� (intó�� �׷��ڷ���)->�װɻ���ϱ����ؼ� ������ ����������.
	phone lollipop = new phone(); //>��ü ���� -> Ŭ������ �ִ� �����Ϳ� ����� ����� �� �ִ�.
		//new��� Ű���带 ���ؼ� ��ü������ǵ� phoneŬ���� ��ŭ�� ũ���� �����͸� lollipop�̶�� ��ü�� �� �־��ٰſ���.

	//System.out.println("�귣�� : "+ lollipop.brand);
//	lollipop.call();
	//�Ѹ������� ��ȭ�� �ް�;��!
//	lollipop.send();
	
	//System.out.println("��ȭ��ȣ : "+ lollipop.number);

	//���ٲ�. �귣�嵵 �ٲ� ->�̿��°� �������������.
	phone magic = new phone();
	magic.brand ="�ִ���"; //->�ʰ��������ִ� �귣�带 �ִ��ݷ� ������
	magic.number = "01021131231";
			System.out.println("�귣��2 : "+ magic.brand);
	System.out.println("��ȭ ��ȣ : "+ magic.number);
	
	//�������� �޴����� ��ü�� ���� ��� �����ּ���.
	
	phone iphone = new phone();
	iphone.brand = "apple";
	iphone.number = "01022223333";
	System.out.println("�귣�� 3 : "+ iphone.brand);
	System.out.println("��ȭ��ȣ 3 :"+ iphone.number);
	}

	
	
}
