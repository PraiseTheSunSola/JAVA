package java0626;

import java.util.Scanner;

public class java_basic3 {

	public static void main(String[] args) {
		
		/* 코드 작성하기전 해야 할 일 - 문제파악, 요구사항도출
		 *  문자열 - " "  큰따옴표로 표현하여 작성한다.
		 *  문자열은 String 클레스타입을 사용해야한다.
		 *  
		 *  
		 *  문제 2.
		 *  직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 *  세금은 8%를 낸다. 실수령액은 얼마인지 출력
		 *  이름, 부서, 실수령액을 출력하세요.
		 *  두 명의 직원에 대해 출력하세요.
		*/
		
		Scanner sun = new Scanner(System.in);
		
		String Sola;
		String Team1;
		int solaPay;
		float tax = 0.08f;
		
		String Artorias;
		String Team2;
		int artoriasPay;
		

		
		
		System.out.print("이름 :  " );
		Sola = sun.next();
		System.out.print("소속부서:  " );
		Team1 = sun.next();
		System.out.print("월 급여액 :");
		solaPay = sun.nextInt();
		
		System.out.print(Sola + "\n");
		System.out.print(Team1+ "\n");
		System.out.print(solaPay+ "\n");
		
// 자바에선 정수는 정수끼리 실수는 실수끼리 해야한다. 그래서 강제형변환을 해줘야한다.
// 작은 쪽에서 큰 쪽으로는 자동형변환이 되고, 큰 쪽에서 작은 쪽은 강제변환이 필요함.
// 문자열을 정수로 강제로 바꿀순 없다.
//		float salary = solaPay - (solaPay* tax);  이거에서 아래 코드로 바꿔줌
		int  salary = (int)(solaPay - (solaPay* tax)); 
		System.out.printf("솔라의 실수령액은 :  %d",  salary);
	}

}
