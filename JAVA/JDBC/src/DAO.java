import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	//DTO ; data transfer object ������ ����
	//DAO ; 
	
	//1.DB���� -conn()
	//2.SQL ����
	//3. close() ��������� -> �ٸ��ݰ� ���ÿ� �����ϴѱ� 
	//�����ϰ� Ŭ�����ϴ°� �� �ʿ��ϴѱ� �ƿ� �޼ҵ�� ����������
	
	Connection conn = null ;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public void conn() {  //�����Ҷ� conn���ҷ��ͼ� ���
	       try {
	           Class.forName("oracle.jdbc.driver.OracleDriver");

	            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	            String dbid = "system";
	            String dbpw = "12345";

	            conn = DriverManager.getConnection(url, dbid, dbpw);
	      } catch (Exception e) {
	         e.printStackTrace();}
	      }
	       
	       public void close() {
	           try {
	        	   
	        	   if(rs!=null) {
	        		   rs.close();
	        	   }
	        	   if(pst!=null) {
	        		   pst.close();}
	        	   
	           		if(conn!=null) {
	           			conn.close();
	           		}
	           		
	        	   	rs.close();	//������ذ� �������� �ݾ��ֱ� 
	                  pst.close();
	                  conn.close();
	       }
	                catch (Exception e) {
	                  e.printStackTrace();
	               }
	       
	       
	    }
			
	
}
