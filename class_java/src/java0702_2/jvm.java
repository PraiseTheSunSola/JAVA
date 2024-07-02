package java0702_2;

public class jvm {
	
//	main 메서드 -> JVM (가상의 컴퓨타) 운영체제 가리지 않음
//	main은 반드시 있어야 하고 JVM이 실행 될 때 제일 먼저 만드는 것이 main이다.
	
	public static void main(String[] args) {
		
		// 클래스메서드에서 오직 클래스 변수나 클래스 메서드만
		// 실행 - 메모리에 로드(적재)되는 때가 인스턴스보다 먼저
		// 이루어지기 때문에 인스턴스변수나 인스턴스 메서드는 안된다.
		
		int num = 300;
		output(num);
	//  num은 main의 지역변수라 사용이 안된다. 
	// output에 매개변수 int a를 만들고 output() 안에 num을 넣어 받아온다.

	}
	
	// 매개변수 사용시 가지고오려는 변수의 데이터 타입을 동일하게 적어줘야한다.
 static void output(int a) {
	    System.out.println( a); 
		System.out.println("나는 메서드입니다.");
	}
	
 
}



class a{
	int num=10;
	
	static void out( ) { // 클래스 매서드
//			System.out.println(num);
	}
	
};



