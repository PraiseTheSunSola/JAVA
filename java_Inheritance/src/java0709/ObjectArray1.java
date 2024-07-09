package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// 영화 정보 5개 입력 
		
		Movie [] mv = new Movie[5];
		
		/*
		 아래와 같이 만들면 출력 오류이다. 
		 
		mv[0].setTitle("폭룡 베일"); 
		
		이렇게 사용하면 오류가 뜨고 NullPointer 라고 오류가 뜨면 객체가 없다는 뜻
		Null은 참조변수만 가질수 있는 값
		
		System.out.println( mv[0].getTitle());
		
		*/
		
		
		mv[0] = new Movie("용왕", "플라키두삭스", 99);
		mv[1] = new Movie("폭룡", "베일", 19);
		mv[2] = new Movie("무녀", "세네삭스", 25);
		mv[3] = new Movie("대주교", "유미르", 50  );
		mv[4] = new Movie("성녀", "트리나", 17);
		
		
		for( int i=0; i < mv.length; i++) {
			
			System.out.println( mv[i]); 
			// Movie 클래스 안에 Override 중인 public String toString( ) {} 덕에 출력 되는 중
			
		}
		
		
		for (Movie movie : mv) { // 이 방식은 인덱스 표현이 불가 
				 System.out.println( movie); // movie는 변수
				 
		}
		
		
		
	} // end main

} // end  ObjectArray1


/*
 	배열의 생성 TMI
 	1. 데이터 타입 [] [] 대괄호의 갯수에 따라 몇 차원의 배열을 만들겠다 라는 의미
 	2. 어떤 타입의 배열을 만들든 변수는 '참조변수'이다. 
 	3. new 연산자를 사용한다. 데이터타입 [] 참조변수 = new 데이터타입
 	4. new가 사용되는 변수는 전부 참조변수  <--> (기본 데이터 타입 배열만 그냥 변수임)
 	5. 데이터타입 [] 참조변수 = new 데이터타입[배열크기];
 	
 	예시
 	
 	Movie [] mv = new Movie[10];   = mv 배열 10개 만들겠다. 
 	객체를 10개 만든게 아닌 참조변수 10개 만든 것 
 	 	그 후 각 공간에 맞는(담길) 객체들을 만들어 줘야함.  
 	 	
 	 	mv[0] = new Movie();
 	 	mv[1] = new Movie();
 	 	
 	 	
 	 	
 	
 	int [] arr = new int[10];  
 	= int 타입의 공간 10개 생성 (int 타입으로 선언된 변수 10개 있는 것과 같다고 봐도 된다.)
 	arr[0] = 100;  
 	
 */
 