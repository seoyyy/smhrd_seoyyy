package hint;

public class MenuDTO {

//	�ٸ� �����̳� ������ ��������
//	�ڱ���� �ʵ带 �������ְ� �׾ȿ� ������ �ִ� �����͸� �̵������ִ� ���Ҹ���
	
	
	//�ְ� �������ִ� �����͵��� 
	
	//�����͸� ǥ��,�����ϱ� ���� �ʵ� 
	private int menu_num;
	private String menu_name;
	private int menu_price;
//	-�޴��ϳ��� ���� ������ ���� -> �׸��� �׾ȿ� 3���� �÷� ����
	
	
	
	
	//�޼ҵ�
	//1.������ �ʱ�ȭ �� ��ü ������ ���� ������ 
	//2.������ ������ ���� setter�޼ҵ�
	//3.�����͸� �����ֱ� ���� getter�޼ҵ� (�� �ʵ���� private�� ���������� ��ȸ�ϴ�����)
	
	//�ʵ���� �ʱ�ȭ�Ҽ��ִ� ������ 
	public MenuDTO(int menu_num, String menu_name, int menu_price) {
		super();
		this.menu_num = menu_num;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}
	
	
	public int getMenu_num() {
		return menu_num;
	}
	public void setMenu_num(int menu_num) {
		this.menu_num = menu_num;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public int getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	
	
	
	
}
