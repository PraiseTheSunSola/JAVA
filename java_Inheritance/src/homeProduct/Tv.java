package homeProduct;

public class Tv  extends House{
//					(자식)				(부모)
	
	int channel;	// 채널
	int vol = 5; 	// 소리 
	
	
	Tv() {
		// super() 가 안에 들어있음. 상속을 받았다면 super() = House (); 부모를 뜻함.
	}
	
	// 매개변수 있는 생성자 메서드 
	Tv (String brand, int price) {
		super(brand, price);  // 부모클래스 생성자메서드 호출
		// 다만 이 경우 부모쪽에도 매개변수가 있는 생성자 메서드를 만들어야한다.
	}
	
	void channerlUp() {
		this.channel++;
		
		//return이 필요없는건 티비라는 하나의 클래스 안에서 이루어지는 동작이라 자기꺼 자기가 조절하는거라 
	}
	
	void channerlDown() {
		this.channel--;
	}
	
	
	
}// end


// 상속상태인 매개변수가 있는 생성자 메서드를 코딩할 때 
// 부모쪽에 저장이 되도록 super(); 를 사용한다. 