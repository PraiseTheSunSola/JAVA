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
 	
 */

class Out {
	static int count ;// 클래스 변수
	int num; // 인스턴스 변수
	private String job; // 인스턴스 변수
	InstanceInnerClass obj = new InstanceInnerClass();
	
	
	/*내부 클래스 또한 만들어진 클래스 안에서만 사용가능하다. 제어자 public이 붙어도! 
 	(포함 관계를 가져야 할 때 차라리 내부 클래스로 만들어서 해당 클래스에서만 사용 가능하게 하고 싶을때 사용함.)
	 */
	static void save() {
		
	}
	
	//  static class StaticClass는 Out 클래스 객체에 속하지 않는다.  // 객체를 만들지 전에 이미 메모리에 저장되어 만들어 진 것. 
	// class를 통해서 객체를 만들어진다.  
	
	
	static class StaticClass { // 정적 내부클래스
		int tall; 
		static int birth;
		static void update() {
			
		}
	}
	
	
	class InstanceInnerClass { 

		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
		void create() {
			count = 10;
		}
	}
	
}






/*
 	내부클래스 - 클래스 내부에서만 사용 가능한 클래스 
 	1. 인스턴스 내부 클래스
 	2. 정적 내부 클래스
 	3. 지역 내부 클래스
 	4. 익명 내부 클래스
 */
