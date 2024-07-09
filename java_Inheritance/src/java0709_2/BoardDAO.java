package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO { // ���⼭ class�� c����� ����  Ŭ������ �ƴ� 

	private Connection conn; // �����ͺ��̽� �������� ���� (�������̽��� Ŭ���� �ƴ�)
	private Statement st; 	// SQL����� ���ް� ��� �ޱ�
	private PreparedStatement pt; 	// SQL��ɾ� ���ް� ��� �ޱ� 
	private ResultSet rs; 	// ������ ��ȸ ��� ����
	
	public BoardDAO () { // ��װ� ����� �� ���̺��̽��� ���� ��
			DriverLoad(); 	//  �����ͺ��̽� ����̹� �ε�
			Connect();  // �����ͺ��̽� ����
	}
	
	// test_board ���̺��� ������ �����ͼ� Board Ŭ���� ��ü�� �����ϱ�
	
	public Board[] findByAll() {
		Board[] list = new Board[7];  // Board Ŭ���� ��ü 7�� �����ϱ� ���� �迭
		
		String sql = "select * from test_board"; // sql ���ǹ�, ������
				
		// select ���� - executeQuery �޼���, 
		// insert, update,delete ���� - executeUpdate �޼���
		
		try {
				st = conn.createStatement(); // statement ���� 
//				st.executeQuery(sql);
				rs = st.executeQuery(sql);
				int i = 0; // �迭�� �ε���
				
				while(rs.next()) {
					list[i] = new Board( rs.getInt("board_id"), 
							rs.getString("title" ), rs.getString("writer"),
							rs.getString("content"), rs.getInt("hit"));
					
					i++;
				}
			
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		
		return list;		
	}
	
	
	
	private void DriverLoad() { // ����̹� �ε�
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
				System.out.println("����̹� �ε� ����");
		}
		
		
	} // end  DriverLoad
	
	
	private void Connect() {  // �����ͺ��̽� ����
	
		String username = "EldenRing";
		String password = "1234";
		String url= "jdbc:mysql://localhost:3306/eldenRing";
		
		try {
				conn = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
				System.out.println("���� ����");
		}
		
		
		

		
	} // end  Connect
	
	
	
	
	
	
	
} // end BoardDAO


/*
  	Connection, Statement �Ǵ� PreparedStatement , ResultSet 
  	�������� �ʿ�.
  	
  	1. �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�
  		 (mySQL 5���� ���� - com.mysql.cj.jdbc.Driver
  		 	5���� ���� - com.mysql.jdbc.Driver 
  		 	
  		 	Class. forName("com.mysql.cj.jdbc.Driver");
  		 	
  		 	
  	 2. �����ͺ��̽��� �����ϱ�
  	 	 	�����ͺ��̽� ������, ��й�ȣ, �ּ�
  	 	 	conn = DriverManager.getConnection( �ּ�, ������, ��й�ȣ );
  	 	 	
  	 	 	������ �õ��� ����� Connection�� ���������� ����
  	 	 	
  	 3. conn�� ���ؼ� Statement �Ǵ� PreparedStatement�� ��ü �����Ͽ�
  	 	 SQL ��ɾ� ������
  	 	 
  	 	 	
  	 	 	
  	 	 	
  	 	 	
  	 	 	
  	 	 	
  	 	 	
  */
 