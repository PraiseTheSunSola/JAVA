package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// �Խñ� ��� ��������
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.findAll(); // ��ü �Խñ� ��������
		
		
		
		return "board/board.jsp";
	}
	
}