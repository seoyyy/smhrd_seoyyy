import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	//1.DB���� - conn()
	//2.SQL����κ� 
	//3.close() --> ������� �������� �����ؼ� �����͸� �����ִ� ����ϰ� �� �ݾ������.
		//����ɵ鿡�� �����ϰ� �������� �ݾ��ְ� ���۾��� ������ �� �κ��� �׳� �޼ҵ�� ���� �ʿ��Ҷ����� �ҷ����ž�.
	
	
	//���������ڸ�(���������λ��� �����س��°�)
	Connection conn = null;		//1!  //����Ʈ�ʿ�
	PreparedStatement pst = null; //����Ʈ�ʿ�
	ResultSet rs = null;  //-> select�� ���� ������
	// �� ���� ��ü���� ����� ȣ�������� �����̵� ��ü����  �츮�������� ��ü�鸻�� �ý��ۿ�������ϴ°�ü���� �غ��ؼ� �ֵ��� �� ����ϰ����� �������ֱ�
	
	//connection�޼ҵ� ��������(�����Ҷ� �׻󾲴��ڵ�) (url�̳� id������ �츮���׸°� �����ؼ� �����)
	//�׷��� ������ �����Ҷ� �� conn()�޼ҵ常 ȣ���ؼ� �����
	public void conn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "smart_a_0310_4";
			String dbpw = "smhrd4";
		
			
				conn = DriverManager.getConnection(url, dbid, dbpw);  //1! //DriverManager ����Ʈ�ʿ�
			
		} catch (Exception e) {
			e.printStackTrace();
	}
				
	}
	//close�޼ҵ� --> finally �������뿡 �׻� close �޼ҵ� ������ֱ� 
	public void close() {
		
		try {
			//-> �������(�������) ������ �������� �ݾ��ֱ�
			
			//resultset�� select�Ҷ��������� �� close��� �޼ҵ�� ��� �޼ҵ忡�� �� ȣ���ؼ� ������
			//insert�Ҷ��� update�Ҷ��� ! �׷� insert�� update�Ҷ��� resultSet�Ⱦ��ѱ�
			//�̹��嵵 �ۼ��������(resultSet�� �������� �Ⱦ�����!)
			if(rs != null) {			//�����̾ȉ����� null������ �ʱ�ȭ���ѳ��⶧���� null���� ��������������
				rs.close();						//�׷��� null�� �ƴҶ��� ���� �� �ֵ���
			}
			
			if(pst != null) {		//��׵��� �� ���������� Ȥ�� �Ⱦ����� �����̾ȉ�ٸ�
				pst.close();		//close�޼ҵ带 ȣ���� ������ (��ü ��ü�� ������ ȣ�� �Ҽ�����)
			}						//�׷��� �ٵ� �̷��� ���ǹ� �Ἥ �ݾ��ָ� �ξ� ���� �������ϼ� �ִ�.
			if(conn != null) {
			conn.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	

	
	// �ֳ׸� ȣ���ϴ� ��������� �ۼ�
	
	//insert�ϴ°� �����ۼ� - �޼ҵ� �̸��� insert�϶� 
	//insert������ �����߿��Ѱ� insert���� ������ ������������ �����Ͱ� ���°� �߿���
	//���� ������ �����߽��ϴ� ����ؼ� �����ߴ��� �����ߴ��� �Ǻ��ϰ������ ��ȯ�� �ϴ°��� -int		//������Ҷ��� �ܼ�â�� �ߴ°� ����ڵ��� ���°Ŵѱ� ���� ���̴°� �Ҷ��� Model�ܿ� �־��ִ°� ����
	//void�� �̷��� �ڱⰡ ���ϴ°ɷ�! insert���ص��Ǹ� void�ص���.								//(�������̴°� view�ܿ���!) -�����߿� Ȯ�����ϰ������controller���ص� ��� ����(��߳������ ������)
	public void insert( String type, int level, String name) {
		
		try {
		//��������ؾ��ϴ°� �����ϴ°� ! �����ϴ±�ɸ��������� ���⼱ ȣ�⸸�ϸ��
		conn();
		
		//���� ������������ sql�� �����ϰ� ����(pst)�������ָ��
		String sql = "insert into poketmon values(?, ?, ?)";
		
		pst = conn.prepareStatement(sql); 	
		//�������� ���缭 �־��ֱ�( ù��°�ڸ����� Ÿ�Գְ� �ι�°�ڸ��� �����־��ּ���~(�ε�����ȣ��)
		pst.setString(1, type);
		pst.setInt(2, level);
		pst.setString(3,name);
		
		//�������Ҷ��� update��°� ����Ұ���
		int cnt = pst.executeUpdate();  //->insert,update,delete�ϸ� executeUpdate �޼ҵ����ϴµ� �긦 ���� int���� ��ȯ��
			//�����̉�����ȉ���� �˰������ cnt �긦 ���ؼ� �˼��ִ°���. �ָ� �Ѱ��༭ ����Ҽ�����.
		
			//cnt���� 1�϶��� true�� �����Ѱ�, 0�϶��� false�� �����Ѱ�
		//���� bloolean result = false; �� �ʱ�ȭ�� �������ְ�
//			if(cnt>0) {
//				result = true;
//			}else {
//				result = false;
//			}					�̷������� Ȯ�ΰ���
		
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close();		//������ �������� finally�� close(); ���ֱ�!
		}					//�� �����ϰ������ ������ close ���ְ� �״����� return���ֱ� �ȱ׷� close�Ǳ����� return�ϰ� �� ������ѹ���
			//return result;
	}
	
	//���� �̰͵��� ���ο����� ���� ȣ�⸸���ָ��!!
}
