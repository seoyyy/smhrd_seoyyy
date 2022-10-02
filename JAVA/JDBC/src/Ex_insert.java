import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//JDBC �������(4�ܰ�)
	//0.(�����۾�) ojdbc6.jar ���� �����ϱ� (�� �����Ͽ� ������ִ� ���ϵ��� �ٿ�ޱ�)
	//1.JDBC ����̹� �ε�
	//2.�����ͺ��̽�����
	//3.SQL�� ����(����)
	//4.��������(��������)
		
		//�ڹ��� ����
		//1.������ ����: �������� ����(��Ÿ ��)
		//2.��Ÿ�� ���� : ���������� ������ �߻����� ������ ����� ������ �߻��ϴ°� -> �ٿ�ĳ����, ����̹���ġ 
		
		//��ü ������ ���� �������� �����ϱ� (�ʱ�ȭ������ֱ� null��)
		PreparedStatement psmt = null;
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		
		//1.����̹� �ε� -> Class.forName()
		try { // ������ ������ �� �� �ִ� ���, ����ó���� �ʿ��� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2. �����ͺ��̽� ���� 
		//-> DriverManager.getConnection(�����ͺ��̽��ּ�,���̵�,��й�ȣ)  ����Ʈ�ʿ�
			//���� �Ű������� ������ �����ؼ� �־��ֱ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			 conn = DriverManager.getConnection(url, db_id, db_pw);
			//����Ʈ �ʿ�
			
//			if(conn != null) {
//				System.out.println("���� �����Դϴ�!");
//			}
			 
			 System.out.print("���� ���̵� : ");
			 String id = sc.next();
			 System.out.print("���� ��й�ȣ : ");
			 String pw = sc.next();
			 System.out.print("���� �̸� : ");
			 String name = sc.next();
			 System.out.print("���� ���� : ");
			 int age = sc.nextInt();
		
			 
			//3.sql ����
			//csm, 0117, ä����, 22
//			String sql = "insert into members values('"+ id +"', '" + pw+ "', '" + name + "', "+ age + ")";
	
			 String sql = "insert into members values(?, ?, ?, ?)"; //->���������𸣴ѱ� ?, ���� �����ϰ������ �׳� �� ���ڳְ� �Ʒ��� �������ذ� �ּ�ó��
			 
			 //sql���� db�� conn�������̿��ؼ� �����ϱ�
			 psmt = conn.prepareStatement(sql);
			 
			 psmt.setString(1,id);  //-> java�� 0�����ͽ��������� db������ 1���� ������
			 psmt.setString(2,pw);
			 psmt.setString(3,name);
			 psmt.setInt(4,age);
			 
			//sql���� ���� ��û�ϱ� (db���� ����ġ����
			int cnt = psmt.executeUpdate();
			
			if(cnt >0) {
				System.out.println("insert ����!");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			//try�������� ����� �߻��Ǵ� ������ ���� ó���� �� �ִ� ���
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
			
			
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ����");
			e.printStackTrace();
	
		//4.��������->�ݾ��ִ� ������ �߿�(��������)
			//try,catch ��𼭵� ������� ����̵ƴٸ�
			//�ݵ�� �������� ���� �����ϱ� !
		}finally {
			
				try {
					if(psmt != null) {  //if���� try�ȿ� ���ִ°� ����
					psmt.close();
					}if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		}//main

		
		
		
	}//clasee

