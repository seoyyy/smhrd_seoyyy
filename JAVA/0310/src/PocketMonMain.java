import java.util.ArrayList;
import java.util.Random;

public class PocketMonMain {

	public static void main(String[] args) {
		
		//������ �޼ҵ�, ���ͼ���
		
		//��ü : ���赵�� ���ؼ� ������ ��������� ��
		//���赵 -> ��üȭ �Ǵ� �̰����� �ν��Ͻ� ȭ��� ��. �׸��� ������ ����������𰡰� ��ü
		
		//��ü�� �����ϴ� Ű����? new 
		PocketMon mon1 = new PocketMon("��ī��", "����",30,100,40);
		//���� ����� ���� ���ϸ� ���� �����ϱ� ==>������� ��������ִ� ���1��
//		mon1.name = "��ī��";
//		mon1.type = "����";
//		mon1.attack = 30;
//		mon1.hp = 100;
//		mon1.defence = 40;
		
		//�����ڸ޼ҵ� -> ��ó�� ���������ü�� ������� �� ����ü�� ������ ����ִ°� �ƴ϶�, ����ü�� ���鶧 ���� ������ ����
		//2�ܰ�� �̷���� �� 1�ܰ�� ���̱����ؼ� ����.
		
		//��ü�� �����԰� ���ÿ� ���ϴ� �Ӽ��� �����ϱ� -> ������ �޼ҵ� ���!  ==>������ �����ε��������.Ŭ������
		PocketMon mon2 = new PocketMon("���̸�","��", 30, 55, 60);
		
		System.out.println("mon1�� �̸�  : "+ mon1.getName());
		System.out.println("mon1�� Ÿ��  : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2�� �̸� :" + mon2.getName());
		System.out.println("mon2�� Ÿ�� :" + mon2.getType());
		
		//���ϴ��� ����(������ �ٲ���� �ǵ鿩����) ==> ���赵�� ���������� private�� ��ȣ���ֱ�
		//mon1.type = "��";
		
		mon1.setAttack(60);
		
		//��ü�迭(�ּ�) �����ϱ�  ==> ũ�Ⱑ������ 
		PocketMon[] ball = new PocketMon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		//==> ��ü�迭�ּҸ����� .getName�����ɷ� ���������ڴٴ� ��ɾ� ���������
		System.out.println(ball[0].getName());
		
		
		//ũ�Ⱑ �������� ���� �迭 -> ���� ����Ʈ -> ArrayList
		//<E> -> �̲����� ���׸��̶�� �θ�
		ArrayList<PocketMon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2);		//�������߰��ϱ�
		
		//������ ������ϱ� 
		//mon1��ü������ arrayList�����Ҷ� get�̶�� �޼ҵ� ����ؾ���
//		System.out.println(balls.get(0).getName());
//		System.out.println(balls.get(0).getType());
//		System.out.println(balls.get(0).getAttrack());
//		System.out.println(balls.get(0).getHp());
//		System.out.println(balls.get(0).getDefence());
//		
		
		for(int i = 0 ; i < balls.size();i++) {
			System.out.println(balls.get(i).getName());
			System.out.println(balls.get(i).getType());
			System.out.println(balls.get(i).getAttrack());
			System.out.println(balls.get(i).getHp());
			System.out.println(balls.get(i).getDefence());
			System.out.println();
		}

		Random rd = new Random();
		int num = rd.nextInt(balls.size());
		
		
		
	}

}
