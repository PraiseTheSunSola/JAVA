package DAO;

import java.sql.SQLException;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect{

	
	public void save(BoardDTO board) { // �Է��� �Խñ� ����
		String sql="insert into board(title, writer, content) values(?,?,?)";
		
		try {
				pt = conn.prepareStatement(sql);
				pt.setString(1, board.getTitle());
				pt.setString(2, board.getWriter());
				pt.setString(3, board.getContent());
				pt.executeUpdate();
				
		} catch(SQLException e) {
			System.out.println("�Խñ� ���� ����");
			e.printStackTrace();
		}
	}
}
