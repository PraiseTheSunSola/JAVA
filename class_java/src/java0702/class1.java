package java0702;

public class class1 {

	public static void main(String[] args) {
		// 메서드 - 귀족된 함수
		// 함수 - 독립적으로 기능함. 
		// 클래스는 대문자로 시작함 
		// 변수 -> 배열 -> 구조체 -> 클래스
		// new -> 동적할당
		
		
		// 	정의 된 클래스 타입의 공간을 생성한다.
		//	생성된 공간에 데이터를 저장한다.
		//	클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고한다.
		// 객체 ( (인스턴스) (인스턴스) (인스턴스) )  객체가 큰 범위 
		
		// ↓↓↓↓ 클래스 인스턴스 생성 - 
		Member member1 =  new Member(); 	// 이 안에 String name과 int age가 들어 있음.
		Member member2 =  new Member();  // 그리고 이 변수는 참조변수임. 오버로딩시엔 이거 불가능
		
		// new Member();  는 자바에선 생성자 메서드 라고 한다.  	
		
		member1.name = "이순신";
		member1.age = 23;
		
		member2.name = "김유신";
		member2.age = 34;
		
//		System.out.println(member1.name); 
//		System.out.println(member1.age);
		// . 했을때 뜨는 목록 중 파란색 세모 아이콘은 멤머 클래스에 속해있다는 의미
		
		
		
		// java - 495p , 메모리최적화기법 - 893p
		
		Book book1 = new Book();
		Book book2 = new Book ();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		// 객체(인스턴스) 하나 당 참조 변수 하나씩 있어야함! 그래야 메모리 주소가 생성됨.
		
		// 스마트폰 제품명, 운영체제, 메모리(ram) 크기에 대해
		// 저장할 수 있는 클래스를 정의하고 인스턴스 생성하여
		// 값 저장, 출력을 하세요. (스마트폰 3개)
		
		SmartPhone smartphone1 = new SmartPhone();
		SmartPhone smartphone2 = new SmartPhone();
		SmartPhone smartphone3 = new SmartPhone();
		
		smartphone1.name = "galaxy";
		smartphone1.os = "안드로이드";
		smartphone1.ram = 12;
		
		smartphone2.name = "iphone";
		smartphone2.os = "ios";
		smartphone2.ram = 8;
		
		smartphone3.name = "moto";
		smartphone3.os = "안드로이드";
		smartphone3.ram =  10;
		
		System.out.println(smartphone1.name);
		System.out.println(smartphone1.os);
		System.out.println(smartphone1.ram);
		
		System.out.println(smartphone2.name);
		System.out.println(smartphone2.os);
		System.out.println(smartphone2.ram);
		
		System.out.println(smartphone3.name);
		System.out.println(smartphone3.os);
		System.out.println(smartphone3.ram);
		
		
		
		
		
	}	//main

}

// 책 제목과 총 페이지수를 저장하기 위한 클래스 정의 

class Book{
	String title;
	int page;
};


class SmartPhone {
	String name;
	String os;
	int ram;
};



// 클래스 - 붕어빵틀, 객체 - 붕어빵  교제(214p)


// 클래스는 사용자 정의 데이터 타입이라고 한다.
class Member{	// Member 라는 이름의 클래스 정의 
	
	String name; // 이름 정식 명칭은 인스턴스 변수
	int age; // 나이
	// 	Member(); 이녀석은 원래 여기 있는데 자바 자체에서 생략함.  
	// 	위에  new Member()의 Member()와 동일.
}