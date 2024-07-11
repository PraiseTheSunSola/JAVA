package java7011;

import java.util.InputMismatchException;
import java.util.Scanner;


class NameValueException extends Exception {
	public NameValueException(String msg) {
		super(msg);  // 부모 클래스 지칭 
	}
}






public class ExceptionQuestion {

	static Scanner sun = new Scanner(System.in);
	
	public static void main(String[] args) {
		
/*   	원본 
		String name = null;
		int age = 0;
		String userInfo = null;
		
		System.out.print("이름 : ");
		name = sun.nextLine();
		
		
		System.out.print("나이 : ");
		age = sun.nextInt();
		sun.nextLine();  // 버퍼 비우기
		if(age >= 20) {
			System.out.print("자기소개 : ");
			userInfo = sun.nextLine();
		}
		
		System.out.println(age+ "살 " + name + "님은 " );
		System.out.println(userInfo.substring(0,10));
	*/	
		
				
		
		String name = null;
		int age = 0;
		String userInfo = null;
		
		
	try {	
		System.out.print("이름 : ");
		name = sun.nextLine();
		
		//	isEmpty() - 문자열 길이가 0인 경우 true;
		// 	isBlank() - 문자열이 비어있거나 빈 공백인 경우 true; ("", "   ")
		if(name.isBlank())  
				throw new NameValueException("이름을 입력하세요");
			
  		}catch(NameValueException n) {
			System.out.println(n.getMessage());
		}
			
			
		try {
			
		System.out.print("나이 : ");
		age = sun.nextInt();
		
		}catch(InputMismatchException i) {
				System.out.println("10진수 정수로 나이를 입력하세요");
				
		}finally {
			sun.nextLine();  // 버퍼 비우기
		}
		
		
		
		if(age >= 20) {
			System.out.print("자기소개 : ");
			userInfo = sun.nextLine();
		}
		
		System.out.println(age+ "살 " + name + "님은 " );
		
		try {
		System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("자기소개는 10자 이상 작성해주세요!");
		}catch (NullPointerException e2) {
			System.out.println("성인이 되면 와라!");
		}
		
		
	} // end main

} // end  ExceptionQuestion
