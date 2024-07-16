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
								new Tea( rs.getInt("price"), 
										rs.getString("item_name") )
								);
				
			}
			
			
	}catch(SQLException e) {
		System.out.println("tea 테이블 조회 실패");
	}
		
		
		
		
		
		
		
		return data;
	}
	
	
	
}
