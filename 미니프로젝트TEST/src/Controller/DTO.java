package Controller;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DTO {
	//


	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	Statement stmt;
	Scanner sc = new Scanner(System.in);

	// ��� Ȯ���� �� �ִ� ����
	int cnt = 0;

//	public void getconn() {
//		// ����̹� ���� �� �����ͺ��̽� ���� (1&2�� ����) �޼ҵ�
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
//			String db_id = "campus_a_0310_4";
//			String db_pw = "smhrd4";
//
//			conn = DriverManager.getConnection(url, db_id, db_pw);
//
//		} catch (Exception e) { // ��� ���� �� ���� ��� ���� Exception
//			e.printStackTrace();
//
//		}
//	}

	// ���� �����ϴ� �޼ҵ� ����
//	public void close() {
//		try {
//			if (rs != null) {
//				rs.close();
//			}
//			if (psmt != null) {
//				psmt.close();
//			}
//			if (conn != null) {
//				conn.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

//	public int insert(String id, String pw) {
//
//		getconn();
//
//		try {
//
//			String sql = "insert into player values(?, ?, 0)";
//			psmt = conn.prepareStatement(sql); //�ڹٿ��� ��� sql ���� ��ȯ�ϴ�(�Ѿ���ϴ�)��� 
//
//			psmt.setString(1, id);
//			psmt.setString(2, pw);
//			// sql ���� ���� ��û�ϱ�
//			cnt = psmt.executeUpdate(); //���ͱ�� !
////			cnt�� 0�̳� 1ó�� int������ ��µ�. 0�� �������߾ȵǼ� false, 1�� ������ �ߵǼ� true��� �� 
////			�׷��� �� �μ�Ʈ�糪 ��� Ȯ�ο� ����Ҽ�����.
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		close();
//
//		return cnt;
//
//	}

//	public int checkID(String new_id, String pw) {
//		getconn();
//		int cnt = 0;
//
//		try {
//
//			String sql = "select * from player where id=? AND pw= ?";
//
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, new_id);
//			psmt.setString(2, pw);
//
//			// executeUpdate() -> Table�� ������ �ٲ� �� ex. ����,����,����
//			// executeQuery() -> ���� �� �İ� �ٲ��� ���� �� ex.select
//			rs = psmt.executeQuery();
//
//			// id, ��й�ȣ�� ��ġ�� �� 1, ��ġ���� ���� �� 0
//			if (rs.next()) {			//����Ǽ� �״��� �ٿ� ������ �����Ͱ� ������ 1, ������2
//				cnt = 1;
//			} else {
//				cnt = 0;
//			}
//		}
//
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		close();
//		return cnt;
//
//	}

//	public void rank() {
//		getconn();
//
//		try {
//			String sql = "select * from player order by money desc";
//			psmt = conn.prepareStatement(sql);  //sql���� �ڹٿ��� ���� ��ȯ�ϤѴºκ�
//			rs = psmt.executeQuery(); //����ó���κ�
//
//			while (rs.next()) { // �÷����� �����κ����ΰ����ű⿡ �����Ͱ� �ֳ���?
//				System.out.print(rs.getString("ID") + "\t");
//				System.out.println(rs.getString("MONEY") + "\t");
//			}
//			System.out.println();
//			close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		close();
//
//	}

	int fail = 0;
	int amount = 0;

	public void game(String id) {
		getconn();
		try {
			String sql = "select s.* from (select burger,recipe,num,price from hamburger order by DBMS_RANDOM.VALUE) s where rownum < 2 ";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			rs.next();
			
			int correctNum = rs.getInt("num");
			String correctBurger = rs.getString("burger");
			String correctRecipe = rs.getString("recipe");
			int correctPrice = rs.getInt("price");
			
			System.out.println();
			System.out.println();
			System.out.println(correctBurger + " : " + correctRecipe);
			System.out.println("[1]�� [2]��� [3]ġŲ��Ƽ [4]������Ƽ [5]�丶�� [6]����� [7]�����߳��ҽ� [8]ĥ���ҽ� [9]ġ��");
			System.out.println();

			try {
				System.out.println("�� �ܿ����� enterŰ�� �����ּ���~");
				System.in.read();  		//enterŰ ������ �Ѿ�� ��� 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			for (int i = 0; i < 50; i++) {
				System.out.println();
			}
			System.out.println("[1]�� [2]��� [3]ġŲ��Ƽ [4]������Ƽ [5]�丶�� [6]����� [7]�����߳��ҽ� [8]ĥ���ҽ� [9]ġ��");
			int answer = sc.nextInt();
			if (answer == correctNum) {
				System.out.println("�����Դϴ�!");
				amount += correctPrice;
				
				try {
					String sql1 = "update player set money=? where id = ?";
					psmt = conn.prepareStatement(sql1);

					psmt.setInt(1, amount);
					psmt.setString(2, id);
					
					// sql ����(update,insert��) ���� ��û�ϱ�
					cnt = psmt.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();
				}
				

			} else {
				System.out.println("�����Դϴ�");
				fail++;
				if (fail == 5) {
					System.out.println("GAME OVER!");
					System.exit(0);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

}
