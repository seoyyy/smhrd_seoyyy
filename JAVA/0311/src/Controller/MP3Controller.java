package Controller;

import java.util.ArrayList;

import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {

	//controller : �𵨰� �並 �������ִ� ����
	// -���̳� �信 ���� ������ �˾ƾ��Ѵ�.(��Ʈ�ѷ� Ŭ������ �𵨰� �並 �������ִ� ����ٸ���������)
	//- �� �Ǵ� ���� ������ �����Ͽ� ��ü�ؾ� �Ѵ�. 

	
	//��� �뷡�� �����ϱ� ���� ��������Ʈ ����!
	ArrayList<MusicVO> musicList = new ArrayList<>(); 
	
	// ���° �뷡���� ��� ����? --> �ε����� �Ǵ� �� �� �ִ�!
			int index = 0; //������, ������ ��ȯ�� ���� ����
		
	//�������� mp3���		
	MP3Player player = new MP3Player();		
			
	
	//1. ��� �뷡�������� ���� �� �ִ� �����ڸ޼ҵ� ����
	public MP3Controller() {
		MusicVO music1 = new MusicVO("��" , "Rain", 100,"C://music/Rain - ��.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla" , "Itzy", 120,"C://music/Itzy - Dalla Dalla.mp3");
	//	MusicVO music3 = new MusicVO("SOLO" , "JENNIE" , 200);
		
		//���� ����Ʈ�ȿ� �뷡�� �ְ�;��!	
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(new MusicVO("SOLO" , "JENNIE" , 200,"C://music/JENNIE - SOLO.mp3"));	
	}
	
	//2.����� ���� �Ϲ� �޼ҵ� ����
	public void playing() {
		 
	 show(musicList, index);
		player.play(musicList.get(index).getPath());
	}
	
	//3.������ ����� ���� �޼ҵ�
	public void show(ArrayList<MusicVO> musicList, int index) {
		System.out.print( "���� : "+musicList.get(index).getMusicName());
		 System.out.print( "���� : "+musicList.get(index).getSinger());
		 int minit = musicList.get(index).getPlayTime()/60;
		 int secon = musicList.get(index).getPlayTime()%60;
		 System.out.print( "�ð� : "+minit+ "�� "+secon+"��");
		 }
	//4.�뷡 ������ ���� �޼ҵ� ����
	public void stoping() {
	 player.stop();  //_< �뷡��������ִ� ���
	}
	
	//5. ������ ��� -> nextPlay()
	public void nextPlay() {
	 if(index >= musicList.size()-1) {
		 System.out.println("���� ���� �����ϴ�.");
	
	 }else{
	 index++;	 
	 
	 show(musicList, index);
	 //�뷡�� ��������� �ƴ��� �Ǵ�! ���� �뷡�� �������̸� ��������ϴѱ�! �뷡��������̸� �������
	 if(player.isPlaying()) {
		 player.stop();
	 }
	 //���������� �ѱ���ִ� ���
	 player.play(musicList.get(index).getPath());
	 	 }
	}
	
	//6.������ ��� -> prePlay()
	public void prePlay() {
	 if(index>0) {
	 index--;
	 
	 if(player.isPlaying()) {
		 player.stop();
	 }
	 
	 player.play(musicList.get(index).getPath());
	 
	 show(musicList, index);			 }
	 else {
		 System.out.println("���� ���� �����ϴ�.");
	  }
	 
	 
	 
	}
}
