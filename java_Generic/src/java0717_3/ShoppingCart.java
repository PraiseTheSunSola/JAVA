package java0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	
	
	private List<Cartitem<? extends product >> 
	list = new ArrayList <> ();
	
	public< T extends product> void addCart
	( T item, int quantiy) {
		
		Cartitem<T> Cart = new Cartitem<>(item, quantiy);
		list.add(Cart);
		System.out.println("»óÇ° -> " + Cart);
	}
	
	
	public void showCart() {
		for (Cartitem<? extends product > p : list) {
			System.out.print(p);
		}
	}
	
}
