
public class TellMain {

	public static void main(String[] args) {
	
	Tell t1 = new Tell();
	
	t1.call();
	t1.click();
	t1.send();
		
	Folder f1 = new Folder();
	f1.call();
	//�������̵��� �޼ҵ�� ��ӹ��� �޼ҵ尡 �ƴ϶�
	//���Ӱ� �������� �޼ҵ��� ��ɸ� ���Ǿ�����
	f1.click();
	f1.send();
	f1.folderOpen();
	
		
	
	Slider s1 = new Slider();
	s1.sliderOpen();
	s1.call();
	s1.send();
	
	SmartPhone sm1 = new SmartPhone();
	sm1.smartOpen();
	sm1.call();
	sm1.send();

	//��ĳ���� : �ڽ�Ŭ���� Ÿ�Կ��� �θ�Ŭ���� Ÿ������ �ٲٴ°�!
	//�θ� TellŬ����, �ڽ�Ŭ���� Folder, Slider, SmartPhoneƲ����
	//Ư¡1 : ��ĳ���õ� �Ŀ��� ����Ŭ������ �ִ� �͸� ����� �� �ִ�. 
	Tell t2 = f1;
	t2.call();
	//Ư¡ 2 : �������̵��� �޼ҵ�� ��ĳ���� �ϴ��� ���Ӱ� ������ ����� ���� ��Ų��.
	t2.send();
	//t2.folderOpen(); //t2.folderOpen(); forderopen�� FolderŬ������ ��������̱� ������ ��� x
	
	
	
	}

}
