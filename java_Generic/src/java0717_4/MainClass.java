package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{  // 함수형 인터페이스 
	public void move();
	
}


class A<T> {
		T item;
		
		@SafeVarargs
	final	void get( T... add) {  
			// 가변인자 => 배열을 뜻함. 가변적으로 사용할 수 있는 배열. 크기가 정해져 있지 않은 인자. 
			// 다만 final를 통해서 그 성질을 억눌러줌 ?? 잘 모르겠음 구글에서 찾아보자 
		}
}


public class MainClass {

	@Deprecated
	static void aaa() {
		
	}
	
	public static void main(String[] args) {
		
		aaa();
		
		Date today = new Date();
		
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList ();
		

		
		
//		today.getYear();
	}

}

/*
		Annotation = 다른 프로그램에게 유용한 정보를 제공하기 위해 사용되는 것으로 주석과 같은 의미
		
		특정 코드들을 컴퓨터에게 정보제공 
		표준 - annotation , 메타 annotation
		
		@Override
		컴파일러에게 메서드를 오버라이딩 하는 것이라고 알려준다. 
		
		@Deprecated
		앞으로 사용하지 않을 대상이라고 알려준다. 
		
		
		@SuperWarnings
			컴파일러 경고를 출력하지 않게 하도록 설정
			
		- @SuppressWarnings("all") => 모든 경고 억제	
													 ("deprecation") 권장되지 않는 기능 경고 억제	
													 ("null") null과 관련된 경고 억제
													 ("unchecked") 미확인 오퍼레이션 경고 억제 
													 ("unused") 사용하지 않는 코드 또는 불필요한 코드에 대한 경고 억제
			
			@FunctionalInterface
			'함수형 인터페이스' 라는 것을 알려준다.  => 메서드를 하나만 가지는 인터페이스를 일컫는 의미.
			
			@SafeVaragrs
			제네릭과 같은 가변 인자의 매개변수를 사용할 때 경고 나타내진 않기 
			
			메타 annotation
			
			@Target	-  애너테이션을 정의할 때 적용할 대상 지정
			@Documented	- javadoc로 작성된 문서에 포함
			@Inherited			- 하위클래스에 상속되도록 할 때 사용
			@Retention			-  애노테이션 기간 설정 ( 실행 중에만 적용 할 것이냐 특정 클래스 파일에만 존재하게 할 것이냐)
			@Repeatable		-  애너 테이션 반복 설정
			
			
			
			
			
*/