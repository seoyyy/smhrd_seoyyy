package ĳ����;

public class DollMain {

	public static void main(String[] args) {

	
	//���������� ������ ���� Ŭ���� !
		Pika pika = new Pika();
		getDoll(pika);
		
		//���̸� ����
		Piri piri = new Piri();
		getDoll(piri);
		
		//������ ����
		Kkobuck kko = new Kkobuck();
		getDoll(kko);
		
		//��Ÿ��,�̺���,ġ�ڸ�Ÿ ������ �̾��ּ���!
		EVe ev = new EVe();
		getDoll(ev);
		
		Metamong meta = new Metamong();
		getDoll(meta);
		
		Chico chico = new Chico();
		getDoll(chico);
		
		
		
		
	}
	//�����̱� //Doll�� �θ�Ŭ����
	public static void getDoll(Doll doll) {
		//��ĳ���� -����Ŭ������ Ÿ������ ����ȯ�ϴ°� (����Ŭ���� ��ü�� ����Ŭ������ü���ִ°�)
		//1.����Ŭ������ �ִ� �ʵ�� �޼ҵ常 ����� �� �ִ�
		//2.�������̵��� �޼ҵ�� �ڽĿ��� �������� �޼ҵ带 �����Ų��.
		//--->����Ŭ������ ����Ŭ������ �ѹ��� ��Ʈ�� �� �� �ִ�. (����Ŭ������ �ϳ��� ��ü������ ����Ŭ���� ����� ��������)		
	
		
	//��ī�������� �̾������� �鸸��Ʈ�� ������ȭ�� ����ϰ�;�� (�ٿ�ĳ��Ʈ) -run����� ����ϱ����� �Ͻ������� ��ī��Ŭ�����ιٲ������
		//��ĳ���õ� ��ü instanceof ����Ŭ������-> ��ĳ���õ� ��ü�� ��� ����Ŭ�����κ��� ��ĳ���õǾ������� �Ǻ����� 
		if(doll instanceof Pika) { //���� doll�� pika �κ��� ��ĳ���õǾ�Ӥ����ٸ� �Ʒ��� ��������ּ���
			//�ٿ�ĳ�����ؼ� run����� ���
			//doll��ü�� �ٿ�ĳ�������ּ���.
			//����Ŭ������ ��ü�� = (����Ŭ����Ÿ��)��ĳ���õ� ��ü��;
			Pika pi = (Pika)doll;
			pi.run();
		}
		
		doll.get();
		
		//->�ϳ��� ��ü�̸������� ������������� �����Ű���ִ� --> ������
		//(���� ��ü �̸����� �������� ����� ���� ��Ű�� �ִ� )
	}
//�����̱� ��� (�޼ҵ� �����ε�)-�Ȱ����̸����� �ٸ������ �����ϰ������ѱ�
//	public static void getDoll(Pika pika) {
//		pika.get();
//	}
//	public static void getDoll(Piri piri) {
//		piri.get();
//	}
//	public static void getDoll(Kkobuck kko) {
//		kko.get();
//	}
//	public static void getDoll(Metamong meta) {
//		meta.get();
//	}
//	public static void getDoll(EVe ev) {
//		ev.get();
//	}
//	public static void getDoll(Chico chico) {
//		chico.get();
//	}
}
