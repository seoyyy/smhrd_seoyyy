package sy;
import java.util.Scanner;

public class VendingMachine {
	//���Ǳ� Ŭ����  ->�����ϴ� ����̳� ���谡 �ߵ���ִ�
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int money;
	
	 int itemMoney;
	 
	 int choice;
	
	 
	 public void showTitle() {
	 System.out.println("===���Ǳ� ���α׷�===");
	 }

     public void insertMoney(){
    System.out.print("���� �������� >> ");
     money = sc.nextInt();
     }
     
     
     public void chooseMenu() {
    	 System.out.println("�޴��� �����ϼ���");
	     System.out.print("1.��(700) 2.�ݶ�(1000) 3.Ŀ��(500) >>");
		
     choice = sc.nextInt();
     
     if(choice == 1){
         itemMoney = 700;
      }else if(choice == 2){
         itemMoney = 1000;
      }else if(choice == 3){
         itemMoney = 500;
      }
//     }
//     
//     
//      
//     public void showbalance(){
    	 
     if(money - itemMoney < 0){
        System.out.println("���� �����մϴ�.");
     }else{
        money -= itemMoney;
        System.out.println(money+"���� ���ҽ��ϴ�.");
     }
     }
     
	
	
	
	
     
}

