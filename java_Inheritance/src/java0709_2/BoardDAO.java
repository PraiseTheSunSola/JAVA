package java0709_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {

	private Connection conn; // 데이터베이스 접속정보 저장 (인터페이스임 클래스 아님)
	private Statement st; 	// SQL명령이 전달과 결과 받기
	private PreparedStatement pt; 	// SQL명령어 전달과 결과 받기 
	private ResultSet rs; 	// 데이터 조회 결과 저장
	
	
} // end BoardDAO
