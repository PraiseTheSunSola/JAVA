package java7010;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		Member member = new Member("이순신", 2077);
		System.out.println( member.name + " " + member.birth);
		try {
		member.setAge();
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
		System.out.println(member.age);
		
		
		
		
		
		/*
		try {
			// 코드 
			if() 
				throw new NullPointerException("여기서부터 로직 시작");   
			// 일부로 오류를 내는 식. 오류의 기록을 남기고 확인하기 위해 사용한다. 
			// 다른 녀석에게 오류를 떠넘기기 위해서 사용하기도 한다. 그래야 오류의 출처를 확실히 할 수 있기도 한다.  (중앙집중화)
		   // 특정 상황일때만 일부로 오류를 내고 try 안에 입력한다.  
		   //  예외를 던지기와 떠넘기기는 같이 사용되는 경우가 많다. 
				
			// 코드 
				
		}catch(Exception e) {
				System.out.println("강제 오류 발생");
		}
*/
		
		
	} // end main

} // end  ExceptionHandling3

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
/*
	 setAge 메서드를 호출하여 age변수값 저장하는데 
	 age변수는 나이를 표현하기 위한 변수라 0보다 작은 값이 저장되면 안된다. 
	 올해 년도에서 태어난 년도를 빼기 했을때 0보다 작은값이 나온다면 잘못된 값이다. 
	 이 문제는 birth변수의 값이 잘못 되었기에 발생한 문제니까 
	 setAge 메서드에서 처리를 하는게 아니고 상위 코드에서 해결해야하므로 
	 예외 발생시키고 넘겨주기를 한다.
 */
void setAge() throws RuntimeException{ // 떠넘기려면 () 안에 메서드 이름을 적는게 아닌 그 뒤에 
		this.age = 2023 - birth;
		if( age < 0 ) 
			throw new RuntimeException("태어난 년도가 잘못되었다.");
	}
}

// throw - 예외 발생시키기
// throws - 예외처리 미루기



//class Member{
//	String name;
//	int age;
//	int birth;
//	Member(String name, int birth){
//		this.name = name;
//		this.birth = birth;
//	}
//	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age <0) 
//				throw new RuntimeException("태어난 년도가 잘못되었습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//	} // end steAge
//}