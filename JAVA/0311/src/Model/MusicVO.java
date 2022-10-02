package Model;

public class MusicVO {

	//�뷡��� �����͸� ǥ���� �� �ִ� Ŭ����
	//����� ���Ƿ� ���� Ŭ������ ��Ʋ� -> VOŬ����(value object) ����ڰ� ���Ƿθ�������ϸ� ������ voŬ����
	
	//=>MVC���� �� Model�� �ش��ϴ� Ŭ���� !(�׷��� �����Ϳ����ؼ��� �������������)
	// Model : �����͸� �����ϴ°�
	// - �䳪 ��Ʈ�ѷ��� ���� ��� ������ �� �� ����. 
	// -������ ������ �Ͼ�� ó���� �� �ִ� ����� �����ؾ��Ѵ�. -> �׹�����δ� getter/setter�� �ִ�. 
	
	private String musicName;
	private String singer;
	private int playTime;
	
	//�뷡���ϰ��
	private String path;
	
	
	//�����ڴ� ���� Ÿ����?? ��� �ȴ�??? ����..?����
	//���� ��ü�� ���� �ʴ´�!��..???
	//�����ڸ� ���鶧�� void �� int String ���� ���� Ÿ�� ��ü�� ����� �׷��� �ƿ������ϰ� ������ּž� �մϴ�!
	//�����մϴ� ,,,���� ������ �Դϴ�!!!
	///��/����������!
	public MusicVO(String musicName, String singer, int playTime, String path) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	
	public String getMusicName() {
		return musicName;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public String getPath() {
		return path;
	}
}
