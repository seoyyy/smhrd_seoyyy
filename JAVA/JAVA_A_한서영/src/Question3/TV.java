package Question3;

public class TV {

	int channel;
	String color;
	
	
	public void print() {
		System.out.println("TV�� ���� ä���� : " + channel + "�̰�, TV�� ������ "+ color + "�Դϴ�.");
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
}
