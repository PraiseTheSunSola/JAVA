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
	
	
	public Member[] select() {
		
		Member[] list = null;
		String sql = "select count(*) as cnt from test_member";
	
	
		try {
				int size = 0;
				st = conn.createStatement();
				rs = st.executeQuery(sql);  // select ����Ҷ� Query
				
				// ResultSet�� �ּҵ��� �ݺ���ó�� ���ư��鼭 �ּҸ� �����Ͽ� �����Ͱ��� ������
				// �� ó���� �� ������ ������ �� ���� �� ������ ���鼭 �����Ͱ� �ִ� �ּҸ� ã�� �����ְ� 
				// �����Ͱ� ���� �ּҰ� ���´ٸ� ������ �׸��� 
				// ResultSet�� java��  / count(*)�� sql  
				
				
				if( rs.next()) {
					size = rs.getInt("cnt"); // �����ͺ��̽��� ������(���ڵ�)�� �� � �ֳ�?
				}
				
				if( size !=0) {
					int i=0;
					list = new Member[size]; // ���������� ������ ����/ ��ü ������ ������ ����
					sql = "select * from test_member"; // ��ü ������ ��ȸ ������(sql���ǹ�)
					rs = st.executeQuery(sql); // ��ȸ��� �ޱ�
					
					while( rs.next()) { // ��ȸ ��� �ϳ��� ��ȸ
						list[i] = new Member( rs.getInt("member_id") , 
					    rs.getString("name"), rs.getInt("kor") ,
					    rs.getInt("eng"), rs.getInt("mat"), rs.getInt("total"),
					    rs.getInt("std_avg"));
					}
				}
				
				
				if( rs.next() ) {
				System.out.println(rs.getInt("cnt"));
				}
		
		}catch (Exception e) {
			System.out.println("������ ��ȸ ����");
			
			
		}
		
		return list;
		
    }
	
}   // end Dao 


// ����̹� ���� ���� -> ���� ���� -> ������ �ۼ�