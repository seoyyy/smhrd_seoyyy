import java.util.ArrayList;

public class ExArrayList01 {

	public static void main(String[] args) {
		
	//�迭�� �Ѱ� : �̹� ũ�⸦ ������ ������ �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲ� �� ����. 
	//�迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList ->����Ʈ�������
	
	//ArrayList������    
	//ArrayList<�迭�� �� �������� Ÿ��> ��̸���Ʈ��(�迭��) = new(�迭�̽�������ġ�� �������) ArrayList����������ġ<String>();
	ArrayList<String> nameArray = new ArrayList<String>();		//���Ӿ�̰� �����Ұſ���!
	//�������߰�(�ֱ�)  .add("�ְ����������");
	//add��� �޼ҵ�� �����͸� �Է��� ������� �迭�� �������ٵ���. �� �� �ڷ� �������� ���δ�.
	nameArray.add("��ȯ��");
	nameArray.add("����");
	nameArray.add("������");
	nameArray.add("���ν�");
	nameArray.add("�ڿ���");
	
	//��������� - araylist�� �����͸� �����ö� .get(�ε�����ȣ)
	//��ȯ�����
	System.out.println(nameArray.get(0));
	System.out.println(nameArray.get(1));
	

	//arrayList ũ�� -> .size()  ==�Ϲ� �迭������ length�� ����!
	for(int i = 0; i < nameArray.size(); i++) {
		System.out.println(nameArray.get(i));
	}
	
	////������
	
	
	//������ ���� ! .remove(�ε�����ȣ)   //�׵����Ͱ� �ִ� ������ ������� �����͵����ε����� �մ���� (ũ�Ⱑ �þ����پ�����, but�Ϲݹ迭���װԾȴ�)
	//� Ư�� ���ǿ��� �ش��ϴ� �����͸� ����������!
//	if(�������� ������ ���ٸ�) {
//		nameArray.remove(2);
//	}
	nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//�߰��� ������ ����! .add(���� �ε�����ġ��ȣ, ����������)   �� add�� �����ε��Ȱ�
		nameArray.add(1, "����");
		
		for(int i = 0; i < nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		nameArray.add(4, "�ֶ�");
		for(int i = 0; i < nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		//-->ArrayList�� ���� Ÿ���� ���۷���Ÿ�Ը� �����ϴ�(�⺻�ڷ���Ÿ�Ծ�������)
		//�⺻������ Ÿ������ ��̸���Ʈ�� ������ֱ� ���ؼ��� �⺻������Ÿ���� ǥ���� �� �ִ� Ŭ������ Ȱ�����ָ�ȴ�.
		// ex) int Ÿ���� -> Integer��� �����ֱ�
		//ArrayList<Float> nameArray = new ArrayList<Float>();
		
	}

}
