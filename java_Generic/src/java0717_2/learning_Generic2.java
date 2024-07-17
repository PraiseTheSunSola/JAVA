package java0717_2;

import java.util.ArrayList;

public class learning_Generic2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("B1234","자바완전정복", "김동형") );
		book.add(new Book("F9238","스프링프레임워크", "이상민") );
		book.add(new Book("A1002","포켓몬골드완전정복", "유재학") );
		
		dvd.add(new DVD("M3D232", "포멧몬실사", "전형준") );
		dvd.add(new DVD("M9D123", "지렁이게임초고수되기", "황정아") ) ;
		dvd.add(new DVD("M1B001", "야너두 웹툰 몰래볼수있어", "정한종") ) ;

		
		// 대여 하기 ㅣ
		
		Library lib = new Library ();
		lib.addRental(book.get(0) , "이순신");
		lib.addRental(dvd.get(2) , "김춘추 ");
		lib.showRentalList();
		
		
//		Rental <DVD> rent = new Rental<>(dvd.get(0), "이순신");
//		System.out.println(rent);
//		
//		Rental <Book> brent = new Rental <> ( book.get(1), "김춘추");
//		System.out.println(brent);
		
		
		
		
		
		
		
		
		
		
	}	// end main

}		// end  learning_Generic2

/*
		
		
		도서관에서 대여를 한다. 
		책을 대여하거나 DVD를 대여할 때 
		책과 DVD가 객체이기 때문에
		대여 하기 위한 클래스라든지, 메서드, 변수 등이 달라야한다. 
		대여하는 방법은 이 예제에선 같기 때문에 Rental 클래스에 제네릭 표현을 사용한다. 
		
		도서관에서 전체 대여에 대한 관리가 이루어져야 하기 때문에 도서관 클래스의
		메서드에 와일드카드 <?>를 사용할 것이다. 
		
		
*/