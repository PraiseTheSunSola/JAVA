package java0717_3;

public class Cartitem <T extends product>{
	
	private T item;
	private int quantiy;  // ����    

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
		
		return  " ��ǰ : " + item + " , ���� : " + quantiy;
	}
	
	
	
	
	
}
