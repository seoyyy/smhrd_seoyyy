import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_select {

	public static void main(String[] args) {
		
		//��ü ����
		Connection conn = null ; 
		PreparedStatement psmt = null ;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		//1.����̹� �ε� -> class.forName()
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2.������ ���̽� ���� -> DriverManager.getConnection();	
		//������ ��ɾ���� �����ͺ��̽��� �����ϱ����� ����  // ���α׷����� ������ �Ǿ�����.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
		 conn = DriverManager.getConnection(url, db_id, db_pw);
			//����̹��Ŵ����� ���ؼ� url ..���� �������� 
		 psmt = null;
		
		//���̺��� ��ȸ�ϴ� sql�� �ۼ�
		//String sql = "select * from members";
		
		 
		 //����ڷκ��� �˻��� �Է¹ޱ�
		 System.out.println("�˻��� ���̵� : ");
		 String id = sc.next();
		 System.out.println("�˻��� ��й�ȣ : ");
		 String pw = sc.next();
		 
		 //ã�����ϴ� ���ǿ� ���� sql�� ����
	String sql = "select name, age from members where id = ? and pw = ? ";

		 
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);	//���� ? ���Ÿ� �������ֱ� 1���ڸ����� id �ִ´ٰ�
		psmt.setString(2, pw);
		//psmt���� ��������ּ���~
		//excuteUpdate() : ����, ����, ���� ���� ���̺��� ������ �ٲ�� ��
		//excuteQuery() : ��ȸ�� ���� ���̺��� ���İ� �Ȱ��� �۾�
		rs = psmt.executeQuery();
		
		//�����Ͱ� �����Ѵٸ� �ݺ������� Ȯ�� �����ϱ�
		while(rs.next()) {
//			String id = rs.getString(1);
//			String pw = rs.getString(2);
//			String name = rs.getString(3);
//			int age = rs.getInt(4);
//			
//			System.out.println(id + "/" + pw + "/" + name + "/" + age);
//	
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			System.out.println(name + "/"+ age);
		}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
				try {
					if(rs != null) {
						rs.close();
						}if(psmt != null) {
						psmt.close();
					}if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
		}
		

	}

}
