package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {

						//���� �������̽� 
	private Connection conn; // �����ͺ��̽� ���� ������ü�� ������ ���� 
	private Statement st;  // SQL���� �����Ͽ� �����ͺ��̽��� ��ȣ�ۿ��� ���� ����  (���ο��� ���� ���� ���)
	private ResultSet rs; // �����ͺ��̽� select(��ȸ) ����� �ޱ� ���� ����
	private PreparedStatement pt;  //  ������ ������ ���Ľ� 
	
	Dao() {
		
		DriverInit();
		Connect();
	
	}
	
	// mySQL�� java�� ���� �� driver �ε� 
	private void DriverInit() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			// �̳༮�� ���� Ŭ������ �޸𸮿� �־��� �� �ִ�.
		} catch(Exception e) {
			System.out.println("����̹� �ε� ����");  //  �ε�� �ҷ����°� �ƴ� �޸� ���縦 ����.
		}
		
	}
	
	// mySQL�� ���� ���� 
	private void Connect() {
		String user = "EldenRing";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/EldenRing";
		
		try {
		conn =  DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println(" ������ ���̽� ���� ����");
		}
		
	}
	
	public void insert(Member m) {
		
		String sql =
				"insert into test_member( name, kor, eng, mat,total,std_avg) values(?,?,?,?,?,?)";
		try {
				
				pt = conn.prepareStatement(sql);
				pt.setString(1, m.getName());
				pt.setInt(2, m.getKor());
				pt.setInt(3, m.getEng());
				pt.setInt(4, m.getMat());
				pt.setInt(5, m.getTotal());
				pt.setInt(6, m.getStd_avg());
				pt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("������ ���� ����");
		}
		
		
//		String sql = "insert into test_member( name,kor,eng,mat,total, " 
//						+ "std_avg) value (' "+m.getName()+" '," +m.getKor()+","+
//						m.getEng()+"," +m.getMat()+","+m.getTotal()+","+
//						m.getStd_avg()+")";
//				
//		try {
//			
//			st = conn.createStatement(); // SQL���� ������ ���� Statement ��ü ����
//			st.executeUpdate(sql); // sql���� �����ͺ��̽� ����
//			
//		}catch(Exception e) {
//			System.out.println(" ������ ���� ����");
//		}
		
		
	}
	
	
} // end Dao 


// ����̹� ���� ���� -> ���� ���� -> ������ �ۼ�