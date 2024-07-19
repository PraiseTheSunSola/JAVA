package java0719;

public enum ThState {

	// 변수 이름이자 곧 값  key == value 
	//  상수들을 클래스처럼 사용할 수 있는 방법 => Enum 
	
	NEW, RUNNABLE, BLOCKED,
	WATING, TIMED_WATING,
	TERMINATED
	
	/*
	int num;
	ThState(int num) {
			this.num= num;
	}
	
	int getNum() {
		return this.num;
	}
	
	*/
	
}	// ThState

/*
 
	final 데이터타입 변수 = 값으로 만드는것 보다 
	Enum을  사용하면 더 자유롭게 사용할 수 있음
	
	여러개의 상수들을 한번에 생성자 메서드로 묶어서 제어하는게 가능 
	
	기존 상수보다 가독성이 더 좋음
*/