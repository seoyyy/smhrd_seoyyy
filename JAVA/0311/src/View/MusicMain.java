package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		
		//view : ����ڰ� ����ϴ� ���, �ð������� Ȯ���� �� �� �ִ� �뵵�θ� ���δ�( ������κκи��� �ܽ� �����ִ±׷���)
		//-Model�� ������ �ִ� �����͸� �������� �ʴ´�
		//-�ܼ��� ǥ�ø� �ϴ� ����� ���´�. (�����ټ��ִ� �ܰ�,������)
		
		Scanner sc = new Scanner(System.in);
		
		//controller �͸��������ִ� ��ü ����
		MP3Controller controller = new MP3Controller();
		
		
		
		
		//�뷡�� Main���� �˷��ַ���?--> MusicVO��ü����
		//�� 			Rain	 100
		//Dalla Dalla 	Itzy 	  120
		//SOLO 			JENNIE 	  200
			
		//�޴��� �����ְ� 5�� �Է��ϱ� �������� ��� �ݺ�!
		while(true) {
		System.out.print( "1.��� 2.���� 3.������ 4.������ 5.����>>");
		 int menu = sc.nextInt();
		
		 if(menu == 5) {
			 System.out.println("���α׷� ����");
				controller.stoping();
			
			 break;
			}
		 else if(menu == 1) {
			 //������ ��� �޼ҵ�
			 //������ -->���� �뷡�� ���� ������ ���!
			 //-> ���� index���� �´� �뷡�� ���� ������ ������ּ���.
			 //musicList�� �̿��ؼ�!
			 // ���� : ��, ���� : Rain, �ð�: 1�� 40��
	
			 controller.playing();  //->��Ʈ�ѷ��� ��ɴٸ�Ƴ��� �� ����� �ҷ���
			 
		
		 }else if(menu ==2) {
			 //����
			 System.out.println("����");
			
			 controller.stoping();
			 
		 }else if(menu ==3) {
			 //������
			 //dalla dalla �ε���1������ �Ѿ��(��̸���Ʈ���� �������� �ҷ��������)
		controller.nextPlay();
			 
			 //solo ���� ��µ� ���Ŀ��� �������� �����Ѵٸ� '�������� �����ϴ�.' ��� ������ ��½����ּ���
			
		 }else if(menu ==4) {
			 //������
			 //���뷡 ��� �� �������� ���������� �������� �����ϴ�'��� ��½����ּ���
			
			 controller.prePlay();
			 
		}

		 System.out.println("���α׷�����");
	
		
		
		
		
		}
	}

	
	}

