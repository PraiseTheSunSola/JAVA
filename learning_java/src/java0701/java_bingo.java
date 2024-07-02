package java0701;

import java.util.Scanner;

public class java_bingo {
	
		static Scanner sun = new Scanner(System.in);
	public static void main(String[] args) {
		
//		int [] number = new int[20];
//		
//		for( int i =0; i<number.length; i++) {
//			number[i] = (int)(Math.random()* 30)+1;
//			
//		}
//		
//		int count=0; // 5의 배수 갯수를 저장할 변수
//		for(int i=0; i< number.length; i++) {
//			if(number[i] % 5 == 0) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println("5의 배수 몇 개 ? " + count);
		
		/*배열 생성방법, 배열에 데이터 저장하는 방법
		 * 배열에 저장된 데이터 추출 또는 출력
		 * 배열은 순차적으로 사용이 되야 쓰는 의미가 있다. 
		*/
		
		
		/* 빙고 과제 풀이 */ 
		
		/*	빙고 게임 만들기
		 * 	1. 25 크기를 가지는 배열 선언 
		 * 	배열에 랜덤 숫자 저장
		 * 	중복없이 저장
		 * 	25개 숫자를 화면에 출력
		 * 	게임 시작 - 숫자선택( 입력)
		 * 	선택한 숫자 위치에 표시하기
		 * 	몇 줄 빙고인지 확인하기
		 * 	빙고판 화면에 출력 
		 */
		
		int[ ] bingo = new int[ 25];
		// 25개 숫자 중복없이 저장
		for(int i=0; i< bingo.length; i++) {
				bingo[i] = (int) (Math.random () * 50 )+1;
				for(int k=0; k< i; k++) {
					if( bingo[k] == bingo[i]) {
						i --;  break; // 중복체크  k와 i의 인덱스 표현만 다른것 뿐이지 빙고 자체는 하나이기 때문에 k에도 랜덤값이 담긴다. 
					}
				}
		}
		
		
	while( true) {
		// 5줄 5칸 출력
		for( int i= 0; i<bingo.length; i++) {
			if( i%5 ==0)
				System.out.println(); // 괄호가 공백이면 /n 을 내부적으로 포함하고 있기 때문에 자동적으로 줄바꿈이 된다.
			
			if( bingo[i] == 0)
				System.out.printf(" %2c ", '■'); // %c는 문자 출력 
			else
			System.out.printf(" %2d", bingo[i] ); // %2d는 출력할 숫자의 자리수 설정.  곱하기가 아닌
			
		}
		// 빙고 숫자 선택
		System.out.print("빙고숫자 입력  :  ");
		int num = sun.nextInt();
		
		// 선택한 숫자 표시하기 
		for(int i=0; i<bingo.length; i++) {
			if( num == bingo[i]) {
				bingo[i] = 0; break;
			}
		}
		
		//  5줄 빙고냐? 몇 줄 빙고냐
		
		int row = 0, column = 0, diagonal1 = 0, diagonal2 = 0, end = 0;		// row(가로) column (세로) diagonal(대각선)
		
		for(int i=0; i<5; i++) {
			for( int k=0; k<5; k++) {
				if( bingo[i*5+k] == 0 ) row++;
				if( bingo[k*5+i] == 0) column++;
			}
			
			if( bingo[i*6] == 0) diagonal1++;
			if( bingo[i*4+4] ==0) diagonal2 ++;
			
			if(diagonal1 == 5) end++;
			if(diagonal2 == 5) end++;
			if( row == 5 ) end++; // 한 줄에 0이 5개라면 1줄 빙고
			if( column == 5) end++;  // 열 방향에 0이 5개라면 1빙고 
			row = 0;
			column = 0;
		 }
		
		if ( end == 5) { // 5줄 빙고이다.
			System.out.println(" 5줄 빙고 완성!!");
			break; // 무한루프 종료
		}
	}
	

		
		
		
		
		
		
		
		
	} // Main 

} // Public Class
