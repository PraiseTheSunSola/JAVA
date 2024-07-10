package java7010;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		
		try {
			// 코드 
//			if() 
				throw new NullPointerException("aa");   // 일부로 오류를 내는 식 
				// 특정 상황일때만 일부로 오류를 내고 try 안에 입력한다.  djfudnj
				
			// 코드 
				
		}catch(Exception e) {
				System.out.println("강제 오류 발생");
		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	void setAge() {
		this.age = 2024 - birth;
	}
}