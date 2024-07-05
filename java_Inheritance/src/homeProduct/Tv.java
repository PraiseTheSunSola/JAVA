package homeProduct;

public class Tv  extends House{
//					(자식)				(부모)
	
	public int channel;	// 채널
	public int vol = 5; 	// 소리 
	
	
	
	public Tv() {
	super(); // 가 안에 들어있음. 상속을 받았다면 super() = House (); 부모를 뜻함.
	}
	
	// 매개변수 있는 생성자 메서드 
	public Tv (String brand, int price) {
		super(brand, price);  // 부모클래스 생성자메서드 호출
		// 다만 이 경우 부모쪽에도 매개변수가 있는 생성자 메서드를 만들어야한다.
	}
	
	public void channerlUp() {
		this.channel++;
		
		//return이 필요없는건 티비라는 하나의 클래스 안에서 이루어지는 동작이라 자기꺼 자기가 조절하는거라 
	}
	
	public void channerlDown() {
		this.channel--;
	}
	
	@Override
	public void power() {
		super.onOff = !super.onOff;
		System.out.println("TV 전원 : " + super.onOff );
	}
	
	
	// 오버로딩 - 새로운 메서드를 정의하는  것
	// 오버 라이딩은 기존의 메서드를 재정의하는 것 
	
	
	// @Override는 컴퓨터에게 이 메서드를 오버 라이딩 하고 있다고 설명해주는 것   
	// 범위는 바로 밑 하나만. 사용할 땐 띄우지 말고 위 아래 붙어야함.
	
	// 오버 라이딩 조건
	// 부모 클래스에 해당 메서드가 존재해야한다.
	// 오버라이딩 메서드는 반드시 반환타입, 메서드 이름, 매개변수 모두 똑같이 작성해야한다. 
	// 메서드의 { } 내용은 달라도 된다.  자식 클래스에 내용이 없다면 부모것을 실행한다. 
	// 출력되는건 자식 클래스의 메서드이고 핵심이다. 
	
}// end


// 상속상태인 매개변수가 있는 생성자 메서드를 코딩할 때 
// 부모쪽에 저장이 되도록 super(); 를 사용한다. 