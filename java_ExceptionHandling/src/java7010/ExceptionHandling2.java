package java7010;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		/* Tip 
		  {} 안에 들어가는 변수들은 그 안에서만 사용가능한 지역 변수
		 */
		
		
		
//		Scanner sun = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sun.nextInt();
//		
//		sun.nextLine(); 	// 버퍼 비우기
//		
//		System.out.println(num + 100);

		// 위에 코드에 try 와 catch를 넣는다면  아래처럼 변한다. 
		
		
		Scanner sun = new Scanner(System.in);
		int num=0;
		boolean is = true;
		
		
		do {
			try {
				
				
				System.out.print("정수 입력 : ");
				num = sun.nextInt();
				
				is = false;
//				if(is) break;
			} catch(InputMismatchException e) {		
		
			System.out.println("정수만 입력하세요!");
			
		}	finally {  // 오류가 나도 실행하고 나지 않아도 실행된다.  파일과 데이터베이스에도 finally를 사용한다. 
			// 파일이나 데이터베이스를 닫는다는건 버퍼를 비우는 행위. 비워줘야한다. 
			sun.nextLine(); 	// 버퍼 비우기
		}
		 
	}while(is);
		
		System.out.println(num + 100);
		System.out.print("이름 :  ");
		String name = sun.nextLine();
		System.out.println(name);
			
		
	} // end main

} // end ExceptionHandling2
