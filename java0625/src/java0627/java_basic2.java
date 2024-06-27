package java0627;

import java.util.Scanner;

public class java_basic2 {

	public static void main(String[] args) {
		
		Scanner sun = new Scanner(System.in);
		
		//  제어문 
		
		
		//조건문 - if (데이터 제어), switch ( 코드 동작 제어)
		// 반복문 - for, while, do~while (선택지가 많은 경우 혹은 범위가 있는 경우.) 
		
		//if문의 조건식 - 비교연산자와 논리연산자로 식을 만든다. 
		//	즉, 참과 거짓이 나올수 있는 식
		// 키가 150 이상이다.  				키   >=  150
		// 10월 달의 지출 내역 				전체지출날짜 월 ==  10
		//  32000원 이상의  지출 내역 			가정문은 지출금  >= 32000
		
		// 판매중인 상품들만 출력 					상품상태  == 판매  ,  재고수량  >  0
		
		int tall = 135;
		if(tall >= 150) {
			// 키가 150이상이 맞다면 무엇을 할 것인지 
		}else {
			// 키가 150이상이 아니라면 무엇을 할 것인지
		}
		
		//  시험 합격 기준 - 합격 ( 60점 이상), 불합격 ( 60점 미만)
		
		int score = 72;
		int pass = 60;
		
		if(score >= pass) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}
		
		// if ~ else  -  조건식이 참, 거짓에  따라 실행되는 내용이 다른경우
		// 하나의 조건에 두 개의 내용이 있는경우  if ~ else 구조로 작성.
		
		// 시험 성적 등급 -  A(90점이상), B(80점이상), C(70점이상),  D(나머지)
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		score = 89;
		if ( a > score) {
			System.out.println( "A");
		} else if ( b < score &&  b >= 80) { // 만약 동작해야할 내용이 두 가지라면 else if(조건식)은 필요없이 else만 있어도 됨.
			System.out.println( "B");
		}else if(c < b && c >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		/*
		 *  switch - 실행 조건을 case로 설정하여
		 *  				 case와 일치하는 값일 경우 발동 되는 조건문 기본적으로 
		 *  
		 *  지렁이 게임을 만든다. 방향키는 w,a,s,d 이고
		 *  p키는 일시정지 , o키는 계속하기 , i는 처음부터 다시 시작
		 *  ctrl+s는 게임 시작이라고 한다면
		 *  
		 *  switch(키보드값){
		 *  				case 'a' : 실행내용
		 *  				case 'w' : 실행내용
		 *  				case 's' : 실행내용
		 *  				case 'd' : 실행내용
		 *  				case 'p' : 실행내용
		 *  				case 'o' : 실행내용
		 *  				case 'i' : 실행내용
		 *  				case 'ctrl' : 
		 *  					switch(키2){
		 *  
		 *  				}
		 *  }
		 *  
		 *  			프로그램으 ㅣ메뉴 구성
		 *  
		 *  			switch(menu){
		 *  					case "open":
		 *  					case "save":
		 *  					case "build":
		 *  					case "git" :
		 *  					case "exit": 
		 *  				}
		 *  			if(menu.eqas("open")
		 *  			조건식이 == 연산자가 사용된다면  switch으로 작성하는 것을 고려 해보기.
		 *  
		 *  		// 시작 버튼을 클릭하면 게임을 시작하고
		 *  		// 종료 버튼을 클릭하면 ㄱ ㅔ임을 종료하고
		 *  		// 저장 버튼을 클릭하면 게임을 저장해라.
		 *  
		 */
		
		
		
//		String button = "시작";
//		
//		switch(button) {
//		case " 시작 " :
//			System.out.println("게임 시작");
//			break;
//		case "자동저장":
//		case " 저장"	 :
//			System.out.println("게임 저장");
//			break;
//		case "종료" :
//			System.out.println( "게임 종료");
//		}
		
		
		// 가로와 세로의 길이를 키보드로 입력하세요. ( 단위는 신경쓰지 말고 )
		//가로 또는 세로의 길이가 크다면 직각사각형
		// 가로와 세로의 길이가 같다면 정사각형 이라고 출력하세요.
		// switch문으로 (if문 절대 쓰지 말고)
		
		int width = 0;
		int height = 0;
		
		System.out.print("가로길이 : ");
		width = sun.nextInt();
		System.out.print("세로길이 : ");
		height = sun.nextInt();
		
		int res = width - height; // 10 - 5 -> 5
		
		
		switch(res) { // res 타입이 int이기 때문에 3.1  같은 . 뭐뭐 숫자는 안된다. 
		case 0:
			System.out.println("정사각형");
			break;
		default :
			System.out.println("직각사각형");
		}
// switch문에서 default는 한 번만 사용
// switch에 들어온 값이 case에 일치하는게 없다면 default 실행된다.
// 주어진 case와 일치하는게 하나도 없으면 default만 실행하고 종료.		

		
	}

}
