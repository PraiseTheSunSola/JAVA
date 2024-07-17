package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// ��Ż ��ü�� �����ϱ� ���� ArrayList
	private List<Rental<? extends Media > > 
	list = new ArrayList<>();
	
	
	// addRental ������ ����Ǵ� ���׸� ��������.
	// �޼��� ���ʿ� <T extends Media> ǥ�ô� 
	// addRental������ ����ϰڴٴ� �ǹ� 
	
	public <T extends Media> void addRental
	( T  item, String renter) {
		
		// ���������� ������ ���̱� ������ Library�� Rental ��ü ���� 
		
		Rental<T> rental = new Rental<> (item, renter);
		list.add(rental);
		System.out.println(" �뿩 ->" + rental);
		
	}
	
	public void showRentalList() {
		for (Rental<? extends Media > r : list) {
			System.out.println(r);
		}
	}
	
	
	
	

}
