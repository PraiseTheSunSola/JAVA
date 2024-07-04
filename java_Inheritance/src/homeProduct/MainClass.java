package homeProduct;

public class MainClass {
// 공통적인 내용이 주를 이루는 클래스들은 하나의 클래스로 제어할 수 있다.
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power();		
		tv.power();	
		
		Aircon air = new Aircon();
		air.power();
		air.power();
		
		
	}
}


// 클래스 상속 
//  상속 하려면 자식 클래스 이름 뒤에 extends 부모 클래스 이름 