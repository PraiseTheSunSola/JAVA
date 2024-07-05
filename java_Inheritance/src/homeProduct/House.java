package homeProduct;

public abstract class House {

	
	boolean onOff;
	String brand;	 // 제품 브랜드명 
	int price;  	// 제품 구매각겨
	
	House() {
		this.onOff = false;
	}
	
	House(String brand, int price){
		this.brand = brand;
		this.price=price;
	}
	
	
//	void power() {
//		this.onOff = !this.onOff;
//		System.out.println(" 전원 : " + this.onOff);
//	}
	
	// 오버라이딩은 자식 클래스만 출력하니 부모는 내용이 사실상 필요없다. 따라서 아래처럼 바꿔줄 수 있다.
	
	abstract void power(); // 추상 메서드 
	
	// 추상 메서드화를 한다면 반드시 해당 클래스도 추상화 해줘야함! ( public abstract class House) 처럼 
	// 추상클래스는 객체 생성 불가
	// 추상 메서드를 가지고 있는 클래스는 반드시 추상클래스가 되어야 한다. 
	//  new 연산자는 객체를 만들기 위한 메모리 사이즈를 게산해서 운영체제에게 요청하고 값을 받아와 출력함
	// 추상클래스는 객체를 만들지 못 하는 이유는 new 연산자가 계산을 해야하는데 
	// 자식 클래스에 따수시로 크기가 달라지고 정확한 메모리 값을 요청할 수 없기 때문에 만들 수 없다.
	// 부모클래스가 추상클래스라면 반드시 자식클래스는 추상메서드를 정의해야한다.
	// 부모의 추상메서드를 재정의 하지 않을꺼라면 자식클래스는 추상클래스가 되어야 한다.
	
}
