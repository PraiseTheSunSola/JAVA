package java0626;

import java.util.Scanner;

//import java.util.Scanner; 자동완성 키는 컨트롤 + 스페이스

public class java_basic2 {

	public static void main(String[] args) {
		System.out.println("praise The Sun!");
		/*자바는 혼자서 출력하지 못 한다.  코드작성 -> 컴파일  -> 로더 (메모리에 적재하는 과정) ->  
		  jvm(가상의 공간)이  C언어와 같이 운영체제에게 출력 요청 ->  console창에 출력. 
		 */
		// System. in - 입력 
		// 입력받을수 있는 내장 클래스 - Scanner (단, 사용하려면 import를 해야한다. 가지고 와야한다.)
		// 경로를 몰라도 커서를 가져다대면 경로를 알려준다.
		Scanner sun = new Scanner(System.in);
		// scan은 참조변수 new는 메모리 영역중 동적인 힙에 있지만 주소를 가지고 있다.
		
		// float 타입 - nextFloat(),  double - nextDouble()
		// byte - nextByte(),  short - nextShort();
		//  char(문자) 는 없다.
		// 문자열 입력  - nextLine(),  next();
//		sun.nextInt();

//		int a = sun.nextInt();
//		System.out.println( a );
		
		/*
		 점심을 맛있게 먹었으니 철수가 점심을 먹기위해 편의점에 갔다.
		 대게라면과 삼각김밥, 바나나우유를 먹었다.
		 철수가 점심값으로 지불한 금액은 얼마인가?
		  */
//		int samgakKimbap;
//		int daegeRamyeon ;
//		int bananaFlavoredMilkDrink;
//		// int samgakKimbap, samgakKimbap, bananaFlavoredMilkDrink로 변수를 선언해도 된다.
//		System.out.printf("samgakKimbap : ");
//		samgakKimbap = sun.nextInt();
//		System.out.printf("daegeRamyeon : ");
//		daegeRamyeon = sun.nextInt();
//		System.out.printf("bananaFlavoredMilkDrink : ");
//		bananaFlavoredMilkDrink = sun.nextInt();
//		
//		int total = samgakKimbap + daegeRamyeon + bananaFlavoredMilkDrink;
//		System.out.println("점심값 : " + total+ "원");
		// System.out.printf("점심값 : %d 원 \n", 지불금액);
		
		/*
		 * 솔라는 친구들을 만나기 위해 나왔다.
		 * 나와서보니 지갑을 놓고 와서 집에 갔다왔다.
		 * 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다왔다.
		 * 솔라의 집은 5층이다. 솔라가 1층 올라가는데 3.4초가 걸렸다.
		 * 솔라가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇 초? 
		 */
		
		// 프로그램 코드는 기본 순차적으로 진행된다.
		// if, 함수(메소드), 반복문
		
//		int solarHouse;
//		float Time_to_go_up_to_the_first_floor;
//		int inOut;
//		
//		System.out.printf("solarHouse :");
//		solarHouse = sun.nextInt();
//		System.out.printf("Time_to_go_up_to_the_first_floor :");
//		Time_to_go_up_to_the_first_floor = sun.nextFloat();
//		System.out.printf("inOut");
//		inOut = sun.nextInt();
//		
//		float totalTime = (solarHouse-1)*Time_to_go_up_to_the_first_floor *inOut;
//		System.out.printf("총 걸린 시간은 %f 그러므로 태양만세",  totalTime  );
		
		/*
		 * 데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓)
		 * 데이터 타입
		 * 	정수 - byte, short, int, long
		 * 	문자- char
		 * 	실수- float, double
		 * 	참거짓- boolean
		 * 
		 * 변수 선언방법 - 데이터타입 변수이름;
		 * int num; 정수 타입 변수 선언
		 * double dnum; 실수 타입 변수 선언
		 * char ch; 문자 타입 변수 선언
		 * boolean bool; 참 거짓 변수 선언
		 * 
		 * 변수의 초기화 
		 * int num = 10; 변수 선언과 함께 데이터를 저장
		 * 
		 * 출력방법
		 * System.out.println( 출력내용);
		 * System.out.print(출력내용);
		 * System.out.printf(출력내용);		 
		 * 
		 * printf 사용시 함계 사용하는 형식지정자
		 *  %d, %u - 정수
		 *  %f - 실수
		 *  %c - 문자
		 *  %s - 문자열
		 *  
		 *  int age = 28;
		 *  System.out.printf("%s 마을의 나이가 %d살인 폭군지도자 %c씨  " ,
		 *  									"코딩빌", age, '박');
		 *  
		 *  Scanner 변수 = new Scanner(System.in);
		 *  *Scanner 클레스는 내장외부클래스이므로 import해야한다.
		 *  
		 *  변수.nextInt(); int타입 정수만 입력
		 *  변수.nextByte(); byte타입
		 *  변수.nextLong(); long타입 정수만 입력
		 *  변수.nextFloat(); float타입 실수만 입력
		 *  변수.nextDouble(); double타입 실수만 입력
		 *  변수. next(); 문자열 입력 
		 *  변수.next
		 */
		
		/*
		 * c언어, 자바, 건축학개론 시험 성적을 입력하세요.
		 * 세 과목의 총점과 평균을 각각 출력하세요. 
		*/
		
		int c = 50;
		int java = 70;
		int architecture_101 = 30;
		int totalPoint = c+java+architecture_101;
		int average = totalPoint /3;
		
		System.out.printf("세 과목의 총점은 %d praise The Sun!\n" , totalPoint);
		System.out.printf("세 과목의 평균은 %d praise The Sun!", average);
		
		
	}

}

