
public class Person {

//�̸�
	private String name;
//����
	private int age;
//Ű
	private int height;
//������
	private int weight;
	
	 //person�̶�� �ϴ� �޼ҵ带 ����. 
	 //��ȯŸ���� ����!
	 //->������ ��� �θ� = Ư���� �޼ҵ��. -> Ŭ������ŭ�� ������ �Ҵ��Ѵ�. ��� ��� 
	 //Ư¡ 1. �޼ҵ� �̸��� ������ Ŭ���� �̸������ƾ��Ѵ�. 2.��ȯŸ���� ���� ���� ��ü�� ���� �ʴ´�
	 
	// public Person() {} ===> person()�̶�� defalut �����ڰ� ���� (������ ������ ����)
	// 						Ŭ������ ���鶧 �ڵ����� ����� ���� �༮
	 //						���ο� �����ڸ� �Ʒ�ó�� ����� �ִ� ���� ������!
	// 						���ο� �����ڸ� ����ڿ� ����ϰ� �ʹٸ� ��������Ƿ� ���������Ѵ�.
	 
	 
	 //�����͸� �޴� ���ο������ ����!(���� ����Ʈ������ ������)
	 //������ -> Ư���� �޼ҵ��(������ü�� ���� ������)
	 public Person(String name, int age, int height, int weight) {
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
	 }
	//����Ʈ ������ ���Ƿ� �ٽø�����ֱ�
	 public Person() {
		 
	 }
	//������ �����ε�==>�����ε� ���� Person()���̸����� �ٸ� �Ű�ä�� �������۾��ϴ� �������ε��� ���� 
	 
	//�����͸� �޾Ƽ� �����������ϰ� ���Ƴ��� name�̶�� �ʵ尪�� �����Ű�� �������->��ȸ�ϴ±�ɸ���� 
	public void setName(String name) {
		this.name = name; //���� �Ű����� name�� �޾Ƽ� this��Ŭ�������ִ�name�� ��name�� �������
	} 
		public void setAge(int age) {//���常�ϰ������ѱ� int�ƴϰ� void
		this.age = age;
	}
		
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public void setHeight(int height) {
			this.height = height;
		}
	//��ȸ�ؼ� �����س� name�� ��ȸ�ؼ� �������� ��ɸ����
	public String getName() {
		return name;		
	}
	public int getAge() { 
		return age;
			}
	public int getWeight() {
		return weight;		
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public void getData() {
		System.out.println(name+","+age+","+weight+","+"height");
	}
//	public Person(String name, int age, int height, int weight) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
//	}
	 
	 
	//���ٿ� ��ȸ�� �޼ҵ�
	//�̸��� �����Ҽ��ִ� setName() -->��ȯŸ�Ծ��� void
//	public void setName(String name) {
//		this.name = name; 
		//this Ű����� ���� Ŭ�������� �ִ� �ʵ带 ��Ȯ�� ¤���ٶ� ����ϴ� Ű���� (�Ű������� �������������ѱ� �����ϱ�����)
//	}
	
	//name�� �������ּ���
//	public String getName() {
//		return name;
//	}
	
	
	
	
}
