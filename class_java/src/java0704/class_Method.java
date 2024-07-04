package java0704;

import java.util.Scanner;

public class class_Method {

	public static void main(String[] args) {
	

		MethodUtil util = new MethodUtil ();
		MethodUtil login = new MethodUtil();
		MethodUtil cal = new MethodUtil();
		// 문제 1 
		// 두 개의 정수를 반환 하기
		int[] num = util.twoNum();

		// 문제 2
		// 사각형의 너비와 높이를 설정하고 넓이를 출력하세요.
		// 넓이는 main 메서드에서 출력되게 하세요.
		
//		Square square = new Square();
//		int area = square.area();
		
//		System.out.println("넓이는 " + area);
		
		//문제 3
		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		// login 메서드를 실행하여 로그인 여부를 출력하세요.
		// 아이디 비밀번호가 일치하면 로그인 성공 출력
		// 하나라도 불일치면 로그인 실패 출력
		// 로그인 여부 출력은 main에서 
		
		
//		boolean isFail = login.login();
//		
//		
//		if( isFail)  {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		// 문제 4  
		// 정수 세 개를 키보드를 통해 입력 받으세요. 
		//  입력한 세 정수의 합이 100을 넘으면
		// 100 - 합의 결과를 출력하고 ( 100 - 은 빼기를 의미함) 
		// 100을 넘지 않으면 세 정수의 합을 출력하세요.
		// main 메서드에서 출력
		
		
		System.out.println(cal.cal());
		
	}
}	// end


class MethodUtil {
	
	int cal () {
		Scanner sun = new Scanner(System.in);
		System.out.println("첫 번째 정수 :");
		int fist = sun.nextInt();
		
		System.out.println("두 번째 정수 :");
		int second = sun.nextInt();
		
		System.out.println("세 번째 정수 :");
		int third = sun.nextInt();
		
		int total = fist+second+third;
		int oneHundred = 100;
		
		if( total < oneHundred) {
			System.out.println(total);
			return total;
		}else {
			System.out.println(oneHundred -total);
		}
		return (oneHundred -total);
		
		/*
		 연달아서 입력해도 상관없다. 입력으로 판단하는건 스페이스와 엔터 
		int fist = sun.nextInt();
		int second = sun.nextInt();
		int third = sun.nextInt();
	     */
		
	}// end
	
	
	
	
	
	
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
//		int [] temp = new int [] {num1,num2}; temp 변수를 만들고 return에 temp를 줘도 된다.
		return new int [] {num1,num2};
		// return으로 반환 시킬 수 있는 값은 단일 값이다.
		// 여러개의 데이터를 return 하고 싶다면 배열로 만들어야한다. 
		// int twoNum() {}; -> int[] twoNum() {}; 로 바꿔줘야한다.!
	}
	
	
//	boolean login(){
//		Scanner  sun =new Scanner(System.in);
//		System.out.print(" 아이디 : ");
//		String id = sun.nextLine();
//
//		
//		System.out.print("비밀번호 : ");
//		String password =  sun.nextLine();
//		password = sun.nextLine();
//		
//		
//		boolean isSuccess = true;
//		if(id.equals("skyblue")) {
//			if( password.equals("1234sea"))
//				return isSuccess;
//		}
//			
//		return  isSuccess = false;
//	}
//	
//	
//	
}// end




class Square {
	
	int area () {
		int  bottomLine= 5;
		int heigth = 8;
		int area = bottomLine*heigth;
		return  area;
		
	}
	
	
	
	
}// end

