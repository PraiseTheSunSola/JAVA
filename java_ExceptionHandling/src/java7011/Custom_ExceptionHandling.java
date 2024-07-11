package java7011;

class PasswordException extends Exception {
	public PasswordException(String msg) {
				super(msg);
		}
}


public class Custom_ExceptionHandling {

	static void setPassword(String password) throws PasswordException{
			if(password == null)
				 throw new PasswordException("비밀번호를 입력하세요");
			if(password.length() < 8)
				throw new PasswordException("8자 이상 입력하세요");
			if(password.matches("[a-zA-Z]+"))
				throw new PasswordException("비밀번호는 숫자나 특수문자 포함");
	}
			//위 if문 중에 하나라도 오류(throw)가 발생하지 않으면 비밀번호 저장하기
			// return 없이도 메서드 동작을 종료시킨다. 
			// 사용자가 만든 예외처리 클래스는 반드시 throw를 해줘야한다. 
	
	
	public static void main(String[] args) {
		// 사용자 정의 예외처리 클래스 만들기
		try {
				setPassword( "dsdsdsa");
				
		}catch ( PasswordException e) {
				System.out.println(e.getMessage());
		}

	}

}
