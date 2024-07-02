package java0702_2;

public class study_class2 {

	public static void main(String[] args) {
		// static은 제어자로서 만들어지는 시기를 변경해준다?  (정적변수) = (정적 메서드)
		// static void = 클래스 메서드 
		
		//Car car1 = new Car(); 
		// 위에 참조변수를 생성 및 선언해야 비로소 메모리에 할당된다. 그 전에는 존재하지 않음.
		
//		System.out.println(Car.제조사);
		
		
		Car car1;
		
		
		car1 = new Car(); // carName, 배기량, 연료 변수 생성
		car1.carName = "쏘나타";
		car1.연료 = "휘발유";
		car1.제조사 = "기아";
//		System.out.println(Car.제조사);
		
		Car car2 = new Car("그랜져", 3000,"휘발유");
		// 먼저 참조변수를 선언하더라도 메모리에 할당되지 않았기 때문에 사용할 수 없다. 
		
		
		/*
			데이터 : 이름, 	포인트, 		평점
						김건우,	 4580, 	4.3
						김경제,	 3485, 	4.1
						박재범,	 90930, 	2.7
						서석완,	 19200, 	3.1
		
		웹소설 작가들의 구독자 평점과, 소설 뷰횟수에 따른 포인트점수이다.
		위 내용을 저장 할 수 있는 클래스를 정의하고 데이터 입력 후 출력하세요.
		( 매개변수 있는 생성자 메서드는 두 개 이상 구현)
		
		
		*/
		
		Novel review0 = new Novel(); 
		// 오버로딩한 메서드가 있으면 이런식은 오류가 나고, 이렇게 하고 싶으면 
		// 아무것도 넣지 않은 메서드도 하나 만들어 줘야함.
		
		Novel review1 = new Novel("김건우",4580,4.3f);
		Novel review2 = new Novel("김경제",3485,4.1f);
		Novel review3 = new Novel("박재범",90930,2.7f);
		Novel review4 = new Novel("서석완",19200,3.1f);
		
//		System.out.println(review1.name);
//		System.out.println(review1.point);
//		System.out.println(review1.rating);
//		
//		System.out.println(review2.name);
//		System.out.println(review2.point);
//		System.out.println(review2.rating);
//		
//		System.out.println(review3.name);
//		System.out.println(review3.point);
//		System.out.println(review3.rating);
//		
//		System.out.println(review4.name);
//		System.out.println(review4.point);
//		System.out.println(review4.rating);
//		
//		System.out.println(review4);
		
		
		


	}

}



class Novel {
	String name;
	int point;
	float rating;
	
	Novel() {
		
	};
	
	
	Novel(String Name){
		
		this.name = Name;
	};
	
	
	Novel(String Name, int Point, float Rating){
		this.name = Name;
		this.point = Point;
		this.rating = Rating;
	};
	
	
	public String toString( ) { // 이거 덕분에 System.out.println(review4);  출력 가능
		return name+ " " + point +"점 " + rating;
	}
};







// 클래스 내부에 선언되는 변수(또는 배열)는 두 가지가 있다. 
// 클래스 변수, 인스턴스	변수 

class Car{ // 클래스 = 객체 
static String 제조사 = "현대"; 	// 클래스 변수 (공유 자원)
	
	String carName; // 인스턴스 변수
	int 배기량; 	//	인스턴스 변수
	String 연료; 	//	인스턴스 변수 
	
	/*
	 * 새로 만드는 new 연산자 안에는 인스턴스만 포함하기 때문에 클래스 변수인 제조사는 
	 * 포함되지 않는다.  다만 new를  통해 만들기 이전부터 존재한다.
	 * 인스턴스변수는 클래스 객체 생성시 메모리가 할당된다. (new 연산자를 통한)
	 * 클래스 객체 생성은 new 연산자를 통한다.
	 * 클래스 변수는 프로그램 실행할 때 메모리에 로드하면서 생성된다.
	 * 클래스 변수는 변경은 가능하나 변경할시 클래스 안에 다른 인스턴스들의 동작들도 오류가 날 수 있다. 
	 * 그러므로 클래스 변수의 수정은 신중해야한다. 바꾸려면 동기화 작업을 해야한다.
	 * 주로 많이 쓰는건 인스턴스 변수이다.
	 */
	
	
	// 생성자 메서드 - 객체(인스턴스) 공간을 생성할때 공간 초기화 해주는 메서드
	// 생성자 메서드 - return이 존재하지 않는다.
	// return을 하면 안되는 이유: 생성자메서드에는 return 타입 지정이 안되기 때문에
	// 객체지향 언어의 특징. 같은 이름의 함수를 만드는게 가능하다. (현재 Car 이름으 생성함수가 3개임) = overloading
	// 오버로딩 <-> 오버라이딩 
	// 오버로딩 - 오버로딩 구현 조건
	//	1. 동일 클래스에서만 가능하다. 같은 이름의 클래스 내부에서만 가능하다. 밖에선 불가능
	//	2. 메서드의 이름은 같아야 한다.
	//	3. 매개변수의 타입은 다르게 선언되어야 한다. 
	// 	4. 매개변수의 갯수가 달라야 한다. 
	
	
	
	Car( ){
		// 생성자메서드의 내용 - 인스턴스 변수의 초기값 저장
		
		연료 = "휘발유";  
		// 기본 null에서 "휘발유"라는 초기값을 가지게 됨. 
		// new 연산자에 의해 객체 생성시 연료변수에 휘발유 저장된다.
	};
	
	// 매개변수가 있는 생성자 메서드
	
	Car(String 연료) {
		this.연료 = 연료;
	}
	
	Car( String carName, int cc , String fuel){
			this.carName = carName;
			배기량 = cc;
			this.연료 = fuel;
	}
	
};



// 자바 메서드 

// 반환타입 메서드 이름(매개변수) {	}

// 반환타입 - int, short, float, double, char, boolean
//				void, String
//				메서드의 return 데이터 타입
// 		return 10; 	-> 반환타입 int, short, long
//	return income;  ->  income  변수의 타입을 반환타입으로

//	void 타입은 	반환값이 없다라는 의미

/*
 				주민등록번호로 남자인지 여자인지 구별
 				String gender(	String jumin) {
 				
 					String gen = jumin.substring( 7, 8);
 					if( gen. equals("1") || gen.equals("3") ) {
 							return "남자";
 					} else if( gen.equals("2") || gen.equals("4) ) {
 							return	"여자";
 					}
 					return "혼란";
 				}
 
 
 
 */























