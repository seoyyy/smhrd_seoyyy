package Question3;
public class Question3 {

	public static void main(String[] args) {
	
		TV t = new TV();
		
		t.channel = 7;
		t.color = "red";
		t.print(); //���� tv�� �������
		t.channelUp();
		t.channelUp();
		t.print();
		t.color = "black";
		t.channelDown();
		t.print();
		
		
		
		
		

	}

}
