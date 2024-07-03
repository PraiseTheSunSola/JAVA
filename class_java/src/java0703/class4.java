package java0703;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		
		
		// 정수 두 개 입력 받아 합을 출력하기 
		Calc calc = new Calc();
		calc.sum(40,10);
		
		
		
		
//		calc.sum();
		
		// 세 과목의 총점을 구하여 출력하세요.
		int kor = 89, eng = 74, mat = 43;
		
		Calc newCalc = new Calc();
		newCalc.newSum(kor, eng, mat);
		
		
		// 메서드 호출하여 '메서드 cat 어렵네~'  라고 출력
		Calc catEasy = new Calc();
		catEasy.catDifficult();
		
		
		// 인스턴스 변수 view에 들어있는 a와 b 출력하기.
		
		Calc abprint = new Calc();
		abprint.view();
		
		
		// 메서드를 호출하여 이름과 나이를 출력하세요
		// 매개변수 없는 메서드, 키보드를 입력 X
		
		Calc sayMyName = new Calc();
		sayMyName.sayMyName();
		
		
		//메서드를 호출하여 아래의 데이터를 출력하세요.
		String animal = "골드리트리버는 태양만세를 좋아해";
		String announcementDate = "2024-07-01";
		
		TestMethod test1 = new TestMethod();
		test1.test1(animal, announcementDate);
		
		
		// 다음 날짜중에서 월과 일만 출력하세요.
		// 문자열 메서드 substring 또는 split 사용
		String examDate = "2024-08-13";
		test1.test2(examDate);
		
		
		
		// 네 사람의 나이 평균 값을 구하여 출력하세요.
		// 평균값은 정수입니다. 
		
		int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
		test1.test3(흥민, 강인, 희찬, 재범);
						
	}

} // class4


// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용.
// 클래스 메서드, 클래스 변수는 클래스 이름으로 ~~~~~~~~ 사용.

class TestMethod {
	
	void test1 (String string1, String string2) {
		System.out.println(string1+" "+ string2);
		
	}
	
	void test2 (String date) {
		
		// substring 사용 
		date = date.substring(5,10);
		System.out.println("월과 일 : "+date);
		
		// split 사용 
//		String[] current = date.split("-");
//		System.out.println(current[1] + " " + current[2]);
		}
	
	void test3 (int 흥, int 강, int 희, int 재 ) {
		
		int avg = (흥+강+희+재) / 4;
		System.out.println("네 선수 나이의 평균은 "+avg+"입니다. 그러니까 태양만세!!!!!!!!!!!!!!!!!");
		
	}
	
	
	
	
	
	
	
} // TestMethod





class Calc{
	
	
	
	
	void sayMyName () {
		String name = "Solaire of Astora";
		int age = 38;
		
		System.out.println("my name :"+name +" "+ " my age :"+ age);
		
	}
	
	
	
	
	
	
	void view() {  // 변수 a, b 의 값 출력하는 메서드
		int a = 10, b = 20;
		System.out.println(a+" "+b);
	}
	
	
	
	
	
	void catDifficult ( ) {
		
		System.out.println(" 메서드 cat 어렵네~ 그러니까 태양만세!!!!!");
	
	};

	
	
	
	
	
	void newSum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("세 과목의 총점 : " + result);
	}
	
	
	
	
	
	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("합 : " + result);
	};
	
	
	
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("합 : " + result);
		
	}
}