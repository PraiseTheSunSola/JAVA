package java0703;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		
		// 정수 두 개 입력 받아 합을 출력하기 
		
		Calc calc = new Calc();
		calc.sum();

	}

}


class Calc{
	
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