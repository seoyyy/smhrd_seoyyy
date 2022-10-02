package hint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuDAO {
//�����ͺ��̽��� �����ϴ� ������ Ŭ����
	
	
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";  //����Ŭ�翡�� ����url�ּ�  localhost-�������ڵ带�ۼ��ϰ��ִ� ������ǻ��db�� �����Ѵ�
	private String id = "hr";
	private String pw ="hr";
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement psmt;
	
	
	//���޴������� select�ؿü��ִ� �޼ҵ�(������ ��ȯ���ִ�-����Ÿ������������ �߿�-�������� �޴��� �ѹ��� �������ִ� �迭�̳� ��̸���Ʈ ��밡��)
	//-menudto�� �޴� �Ѱ����� �����ִ� Ŭ��������
	public ArrayList<MenuDTO> selectAll() {
		ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();
		
		try{
			conn = getConnection();
		//������ �������� ���ܰ�� ������ ����ֱ�
		
		
		// 3. SQL�� �غ�
		
		String sql = "select * from menu";   //->sql�� �غ񰡳����� �̰ſ����� ��ü������
		 psmt = conn.prepareStatement(sql);  //->�� �غ�Ϸ��� sql�� ������
		
		
		
		// 4. SQL�� ����
		 rs = psmt.executeQuery();
		
		// 5. ������ ó��
		while(rs.next()) {
			int menu_num = rs.getInt("menu_num");
			String menu_name = rs.getString("menu_name");
			int menu_price = rs.getInt("menu_price");
			
			MenuDTO dto = new MenuDTO(menu_num, menu_name, menu_price);
			
			list.add(dto);
			
		}
		
		// 6. ���� ���� (������������ϴ����� : ��θ������ʰ� �״�γ��ΰԵǸ� �����ǻ�Ϳ� �����ϰ� �ü�����) - �������δݾ��ֱ�
		
		
		
		
		
		}catch(ClassNotFoundException e) { //�� ����̹� ��ο��ִ� Ŭ������ ã�� �� ������ 
			e.printStackTrace();
		}catch(SQLException e) { //sql�� �����������Ѱ�� ��������ֱ� 
			e.printStackTrace();
		}finally {
			try {
			close(); //try������ ���ܰ��߻��ϴ��� ��ŵ�����ʰ� ������ �����ϴ±���
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	private void close() throws SQLException {
		if(rs != null) rs.close();
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
	}

private Connection getConnection() throws ClassNotFoundException, SQLException {
	//1. ����̹� �ε� 

	//����̹����������� (jar���ϷεǾ���ִ°�)-��� ȸ�糪 ������ ����. ��� ���� �����ص� �����̰����ϵ���(�߰��� �ٸ�ȸ�粬 �ᵵ ���Ƴ�����ֵ���) ���� �������ϴ�ȸ���� ����̹��� ����ؼ������������.
	//��ȸ�縶�� ����̹��� ���Ϸ� ������

	//���Ͽ������ְ� ���� �������� ����ϰڴٴ� �ڵ��ۼ�

Class.forName(driverName); 

//����ó�������༭ �������������ƴ� ��Ÿ�������� �����߿� �˼��־ �����߿�����θ��µ� �װ� ����� - ���������Ű��� �������� try�ȿ� �־��ְ� catch�� ����ܰ������� �����ֱ�


	

// 2. �����ͺ��̽� ����

Connection conn = DriverManager.getConnection(url,id,pw);  //�����̶�°� ��ü�� ��ü�� �����ϱ� 
	return conn;
}
	
	
	
	
	
}
