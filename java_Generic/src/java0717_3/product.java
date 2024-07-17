package java0717_3;

public class product {
	
	private String id;  // 상품번호
	private String name;  // 상품이름
	private int price; 	//  상품가격
	
	public product( String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	@Override
	public String toString () {
		
		return "ID: " + id + " , 상품명: " + name + ", 가격 : " + price;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
