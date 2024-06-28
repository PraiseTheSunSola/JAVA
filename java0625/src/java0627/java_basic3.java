package java0627;

import java.util.Scanner;

public class java_basic3 {

	public static void main(String[] args) {
		// 반복문 - for, while, do~ while
		// 반복문을 잘 하고싶으면 손코딩을 이용해서 직접 해보는게 좋다.
		/*
		for(	초기값;  조건식; 	 증감식){ 반복내용}
		조건식이 거짓이 될 때까지 중괄호안의 내용이 계속 실행된다.
		초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 ->
		조건식비교 -> 거짓이라면 -> 끝
		*/
		
//		for(int i=1;  i<10; i++) { // 배열에 적합한 반복문은 for문 
//			
//				System.out.println("아... 반복문... " +(2*i-1));
//		}
//		
//		for(int i=10; i>0; i--) { // 맨 끝 인덱스부터 호출하기.
//			System.out.println(i);
//		}
		
//		int num = 1;
//		int a=1;
//		num = num +a;
//		System.out.println(num); // 2
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 7
//		a++;
	
//		int num = 1;
//		for(int a=1; a<=3; a++) {
//			num = num + a;
//			System.out.println(num);
//		}
		
		int num = 0;
		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
		Scanner sun = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int number = sun.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number; i++) {
			sum = sum + i;
		}
		System.out.println( " 총합 : "+ sum);
		
//		for( int i=1; true; i++) {
//			System.out.println(i);
//		} // 무한으로 나옴
		
		/*
		 * 반복문을 작성하려면 몇 번 반복되는가, 언제 반복문이 종료되어야 하는가
		 * 반복문 종료시점에 대해서 먼저 생각해야 한다.
		 * for문, while문, do~while문 모두 언제 반복이 끝나야하는가를 
		 * 찾지 못하면 작성할 수 없다. (무한루프이든, n번 반복이든)
		 */
	}

}
