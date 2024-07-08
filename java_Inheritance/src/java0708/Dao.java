package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {

						//↓↓↓ 인터페이스 
	private Connection conn; // 데이터베이스 접속 정보객체를 저장할 변수 
	private Statement st;  // SQL문을 실행하여 데이터베이스와 상호작용을 위한 변수  (정부에서 금함 보안 취약)
	private ResultSet rs; // 데이터베이스 select(조회) 결과를 받기 위한 변수
	private PreparedStatement pt;  //  나눠서 보내는 병렬식 
	
	Dao() {
		
		DriverInit();
		Connect();
	
	}
	
	// mySQL과 java를 연결 할 driver 로드 
	private void DriverInit() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			// 이녀석을 통해 클래스를 메모리에 넣어줄 수 있다.
		} catch(Exception e) {
			System.out.println("드라이버 로드 실패");  //  로드는 불러오는게 아닌 메모리 적재를 뜻함.
		}
		
	}
	
	// mySQL의 계정 접속 
	private void Connect() {
		String user = "EldenRing";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/EldenRing";
		
		try {
		conn =  DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println(" 데이터 베이스 접속 실패");
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
			System.out.println("데이터 저장 실패");
		}
		
		
		
//		String sql = "insert into test_member( name,kor,eng,mat,total, " 
//						+ "std_avg) value (' "+m.getName()+" '," +m.getKor()+","+
//						m.getEng()+"," +m.getMat()+","+m.getTotal()+","+
//						m.getStd_avg()+")";
//				
//		try {
//			
//			st = conn.createStatement(); // SQL문을 보내기 위해 Statement 객체 생성
//			st.executeUpdate(sql); // sql문을 데이터베이스 전달
//			
//		}catch(Exception e) {
//			System.out.println(" 데이터 저장 실패");
//		}
		
		
	}
	
	
	public Member[] select() {
		
		Member[] list = null;
		String sql = "select count(*) as cnt from test_member";
	
	
		try {
				int size = 0;
				st = conn.createStatement();
				rs = st.executeQuery(sql);  // select 사용할땐 Query
				
				// ResultSet가 주소들을 반복문처럼 돌아가면서 주소를 참조하여 데이터값을 보여줌
				// 맨 처음엔 빈 공간을 가지고 그 다음 그 다음을 돌면서 데이터가 있는 주소를 찾고 보여주고 
				// 데이터가 없는 주소가 나온다면 동작을 그만함 
				// ResultSet는 java꺼  / count(*)는 sql  
				
				
				if( rs.next()) {
					size = rs.getInt("cnt"); // 데이터베이스에 데이터(레코드)가 총 몇개 있냐?
				}
				
				if( size !=0) {
					int i=0;
					list = new Member[size]; // 참조변수의 공간을 만듬/ 객체 공간을 만들지 않음
					sql = "select * from test_member"; // 전체 데이터 조회 쿼리문(sql질의문)
					rs = st.executeQuery(sql); // 조회결과 받기
					
					while( rs.next()) { // 조회 결과 하나씩 순회
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
			System.out.println("데이터 조회 실패");
			
			
		}
		
		return list;
		
    }
	
}   // end Dao 


// 드라이버 먼저 연결 -> 계정 접속 -> 쿼리문 작성