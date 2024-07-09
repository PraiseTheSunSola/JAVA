package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for( Board board : list) { // 출력 반복문
			
			if(board.getTitle().contains("하악하악")) {
//			System.out.println( board);
			}
			
		}
		
		// hit 값이 50 이상인 것 출력 
		
		for( Board board: list) {
			
			if(board.getHit() >= 50) {
//				System.out.println( board);
			}
		}
		
		// 제목의 글자수가 10자 이상인것만 출력
		
		for( Board board: list) {
			
			if(board.getTitle().length() >= 10) {
//				System.out.println( board);
			}
		}
		
		
		// content의 글자수가 10자 이하인 객체의 
		// title과 writer만 출력
		
		for(Board board: list) {
			
			if(board.getContent().length() < 10) {
				System.out.println(board.getTitle() + " " + board.getWriter());
			}
		}
		
		System.out.println("\n hit수가 100이상인 객체들을 추출하여 hot 배열에 저장");
		
		Board[] hot = new Board[list.length]; // 몇 개가 저장 될 지 모르기 때문에 이렇게 작성함.
		
		int i = 0; 	// hot 배열 인덱스 
		for(Board board : list) {
			
			if( board.getHit() >= 100) {
				hot[i++] = board;
			}
		}
		
		for(Board data : hot ) {
			if( data == null) break; 	// hot 배열 안에 아무것도 없다면 멈춘다 라는 의미;  
//			System.out.println( data);
		}
		
		// writer에 신이 포함된 객체만 추출하여
		// sin 배열에 저장 후 출력하세요. 
		
		Board[] sin = new Board[list.length];
		
		int s = 0; // sin 배열 인덱스
		for( Board board: list) {
			
			if(board.getWriter().contains("신")) {
				sin[s++] = board;
			}
		}
		
		for(Board sinArray : sin) {
			if(sinArray == null) break;
			System.out.println(sinArray);
		}
		
		
		
	} 	// end main

}	// end ObjectArray3
