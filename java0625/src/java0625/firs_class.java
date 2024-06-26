package java0625;

public class firs_class {

	public static void main(String[] args) {
		// 자바 기본 구조 - 프로젝트 - 패키지 - 클래스
		
		System.out.println("이 앞 고난있다. 그러나 걱정하지 마라 태양이 우리와 함께한다. 그러므로 태양만세! 프롬만세!"); //출력
		// 코드실행 - 왼쪽ctrl + f11
		// 자바 변수 생성
		// -> 데이터타입 변수이름 = 데이터;
		// 데이터의 종류에는 정수, 실수, 문자
		//정수 - byte, short, int, long (왼쪽에서 오른쪽으로 더 많은 숫자를 넣을수 있음. 구분해서 사용해야함.)
		//문자 - char
		//실수 - float, double
		byte num = 10; // byte에는 정수만 가질수 있음. 1byte
		short num1 = 200; // 2byte
		int num2 = 2323; // 4byte
		long num3 = 234; // long에는 끝에 L을 붙어야한다. 8byte
		
		char ch = 'a'; // 자바에선 " "는 문자열을 의미하고 ''는 문자를 의미한다.  '' 안에는 문자 하나씩만 담아야함.
		
		float fnum = 3.14f; //float에 데이터를 저장하려면 끝에 f를 붙어야한다. .뒤로 6자리까지 표현 가능
		// f를 붙이는 이유는 컴퓨터의 태생적 계산 오차범위를 최소화 하기 위해 붙인다.
		double dnum = 12.345; // 이녀석은 . 뒤로 15자리까지 표현 가능
		fnum = 35;
		
		boolean isTrue = false; // 참인지 거짓인지 표현하는 데이터 타입
		// 문자열을 다루는 타입은 존재하지 않는다. 그래서 배열을 만든다.
		
		String word = "세키로"; // String는 데이터 타입이 아닌(기본) 클래스로, 클래스는 사용자 정의 타입 첫글자는 대문자!
		
		// 사각형의 넓이를 구하시오.(밑변과 높이는 정수.)
		int width = 15; // int는 32bit
		int height = 20;
		int area = width * height;
		System.out.println("넓이 : " + area);
		
		// 키보드를 30개 구매해야한다.
		//hp게이밍키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
		int keyboard = 30;
		int keyboardPrice = 8000;
		int totalPrice = keyboard * keyboardPrice;
		System.out.println("총 구매금액:" + totalPrice); //ln은 라인을 의미함.
		// f11만 누르면 이전에 출력했던 것만 출력됨. 그래서 컨트롤 + f11을 눌러야 최신 입력한 코드까지 결과로 나옴
		System.out.print("java 출력 방법 print"); //  print는 줄바꿈이 되지 않는다.
		System.out.print("줄바꿈이 안된다.");
		System.out.printf(" printf \n 출력"); 
		//\n을 사용하면 줄바꿈이 된다.  \n == 엔터키 
		// printf에선 서식 문자(형식지정문자) 사용이 가능하다.
		System.out.printf("총 금액  : %d", totalPrice); // totalPrice를 %d에 넣을수 있다.
		
		// %d - 10진수 정수
		// %u- 10진수 정수
		// %f - 10진수 실수 .뒤로 6자리까지 출력 가능
		// %c - 문자
		// %s - 문자열
		//%b - boolean(false, true)
		// %o - 8진수 정수 %x - 16진수 정수
		
		System.out.printf("국어 : %d점 수학 : %d점 \n", 80, 90); // 80은 첫 번째 국어의 %d로, 90은 수학으로
		
		System.out.printf("%d  %f", 80, 3.14); // 큰 따옴표("") 안에서는 계산 안 됨.
		
		System.out.println(172.315);
		System.out.print(172.315);
		System.out.printf( "\n %.1f",172.315); // %.1f는 .뒤로 한 자리만 나오게 하겠다. 
		System.out.printf("%5d", 3); //  %5d는 자릿수 지정. 문자열도 자릿수 지정 가능.
		// 이 세 개 중 골라서 사용하면 된다.
		
		
//		num = 3.14;
//		num = "솔라"
	}

}
