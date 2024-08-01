package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 목록 가져오기
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.findAll(); // 전체 게시글 가져오기
		
		
		
		return "board/board.jsp";
	}
	
}