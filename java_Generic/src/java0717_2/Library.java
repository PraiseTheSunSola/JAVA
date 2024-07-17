package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// 랜탈 객체를 저장하기 위한 ArrayList
	private List<Rental<? extends Media > > 
	list = new ArrayList<>();
	
	
	// addRental 에서만 적용되는 제네릭 만들어야함.
	// 메서드 앞쪽에 <T extends Media> 표시는 
	// addRental에서만 사용하겠다는 의미 
	
	public <T extends Media> void addRental
	( T  item, String renter) {
		
		// 도서관에서 빌리는 것이기 때문에 Library에 Rental 객체 생성 
		
		Rental<T> rental = new Rental<> (item, renter);
		list.add(rental);
		System.out.println(" 대여 ->" + rental);
		
	}
	
	public void showRentalList() {
		for (Rental<? extends Media > r : list) {
			System.out.println(r);
		}
	}
	
	
	
	

}
