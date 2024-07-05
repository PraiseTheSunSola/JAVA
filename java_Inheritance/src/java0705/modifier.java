package java0705;

public class modifier {
	
	public static void main(String[] args) {
		
		// 이제부턴 변수 이름으로 저장하는게 아닌 메서드 이름으로 저장한다. 
		
		
		Book book = new Book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		
		System.out.println(book.getTitle());
		
		Book book2 = new Book("JAVA, 웹, 성공적", "이병헌", 564);
		
		System.out.println( book2);
		
		
		
		
	}
}
