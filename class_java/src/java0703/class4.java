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
	}

}


class Calc{
	
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