package java_0701;

import java.util.Arrays;
import java.util.Scanner;

public class java_StringMethod {

	public static void main(String[] args) {
		
		/*자바에서 문자열을 사용하려면 String 클래스를 사용해야 한다.
		 * String 클래스는 내부적으로 char 기본 데이터타입의 배열이 생성되도록 되어있다.
		 * char 타입으로 생성된 배열은 동적 배열의 동작을 한다.
		 * 프로그램에서 사용되는 데이터중 70% 정도는 문자열 데이터이다.
		 * 문자열 관련 메서드는 필히 꼭 반드시 익혀야한다.
		 */
		
		// 교재 189p, 201p, 메소드들 반드시 숙지해야함. 
		
		
		// 문자열 데이터를 저장하는 방법
		String  word = "i like banana"; // 이 변수는 참조변수(클래스로 만들어진 모든 변수는 전부 참조변수). 메모리 주소를 저장할  수 있는 변수이다.  숫자계산은 안돼!
		// i like banana가 들어있는 주소를 word가 참고해서 불러오는 것 뿐 word 자체는 아무것도 가지지 않는다.
		
		// 문자열비교 - 같은 문자열인가?
		// equals
		System.out.println("equals : " + (word.equals("i like orange") ));
		
		// 문자열 포함여부
		System.out.println("contains : "	+	(word.contains("banana") ));  // 포함 여부만 알려줌. 포함 시켜주는게 아님!
		
		System.out.println("indexOf : "	+word.indexOf("orange") ); // -1은 없다, 포함되어 있지 않다는 뜻
		
		//문자열 합치기
		System.out.println(word + " 합치기");
		System.out.println( word.concat("합치기"));
		
		// 특정 문자 또는 문자열 위치 찾기
		System.out.println( word.indexOf('b'));  // 맨 앞에서부터 순차적으로 세서 알려줌.
		System.out.println(word.lastIndexOf('a')); // 맨 뒤에서부터 찾음
		
		// 문자열에서 특정 문자 추출
		System.out.println( word.charAt(5)); // 키보드로 문자를 입력받고 싶을때 사용함.
		
		Scanner sun = new Scanner(System.in);
		
		// 키보드로 문자입력 받기
		System.out.print("알파벳 하나 입력 : ");
		char alp = sun.nextLine().charAt(0);
		
		System.out.println("입력한 문자 : " + alp);
		
		
		// 	 문자코드중에서 기본 문자코드는 아스키코드이다.
		// 	아스키코드표는 총 128개 문자
		//	아스코드에서 65는 대문자 A, 97은 소문자 a
		char ch = 'A';   // 유니코드에 한글도 있기 때문에 한글도 가능함. 
		System.out.println( ch+4); // 아스키코드는 10진수로 표현 되어있기 때문에 계산이 가능하다. 
		
		//문자열의 길이
		System.out.println("문자열 글자수 : " + word.length());
		
		// 대문자 소문자 변환
		String 대문자 = word.toUpperCase();
		String 소문자 = word.toLowerCase();
		
		System.out.println(대문자);
		System.out.println(소문자);
		
		// 공백 제거
		String word2 = "  i hate java  "; 
		System.out.println(word2);
		System.out.println( word2.trim());  // 앞쪽 뒤쪽 공백만 제거 가능 가운데는 제거하지 못 함.
		
		// 위 메서드 중 가장 많이 사용되는 것들
		 // equals, contains, 
		 
		 //문자열 분할
		System.out.println( Arrays.toString( word.split(" ") ));
		String name = "이순신@김유신-강감찬@";
		
		String[] names = name.split("@");  //  @ 기준으로 나누는 것이고 기준이 되는 문자는 배열에 들어가지 않는다. 
		System.out.println( names[1]);
		
		// 문자열 자르기(추출)
		
		System.out.println( 	word.substring(2)	);   // 2번 인덱스부터 마지막 인덱스까지 빼와라.
		System.out.println(	word.substring(6) 	);  // 6번 인덱스부터 마지막 인덱스까지 빼와라.
		System.out.println( 	word.substring(2, 6) 	);  // 2번 인덱스부터 6번 인덱스 전 까지만 빼옴. 
		
		// 문자열 변환
		
		String 뽀뽀뽀 = "아빠가 출근할 때 뽀뽀뽀 엄마가 안아줘도 " + "뽀뽀뽀 만나면 반갑다고 뽀뽀뽀";
		
		String 변경 = 뽀뽀뽀.replace( "뽀뽀뽀", "뿡뿡뿡");  // 바꾸고자 하는거 앞에  그리고  변경될 내용 뒤에 
		
		System.out.println(변경);
		
		변경 = 변경.replaceAll("뿡뿡뿡", "뿌우웅");
		
		System.out.println( 변경);
		
		// .replaceAll에서만 정규표현식 사용가능 (java에선)
		
		/*
		 * 	정규표현식
		 * 	^ - 문자열의 시작 
		 * 	$ - 문자열의 종료
		 * 	. - 임의의 한 문자( 아무거나 문자 하나)
		 *   * - 앞 문자가 있거나 없거나 ( *가	->  	가로 끝나는 단어를 뜻함)
		 *   + - 앞 문자가 하나 이상
		 *   ? - 앞 문자가 없거나 하나있음
		 *   [] - 문자의 집합이나 범위를 나타냄
		 *   {} - 횟수 또는 범위
		 *   () - 소괄호의 문자를 하나의 문자로 인식
		 *   | - 패턴 안에서 or 연산 수행
		 *    \(역슬래시)  원 누르면 됨 
		 *   \s - 공백문자
		 *   \S - 공백문자가 아닌 나머지 문자
		 *   \w - 알파벳이나 숫자
		 *   \W - 알파벳이나 숫자를 제외한 문자
		 *   \d - 숫자
		 *   \D - 숫자를 제외한 모든 문자
		 *   
		 *   
		 *   문자열에서 숫자만 제거 - replace("[0-9]","")
		 *   연락처 - ^010- \d{4}-\d{4}$
		 *   한글만 작성 확인 - ^[가-힕]
		 */
		
		String a = "abc73jd82kd74j";
		System.out.println(a.replaceAll("[0-9]", ""));
		System.out.println(a.replaceAll("[\\d]", ""));
		
		System.out.println(a.replaceAll("[\\D]", ""));
		
	}

}
