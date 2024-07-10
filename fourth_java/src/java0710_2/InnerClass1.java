package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		// 내부 클래스 공부
		
		Out out = new Out();
		out.num = 100;
		out.obj.age= 34;
		out.obj.setName("클레오파트라");
		
		Out.InstanceInnerClass in =  out.new InstanceInnerClass();  // InstanceInnerClass의 객첼르 만들려고 하는 것이기 때문에 new의 위치가 out 뒤로 가야한다. 
		in.age = 20;
		in.setName("안토니우스");

	}

}

/*
 	static으로 선언 및 정의한 변수와 메서드는
 	인스턴스 메서드에서 사용가능
 	인스턴스 변수 메서드는 static 메서드에서 사용 불가  ( 메모리 구조상 static이 먼저 만들어지고 인스턴스 변수 메서드는 언제 만들어질지 모르기 때문에 = 만들어진 시점이 달라서 )
 	
 	
 	
 	메모리 구조에서  
 	static 붙은건 프로그램 시작할 때 생성
 	나머지는 프로그램 실행중에 생성
 	
 */



class Out {
	static int count ;// 클래스 변수
	int num; // 인스턴스 변수
	private String job; // 인스턴스 변수
	InstanceInnerClass obj = new InstanceInnerClass();
	
	interface Car{ // 인터페이스는 추상 클래스라 객체 못 만듬!
		
			void make();
			
			
	}
	
	// 추상 클래스지만 익명 클래스를 이용하면 객체를 만들수 있는 것 처럼 가능해보 이는게 가능함.
	
	void makeCar() {
		
		Car c = new Car() {
			
				@Override
			public void make() {
						System.out.println(" 익명 클래스를 통해 만들기");
				}
		};
		
		c.make();
		
	} // end makeCar
	
	/* 이 영역 전부가 익명 클래스이다. 
	 	Car c = new Car() {
			
				@Override
			public void make() {
						System.out.println(" 익명 클래스를 통해 만들기");
				}
		};
		 
	 */
	
	
	void buyComputer() { 
		
		 // 메서드 내부에서 사용 가능한 클래스 (앞 쪽에 제어자 기입 불가능) 어차피 메서드 실행 할 때만 사용 가능하기 때문에 static도 불가능
		class LocalClass {
			
				int weight;
				void del() {
					
				}
		}// end  LocalClass
		
		
		// 지역 내부 클래스 객체는 메소드 안에서만 만들수 있다.  지역 내부 클래스는 1회용이라 잘 사용되지 않는다. 
		LocalClass ob = new LocalClass();
		
	} // end buyComputer
	
	
	
	/*내부 클래스 또한 만들어진 클래스 안에서만 사용가능하다. 제어자 public이 붙어도! 
 	(포함 관계를 가져야 할 때 차라리 내부 클래스로 만들어서 해당 클래스에서만 사용 가능하게 하고 싶을때 사용함.)
	 */
	static void save() {
		
	}
	
	//  static class StaticClass는 Out 클래스 객체에 속하지 않는다.  // 객체를 만들지 전에 이미 메모리에 저장되어 만들어 진 것. 
	// class를 통해서 객체를 만들어진다.  
	
	
	static class StaticClass { // 정적 내부클래스 (앞 쪽에 제어자 기입 가능)
		int tall; 
		static int birth;
		static void update() {
			
		}
		
	} // end StaticClass
	
	
	class InstanceInnerClass {  // static 없는 인스턴스 변수만 만들수 있다.  (앞 쪽에 제어자 기입 가능)

		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
		void create() {
			count = 10;
		}
		
	} // end InstanceInnerClass
	
	
	
} // end Out






/*
 	내부클래스 - 클래스 내부에서만 사용 가능한 클래스 
 	1. 인스턴스 내부 클래스
 	2. 정적 내부 클래스
 	3. 지역 내부 클래스
 	4. 익명 내부 클래스
 */
