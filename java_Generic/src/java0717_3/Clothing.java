package java0717_3;

public class Clothing extends product{
	

	private String size;  // ø  ªÁ¿Ã¡Ó 

	
	public Clothing
	(String id, String name, int price ,String size) {
		
		super(id, name, price);
		this.size =size;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ ", ø  ªÁ¿Ã¡Ó : " + size;
	}
	
	
	public String getSize() {
		return size;
	}

	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
