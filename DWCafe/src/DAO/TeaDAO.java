package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;
import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer, Tea> findAll() {
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea";
		
		try {
			
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery(); // select - executeQuery, 
															// insert update delete - executeUpdate
			
			while(rs.next()) {
						// rs.get 데이터 타입("컬럼명")
						data.put( rs.getInt("tea_id"), 
								new Tea( rs.getInt("price"),  // price 대신 번호를 입력 해도 됨
										rs.getString("item_name") ) // 마찬가지로 번호 입력 해도 됨 
								);
				
			}
			
			
	}catch(SQLException e) {
		System.out.println("tea 테이블 조회 실패");
	}
		
		
		
		
		
		
		
		return data;
	}
	
	
	
}
