package java0709;

public class Main_Method {

	public static void main(String[] args) {
		
		// 상속 관계를 하지 못 하는 상태에서 다형성을 구현하려면 인터페이스를 사용한다.
		move d = new dog();
		move c = new cat();
		d.moving();
		c.moving();
	}

}
class dog implements move {
	@Override
	public void moving() {
		System.out.println("성큼성큼 이동한다.");
	}
}
class cat implements move {
	@Override
	public void moving() {
		System.out.println("사뿐 사뿐 이동한다.");
	}
}

interface move {
	static int a= 10;
	public void moving();
}

/* 
	인터페이스 - 추상클래스의 한 종류
		- 추상메서드만 가능
		- 인스턴스변수 불가능
		- (8버전 이후부턴) static 변수, static 메서드 선언 가능
		- 객체 생성불가
		- 클래스들에 연결되어 사용된다. 
		- 다형성 구현을 위해 사용한다. 
		- 프로그램의 기본틀을 구축할 수 있다. 
		
		서버에서 클라이언트에게 페이지를 제공한다. 
		클라이언트의 요청을 받아주는 메서드
		클라이언트가 원하는 페이지를 제공하는 메서드 
		
		interface를 연결해준 클래스에선 interface가 가지고 있던 추상클래스를 구현해줘야한다.
 */