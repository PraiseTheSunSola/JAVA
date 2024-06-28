package java0627;

import java.util.Scanner;

public class java_basic3 {
	static Scanner sun = new Scanner(System.in);
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
		
//		int num = 0;
//		// 1부터 내가 입력한 숫자까지의 총합을 구하세요.
//		
//		
//		System.out.print("숫자 입력 : ");
//		int number = sun.nextInt();
//		
//		int sum = 0;
//		for(int i=1; i<=number; i++) {
//			sum = sum + i;
//		}
//		System.out.println( " 총합 : "+ sum);
		
//		for( int i=1; true; i++) {
//			System.out.println(i);
//		} // 무한으로 나옴
		
		/*
		 * 반복문을 작성하려면 몇 번 반복되는가, 언제 반복문이 종료되어야 하는가
		 * 반복문 종료시점에 대해서 먼저 생각해야 한다.
		 * for문, while문, do~while문 모두 언제 반복이 끝나야하는가를 
		 * 찾지 못하면 작성할 수 없다. (무한루프이든, n번 반복이든)
		 */
		
		//1.
//		for( ; true; ) {
//			System.out.print("정수 입력 : ");
//			int num = sun.nextInt();
//			if( num==0 ) break;
//		}
		
		//2.
//		 int num1 = -1;
//		for( ; num1!=0; ) {
//			System.out.print("정수 입력 : ");
//			num1 = sun.nextInt();
//			
//		}
		/* 무한루프 종료시키는 방법
		 * 1. if문의 조건식이 참이되면 break 실행
		 * 2. for( ; 조건식 ; )  같다 혹은 같지 않다 라는 연산식을 만들면 break를 쓰지 않고도 멈출 수 있다. (break는 해당 반복문만 멈춤)
		 * 3. return; - 반복문코드가 있는 메서드를 종료시키기 때문에 반복문도 종료 된다. (return은 함수 자체를 멈춤)
		 * 
		 * break; - 반복문, switch 사용가능
		 * 				if문 단독으로 break사용 불가
		 * if(10>5) break; 이거 오류!!
		 */
		
		//continue;
		
//		for( int i=1; i<=10; i++) {
//			
//			System.out.println( i+ " 번째 반복 시작 ");
//			if (i%3 == 0) continue;
//			System.out.println( i+ " 번째 반복 진행중 ");
//			System.out.println( i+ " 번째 반복 마지막내용 ");
//		}
		
		//  자바의 랜덤
//		int random = (int)Math.floor(Math.random() *50)+1;  // key와 값의 타입을 일치 시키기 위해 Math.floor 앞에도 (int)를 붙인다.
	
	
	/*
	 * 랜덤의 범위 (1~50)
	 * 랜덤 값 계속 출력 
	 * 랜덤값이 11의 배수일 경우 반복문 종료 
	 */
	
//		int i = (int)Math.floor(Math.random() *50)+1; 
//	for(  i=1; i<=50; i++) {
//		if(i%11 == 0) {
//			return;
//		}else {
//			System.out.print(i);
//		}
		
		
//		for( ; true; ) {
////			int num1 = (int)Math.floor(Math.random()*50)+1;
//			int num1 = (int)(Math.random()*50)+1; // floor가 필요없다. 타입변환만 하면 알아서 바꿔준다. 실수를 정수로 
//			if( num1%11 == 0) break;
//			
//			System.out.println(num1);
//		}
		
		// up & down
		// 컴퓨터가 제시한 숫자 맞추기
		// 컴퓨터가 제시하는 숫자는 랜덤으로 (랜덤범위 20~100)
		// 컴퓨터가 제시한 숫자가 74 라면 
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
		
//		int min = 20;
//		int max = 100;
//		int com = (int)(Math.random()*(max - min +1 ))  -min;
//		int user= 0;
//		
//		for(; true; ) {
//			System.out.println("입력 : ");
//			user = sun.nextInt();
//			if(com == user) {
//				System.out.println("정답!");
//				break;
//			}else if( user < com) {
//				System.out.println("UP!");
//			}else if(user > com) {
//				System.out.println("DOWN");
//			}
//			
//		}
		
		// 이름이 있는 반복문
		
//		int sum = 0;
//		// for문의 이름이 더하기 이고 더하기를 브레이크 해준다.
//		 더하기 : for(int i=1; i<10;  i++) {
//			for( int k=1; k<=4; k++) {
//				if( sum + k > 40) break 더하기;
//				sum = sum +k;
//				System.out.println( i + " " + k);
//			}
//			System.out.println(i);
//			sum = sum +i;
//		}
//		 
//		if( sum < 40) {
//			System.out.println("sum 출력 : " + sum);
//		}

		
		// 베스킨라빈스 31
		//컴퓨터와 나하고 둘이 한다.
		//한 번에 제시할수 있는 숫자는 최소 1개, 최대 3개
		// 31을 입력하면 패배 
		
//		int num = 1;
//		for(;;) { // while(true) 무한루프
//			System.out.print("숫자 몇 개 : ");
//			int user = sun.nextInt();
//			System.out.print(" 나 : ");
//			for(int u=1; u<=user; u++) {
//				System.out.print( num + " ");
//				if(num == 31) break;
//				num++;
//			}
//			if(num == 31) break;
//			System.out.println();
//			
//			int com = (int) (Math.random() *3 )+1;
//			System.out.print("  com : ");
//			for(int c=1; c<= com; c++) {
//				System.out.print( num + " ");
//				if(num == 31) break;
//				num++;
//			}
//			if(num == 31) break;
//			System.out.println();
//		}
		
		// 이름있는 반복문으로 한다면 break를 두 번만 사용하면 된다.  원래는 반복문 당 break도 하나씩 넣어야 한다.
		
		int num = 1;
		베스킨: 
		for(;;) { // while(true) 무한루프
			System.out.print("숫자 몇 개 : ");
			int user = sun.nextInt();
			System.out.print(" 나 : ");
			for(int u=1; u<=user; u++) {
				System.out.print( num + " ");
				if(num == 31) break 베스킨;
				num++;
			}
			System.out.println();
			
			int com = (int) (Math.random() *3 )+1;
			System.out.print("  com : ");
			for(int c=1; c<= com; c++) {
				System.out.print( num + " ");
				if(num == 31) break;
				num++;
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
