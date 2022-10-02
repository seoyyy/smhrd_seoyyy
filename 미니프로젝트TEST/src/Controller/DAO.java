package Controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
//���̺��̽��� �����Ѱ� ���⿡ 
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	Statement stmt;
	
	
	int cnt = 0;
	
	public void getconn() {
		// ����̹� ���� �� �����ͺ��̽� ���� (1&2�� ����) �޼ҵ�

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_a_0310_4";
			String db_pw = "smhrd4";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (Exception e) { // ��� ���� �� ���� ��� ���� Exception
			e.printStackTrace();

		}
	}
	
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(String id, String pw) {

		getconn();

		try {

			String sql = "insert into player values(?, ?, 0)";
			psmt = conn.prepareStatement(sql); //�ڹٿ��� ��� sql ���� ��ȯ�ϴ�(�Ѿ���ϴ�)��� 

			psmt.setString(1, id);
			psmt.setString(2, pw);
			// sql ���� ���� ��û�ϱ�
			cnt = psmt.executeUpdate(); //���ͱ�� !
//			cnt�� 0�̳� 1ó�� int������ ��µ�. 0�� �������߾ȵǼ� false, 1�� ������ �ߵǼ� true��� �� 
//			�׷��� �� �μ�Ʈ�糪 ��� Ȯ�ο� ����Ҽ�����.

		} catch (SQLException e) {

			e.printStackTrace();
		}

		close();

		return cnt;

	}
	
	
	public int checkID(String new_id, String pw) {
		getconn();
		int cnt = 0;

		try {

			String sql = "select * from player where id=? AND pw= ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, new_id);
			psmt.setString(2, pw);

			// executeUpdate() -> Table�� ������ �ٲ� �� ex. ����,����,����
			// executeQuery() -> ���� �� �İ� �ٲ��� ���� �� ex.select
			rs = psmt.executeQuery();

			// id, ��й�ȣ�� ��ġ�� �� 1, ��ġ���� ���� �� 0
			if (rs.next()) {			//����Ǽ� �״��� �ٿ� ������ �����Ͱ� ������ 1, ������2
				cnt = 1;
			} else {
				cnt = 0;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		close();
		return cnt;

	}
	
	
	
	public void rank() {
		getconn();

		try {
			String sql = "select * from player order by money desc";
			psmt = conn.prepareStatement(sql);  //sql���� �ڹٿ��� ���� ��ȯ�ϤѴºκ�
			rs = psmt.executeQuery(); //����ó���κ�

			while (rs.next()) { // �÷����� �����κ����ΰ����ű⿡ �����Ͱ� �ֳ���?
				System.out.print(rs.getString("ID") + "\t");
				System.out.println(rs.getString("MONEY") + "\t");
			}
			System.out.println();
			close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		close();

	}

	

}
