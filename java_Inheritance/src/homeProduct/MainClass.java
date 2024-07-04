package homeProduct;

public class MainClass {
// 공통적인 내용이 주를 이루는 클래스들은 하나의 클래스로 제어할 수 있다.
	
	public static void main(String[] args) {
		

	
		
		Tv tv = new Tv();
		tv.brand ="삼성";
		tv.power();		
		tv.power();	
		
		Aircon air = new Aircon();
		air.brand = "LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();
		
		
	}
}


// 클래스 상속 
//  상속 하려면 자식 클래스 이름 뒤에 extends 부모 클래스 이름 
// extends - 확장, 연장...
// Tv extends House -> Tv클래스가 자식이고 House가 부모클래스이다. 
// 부모가 가지고 있는 변수도 자식이 사용할 수 있다.
// 상속을 하는 가장 큰 이유 -> 다형성( 하나의 타입으로 여러개 타입을 사용하는것) => 객체 지향의 꽃 
//.toString() 자바에 내장되어 있는 문자열을 다루기 위해 만들어진 메소드 
// 다향성에 의해 실행되는건 자식들에 데이터를 사용
// 상속을 하게되면 부모 클래스의 인스턴스 변수, 인스턴스메서드, 클래스 변수, 클래스메서드가 사용가능
// 단, 부모클래스의 모든 걸 사용하지는 못하다. (일부)
// 제어 걸려있는 변수나 메서드는 사용 불가 

// 생성자메서드를 통해 인스턴스변수들의 초기화는 
// 자식클래스가 가지고있는 변수는 자식클래스 생성자메서드에서 초기화
// 부모클래스가 가지고 있는 변수는 부모클래스 생성자 메서드에서 초기화