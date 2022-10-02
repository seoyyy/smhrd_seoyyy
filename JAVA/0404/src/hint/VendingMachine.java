package hint;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
	
	
	private Scanner sc = new Scanner(System.in);
	private int choice;
	private int money;
	private int itemMoney;
	private MenuDAO dao =new MenuDAO(); //db���ӿ� dao��ü ����
	private ArrayList<MenuDTO>menuList;
	
	
	//������ ���Ǳ� ���ο��� kor�̶�� ��ü�� �̾����Ű� �ܺο��� ���������� �ٲ��ֱ�
	//������= ����ü�� �������ϰ� Ŭ�������� �ʵ带 �ʱ�ȭ�����ִ� ���ҵ���
	//�����ڴ� ��ȯŸ���� ���������ʴ� �޼ҵ�
		private Language lang;
	//private Korean kor = new Korean();  //����Ʈ������ -> ���ο��� �ҷ�����
	
	
	//������ : ��ü�� �����Ҷ� ���� ȣ���ϴ� �޼ҵ� / ���� �����ڸ� �ț��� �� �ҷ��ü��־����� ����Ʈ�����λ����ڰ� ����⶧��
	//�������� Ư¡ : ��ȯŸ���� ����, Ŭ�����̸��� �����ڸ޼ҵ� �̸��� �����ؾ��Ѵ�.
	//Ȱ�� �뵵 : ��ü�� �����ϱ� ����, ��ü�� �ʵ带 �ʱ�ȭ�ϱ� ����
	//�����ڸ� ���ؼ� ��ü�� �ҷ����°� �ܺο��� ����ִ°� /�����ڸ����� ��ü�� �ܺο��� �ҷ��°� �ʵ忡 �ְٴ�~
	public VendingMachine(Language lang) { //�����ڸ� ����� �� ���ü��ֵ��� ����
		this.lang = lang;
		menuList = dao.selectAll(); // �޴����� select
		
	}
	
	
	private void showTitle() {		//����ȣ��� �������ؼ� �ܺο��� ȣ�����Ͼ����� private���� �ٲ��ָ��.
	System.out.println(lang.getTitleMSG());
	}
	
	public void inputMoney() {
		showTitle();    //����ȣ�⵵ ����(JDBC�����Ҷ� getconn�� �̹��) ���ο��� �ҷ����� ȣ���� ���ϼ�����->���»���� ���Ǽ����
		System.out.print(lang.getInputMoneyMSG());
		money = sc.nextInt();
	}
	
	public void showMenu() {
		System.out.println(lang.getShowMenuMSG1());
		System.out.print(lang.getShowMenuMSG2(menuList));
		choice = sc.nextInt();
	}
	
	public void calculateChange() {
		itemMoney = menuList.get(choice-1).getMenu_price();
	}
	
	public void returnChange() {
		if (money - itemMoney < 0) {
			System.out.println(lang.getReturnChange1());
		} else {
			money -= itemMoney;
			System.out.println(lang.getReturnChange2(money));
		} 
		//moeny+getReturnchange ó�� �����ϴ°� �ִٸ� �Է����ڷ� �־�������֤� �����ӽ��� money�� ���޼ҵ�ȣ���Ҷ� money�� �Ѱ��ֱ�
	}
	

}
