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
		Integer.parseInt(sun.nextLine());
		
		float tax = 0.08f;
		// 초기화를 습관화 하자. 
		String Sola = null;
		String Team1 = null;
		int solaPay = 0;
		
		
		String Artorias = null;
		String Team2 = null;
		int artoriasPay = 0;
		
		int  salary =0;  // 이렇게 입력하면 아래에서도 선언 가능함. 재사용 가능		

		
//		System.out.println("이름  : " + name + " 부서 : " +team+ "  수령액 : " +  salary) 로 표현 할수 있고 변수를 통일해서 사용해도 문제없다. 이 문제의 경우 
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
		salary = (int)(solaPay - (solaPay* tax)); 
		System.out.printf("솔라의 실수령액은 :  %d\n",  salary);
		
		/*
		 *  next() - 스페이스키, 텝키, 엔터키를 누르면 입력 끝
		 *  nextLine() - 엔터키 누르면 입력 끝
		 */
		
		sun.nextLine();// 입력 버퍼를 비워 줌으로서 원하지 않게 다른 문자가 같은 줄에 있는 것을 방지  그 후 문자를 받는 것에도 nextLine으로 바꿔준다.
		System.out.print("이름 :  " );
		Artorias = sun.nextLine();
		System.out.print("소속부서:  " );
		Team2 = sun.nextLine();
		
		System.out.print("월 급여액 :");
		artoriasPay = sun.nextInt();
		
		System.out.print(Artorias + "\n");
		System.out.print(Team2+ "\n");
		System.out.print(artoriasPay+ "\n");
		
		salary = (int)(artoriasPay - (artoriasPay* tax)); 
		System.out.printf("아르토리우스의 실수령액은 :  %d",  salary);
		
		/*
		 *  키보드를 누를때마다 입력버퍼라는 곳에 값이 머무르다가 운영체제에게 전달된다. 
		 *  
		 *  매번 비워주려고 적는건 귀찮다. 
		 *  Integer.parseInt(sc.nextLine())를 상단에 적어주면 알아서 계속 비워준다. 내 경우엔 sun
		 * */
	}

}
