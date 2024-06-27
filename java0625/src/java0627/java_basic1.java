package java0627;

public class java_basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이진수나 십진수 같은걸 바꾸려는 노력을 해야한다. 
		
		//  연산자
		// 정수와 정수를 연산하면 결과 정수 
		//  정수의 실수를 연산하면 결과는 실수
		
		//  산술연산자 - +, -, *,  /(몫) , %(나머지)
		
		System.out.println(  10 / (float)4);
		System.out.println(  10 % 3);
		
		// 증감연산자 - ++ , --
		// 대입 연산자 - = 
		// 복합대입연산자 - +=, -=, *=,  /= , %= 
		int a = 10;
		a += 3; // a = a + 3; 저장되는 변수와 계산되는 변수가 반드시 동일해야한다. 
		
		// 비교 연산자 - > , < , >= , <= , == , ! =  숫자만 가능! 문자열에 이걸 쓰지 않는다.
		System.out.println(10 == 20);
		System.out.println(10 == 3.4);
		String name1 = "리슝신";
		String  name2 = "김유신";
		System.out.println(name1.equals(name2));
		// 논리 연산자 - &&, \\, !
		//조건 연산자 - (조건식) ? 참내용 : 거짓 내용;		
		
		//비트 연산자 
		//비트 논리 연산자 -&, \, ~ , ^
		//빝트시프트 연산자 - >> , <<
		// & 연산은 곱하기  | (or)은 더하기를 생각하면 된다? 말 그대로 더하거나 곱하라는게 아니라 논리적으로 생각할 때 그렇다는거다.
		
		System.out.println( 34 & 15);
		System.out.println(42 | 21);
		System.out.println(42 ^ 30);
		System.out.println(~13);
		System.out.println(~-15);
		// 보수 == 부족한 수  ex 10이 되기 위해 6에게 부족한 수 4 == 보수는 5
		System.out.println(5 <<  2);
		System.out.println(7 <<  7);
		
		// << 2의 n 승 구할때 
		System.out.println(1 << 20); // 2의 4승
		
		// >> 2의 n승 만큼 나누기
		System.out.println( 1024 >> 3); // 1024에 2의 3승 나누기.
		
		int red = 188;
		int green = 229;
		int blue = 92;
		int color = (red << 16)  | (green << 8) | blue;
		
		System.out.printf("#%06X /n" , color);
		// rgb 값을 헥사코드로 변환 컬러가 16진수로 변환 된 것  9이후 숫자부턴 알파벳으로 나온다.
	}

}
