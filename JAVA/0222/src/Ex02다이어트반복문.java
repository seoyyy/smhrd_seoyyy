import java.util.Scanner;

public class Ex02���̾�Ʈ�ݺ��� {

	public static void main(String[] args) {
		
		//1.��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		
		
		//2.��������� ��¹�����
		//2-1. ��������� �Է�
		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		//3.��ǥ������ ��¹� ����
		//3-1.��ǥ������ �Է�
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		
		//4. �ݺ����� 
		//n����(->1�������ϴ� �������) ���� ������ ��¹�����
		//�����Ը� �Է�
		int week = 1;
		int weight = 0;
		while(true) {
			System.out.print( week + "���� ���� ������ : ");
			weight = sc.nextInt();
			week++;
			//���� �����Ը� ����ϴ� �����ۼ� (��������� - ����������) ->�����̵Ǹ鼭 ���ټ��ְ� ���մ��Կ����ڻ��
			System.out.println("���� ������ : " + (now-=weight));
			//���ߴ� �����ֱ�
			if(now<=goal){
				System.out.println("�����մϴ�!");
				break;
			}			
		} 

	}

}
