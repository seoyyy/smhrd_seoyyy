
public class StudentMain {

	public static void main(String[] args) {
		
	
//	Student seoyoung;
	//��������Ŭ������ �ڷ����� �� -> int�� Stringó��
	//�� �ڷ����� ����ϱ� ���� ���� �����ؼ� �������ʿ�.
	
	//seoyoung�̸������� ������ ������Ÿ���� Student
	//student Ŭ������ �´� �����͸� �� ������ �־��ټ�����
	
	//int�� �����Ϳ� ���������ϰ� ����5�� �־��ִ� ��ó�� 
		//Student��� ������������ ���� seoyoung������ 
		//����ڰ� ���Ƿ� ������ studentŬ������ �´� ũ���� �����͸� �־��ٰԿ�->new ��� Ű������
	Student st1 = new Student(); //new => ������ ������ٰԿ�(�Ҵ����ٰſ���)
	//Student() -->������
	//�� �ش��ϴ� ������ StudentŬ����Ÿ�Ը�ŭ�� ������ ���� �ش��ϴ� �����͸� seoyoung�̶�� ������ ����ٰԿ�

	//��������� ��ü���� -> �������� ���������� seoyoung�̶�� studentŬ������ �ִ� ��ɹ��������� ����.
	//-> Ŭ������ �ִ� �����Ϳ� ����� ����� �� �ִ�.!
	//->�ν��Ͻ� ����Ҹ�
	
	//��������ϸ� �ȿ� ������ ������� -> �� ĭ�� �� ������ �־���~ �� �����͸� ���������
	st1.name = "����";
	st1.number ="123456";
	st1.age = 26;
	st1.scoreJava = 80;
	st1.scoreWeb = 80;
	st1.scoreAndroid = 80;
	
	//���� �� �����͵� �ҷ��ü� ����
	
	System.out.println("�̸�:" + st1.name );
	System.out.println("�й�:" + st1.number );
	System.out.println("����:" + st1.age );
	System.out.println("�ڹ�����:" + st1.scoreJava );
	System.out.println("������:" + st1.scoreWeb );
	System.out.println("�ȵ���̵�����:" + st1.scoreAndroid );
	
	
	Student st2 = new Student();
	st2.name = "����";
	st2.number = "20210307";
	st2.age = 21;
	st2.scoreJava = 90;
	st2.scoreWeb =100;
	st2.scoreAndroid = 80;
	
	
	System.out.println("�������:"+st2.studentAvg());
	  //->Ŭ�������ִ� ��� �ҷ�����
	System.out.println("������� : "+st1.studentAvg());
	

	//st1�� st2�� ���� ����� �˰� �;��
	//->��ձ��ϴ� ��� ������ֱ�(�޼ҵ�� ������ָ��)
	//���⿡ �ϴ°� ��ȿ����! studentŬ������ ����� ������ֱ� 
	
//	System.out.println("�л�1��� :" + avg(st1.scoreJava,st1.scoreWeb, st1.scoreAndroid));

	}
//	public static int avg(int java, int web, int android) {
//		int result = (java + web+android)/3;
//		return result;
	}


