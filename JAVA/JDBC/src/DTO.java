import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTO {
//�����ͺ��̽��� ������ �ϴ� ��ɵ��� �����ϴ� class
	//Database Transfer Object
	
	//1.���� ����̹� ����
	//2.�����ͺ��̽� ����
	//3.sql����(insert, select, update, delete) 
	//4.��������
	
	//�̰������� �޼ҵ�� �����Ͽ� ���� !!
	
	//��ü����
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0; //����� Ȯ���� �� �ִ� ����
 	
	
	public void getconn() {
		//����̹� ���� �� �����ͺ��̽� ���� �޼ҵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
	 conn = DriverManager.getConnection(url, db_id, db_pw);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}
	//�������������� ���� ������ �����ϴ� �޼ҵ� ����
	public void close() {
		
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
	
	//insert����� ���� �޼ҵ� 
	
	public String insert(String id, String pw, String name, int age) {
		getconn();
		
		 //sql���� db�� conn�������̿��ؼ� �����ϱ�
		 try {
			 String sql = "insert into members values(?, ?, ?, ?)";
			 
			psmt = conn.prepareStatement(sql);
			 psmt.setString(1,id); 
			 psmt.setString(2,pw);
			 psmt.setString(3,name);
			 psmt.setInt(4,age);
			 
			 cnt = psmt.executeUpdate();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 close();
		 
		// return cnt;
	
	}
}
