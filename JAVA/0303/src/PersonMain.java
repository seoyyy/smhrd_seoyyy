import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
	Person p1 = new Person("��ȯ",20,173,70);  //Person() : ������ ->Ŭ������ŭ�� ������ p1(��ü)�� �Ҵ����ش�.
				//�����͸� ���� ������ �����Ͱ� �Բ� ���������.
	
	//p1�� ���� ��ȯ�� ��¥������ �����ϰ�ʹ�
	p1.setName("��¥��");
	System.out.println(p1.getName());
	
	//���� ���� ����Ʈ�����ڷ� ������ ��������� ���
//	p1.name = "����";	
//	p1.age = 26;
//	p1.height =100;
//	p1.weight = 10;
	//System.out.println("�̸� :"+p1.name);
	
	
	//���� ��ü
	Person p2 = new Person();
	p2.setName("����"); //name�� ��ų��� setName�̶�� ������� ��ȸ�ؼ� name�� ����
	
	System.out.println("�̸�2 :" + p2.getName());
	// setName�� ���ؼ� ��ȸ�ؼ������س� �̸��� getName���� ��ȸ�ؼ� ������
	
	//���ܿ� ���� ��ü�� �ϼ����ּ��� -->������ �ʵ尪�� �����͸� ���� �־��ּ���.
	p2.setAge(21);
	p2.setWeight(70);
	p2.setHeight(173);
	
	System.out.println("����2 :"+p2.getAge());
	System.out.println("����2 :"+p2.getWeight());
	System.out.println("Ű2 :"+p2.getHeight());
	
	
	
	
//	p1.setName("����");
//	System.out.println(p1.getName());
		
		
	//p1-��ȯ��
	//p2-����
	//p3-��� ������ ��ü�� ����� �;��! 20 173 70
	Person p3 = new Person("������",30,175,60);
	//p3��� ���ν� ��ü�� �����;��
	Person p4 = new Person("���ν�", 21, 160, 40);
	//
	//
	//
	//
	//p100

	//�ѹ��� �ٷ���ְԲ� �����͸� �ѹ��� �ٷ� �� �ִ� ���!->�迭
	//(��ü) �迭 ����
	//������Ÿ�� [] �迭�� = new ������Ÿ��[ũ��];
	Person[] pArray = new Person[4];  //�޽�Ÿ���� ��ü�� 4�� ���Ŷ� 4
	//pArray�� ������ �ְ�äо��
	pArray[0]=p1; //int[] numArray = { num1, 20,30} ó�� ����(��ü)�� ���� ����
	pArray[1]=p2;
	pArray[2]=p3;
	pArray[3]=p4;
	
	//pArray�� ����ؼ� ��ȯ���� Ű�� ��½�Ű�� �;��
	//pArray[0] ==> p1
	p1.getHeight();
	pArray[0].getHeight(); 
	System.out.println("��ȯ�� Ű : "+pArray[0].getHeight());
	//pArray�� ����ؼ� ������ ���̸� ������ּ���
	System.out.println("���� ���� :"+ pArray[1].getAge());
	
	//pArray�� ����ؼ� �����Ե��� ��� ���̸� ��½����ּ���
	//System.out.println("��ճ��� : "+(pArray[0].getAge()+pArray[1].getAge()+pArray[2].getAge()+pArray[3].getAge())/4);
	//�ε����� �þ�鼭 �ݺ��ϰ����� -> �ݺ�����밡��
	
	int sum= 0;
	for(int i =0; i <pArray.length;i++) {
		sum += pArray[i].getAge();
	}
	System.out.println("��ճ��� : " + sum/pArray.length);
	

	
			for(int i =0; i <pArray.length;i++) {
				System.out.println( pArray[i].getName());
		 }
		//�����Ե��� ��ü�� ���� �� �ִ� ArrayList�� �����ٽ�
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		//��ȯ�ܿ� ���� ������ ����ϰ�;��!
		//�̸� : ��ȯ
		//���� : 20
		//Ű :173
		//������: 70
		//��ü��̸���Ʈ ����!! �����߿� !!
		
		//��ȯ�̶�� ������ ��ġ(����)�� ���ٺ��� .get()���� / �׸��� �ű⿡�� �̸��������� ->Ÿ��Ÿ���
		//�Ϲ� �迭�̾����� array[]�� �����ü��־��� but  �迭list�� �������� get��ɾ�Ÿ�������
		
		System.out.println(pArrayList.get(0).getName());
		System.out.println(pArrayList.get(0).getAge());
		System.out.println(pArrayList.get(0).getHeight());
		System.out.println(pArrayList.get(0).getWeight());
		
		
		
		//pArrayList�� ����ؼ� �����Ե鿡 ���� ������ ���� ��½����ּ���
		
		
		for( int i = 0; i < pArrayList.size();i++) {
			System.out.println(pArrayList.get(i).getName());
			System.out.println(pArrayList.get(i).getAge());
			System.out.println(pArrayList.get(i).getHeight());
			System.out.println(pArrayList.get(i).getWeight());
			
		}

	}
}
