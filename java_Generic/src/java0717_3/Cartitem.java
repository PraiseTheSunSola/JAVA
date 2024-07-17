package java0717_3;

public class Cartitem <T extends product>{
	
	private T item;
	private int quantiy;  // 수량    

	public Cartitem(T item, int quantiy) {
		this.item = item;
		this.quantiy = quantiy;
	}
	
	public T getItem () {
		
		return this.item;
	}

	public int getCartitem () {
		
		return this.quantiy;
	}
	
	
	@Override
	public String toString () {
		
		return  " 상품 : " + item + " , 수량 : " + quantiy;
	}
	
	
	
	
	
}
