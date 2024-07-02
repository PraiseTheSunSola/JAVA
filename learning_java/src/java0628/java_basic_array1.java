package java0628;

import java.util.Arrays;

public class java_basic_array1 {

	public static void main(String[] args) {
		// 배열 - 같은 데이터타입 데이터가 저장되는 공간이 연속적으로 되어있는 구조
		// 자바에선 배열을 만들려면 타입지정부터 먼저 해야한다. 어떤 데이터를 저장할건지.
		
		// 1. 
//		int[] a = {10,20,30};
//		System.out.println( a[0] + "   " + a[1]); // 배열을 출력하려면 인덱스로 표현해야한다.
//		
//		//2.
//		int b[] = {30,40,50}; 
//		
//		//자바에선 .push가 없다. 뿐만 아니라 배열을 한번 만들었으면 추가 하거나 빼거나는 안된다. 다만 .length는 있다.
//		
//		System.out.println(a); // 출력되는 [I@7d6f77cc는 메모리 주소다.
//		
//		// 자바에선 배열을 출력시켜주는 메소드가 따로 있다. 
//		System.out.println(Arrays.toString(a)); // 배열 확인용
//		
//		
//		//3 - 자바에서 배열 만드는 정석 방법.
//		int[ ] arr = new int[10]; // 배열의 공간 10개 생성
//		
//		int[] brr = new int[ ] {10,20,30,40};
//		
//		//자바에선 반드시 배열의 공간을 몇 개 만들것인지 지정해줘야한다. (정적배열) 중간에 추가가 빼는것이 되지 않기 때문에 처음 만들때 공간을 많이 만든다.
//		
//		int[] arr2 = new int[100];
//		
//		int size = 15;
//		int [ ] arr3 = new int[size];
//		
//		System.out.println( arr3[0]);
//		
//		//배열 생성 방법
//		// 데이터타입 [] 배열이름 = new 데이터타입[배열크기];
//		
//		int[] money = new int[5];	//	5개의 int타입 공간을 가진 배열
//		money[0] = 5000;
//		money[1] = 12000;
//		money[2] = 4000;
//		money[3] = 43000;
//		money[4] = 50000;
//		
//		// 10000 이상의 값 출력
//		for( int i=0; i<money.length; i++) {
//			if(money[i] >= 1000) {
//			System.out.println( money[i]);
//			}
//		}
		
		
		int [] 엘든링 = new int [3];
		엘든링[0] = 80; 
		엘든링[1] = 78;
		엘든링[2] = 93;
		
		int [] 세키로 = new int[3];
		세키로[0] = 56; 
		세키로[1] = 84;
		세키로[2] = 72;
		
		System.out.println(" 엘든링 점수 : " + Arrays.toString(엘든링));
		System.out.println("세키로 점수 " + Arrays.toString(세키로));
		
		// 아노르론도, 틈새의땅 점수 중에서 80점 이상만 출력
		// 반복문으로 출력한다고 할 때, 두 배열의 크기가 같기 때문에 배열 하나로 출력 가능 
		// 대신 다른 배열이니 if문을 두 개 씀 
		for(int i=0; i<엘든링.length; i++) {
			if(엘든링[i]>= 80)
				System.out.println(엘든링[i]);
			if(세키로[i] >= 80)
				System.out.println(세키로[i]);
		}
		
		int [] 프롬소프트 = new int[엘든링.length + 세키로.length]; // 3 + 3 이니 프롬소프트 배열의 길이는 6;
		
//		for( int i=0; i< 프롬소프트.length; i++) {
//			if( i<3) 
//			프롬소프트[i] = 엘든링[i]; 
//			else 
//				프롬소프트[i] = 세키로[i-3];  // 프롬소프트 배열인 0 1 2는 엘든링이 먹었으니 3 4 5를 세키로에게 줘야해서
//		}
		
		/*
		 * 그 다음, 배열 프롬소프트의 인덱스 3부터 5까지는 세키로 배열의 값을 할당합니다. 
		 * 이 때, 세키로 배열의 인덱스는 0, 1, 2이므로, 프롬소프트 배열의 인덱스를 3부터 시작하면 세키로 배열의 인덱스는 i - 3이 됩니다:
			프롬소프트[3] = 세키로[3 - 3] = 세키로[0]
			프롬소프트[4] = 세키로[4 - 3] = 세키로[1]
			프롬소프트[5] = 세키로[5 - 3] = 세키로[2]
			즉, i가 3 이상일 때 프롬소프트 배열의 값을 세키로 배열의 값으로 채우기 위해 i - 3을 사용합니다.
		 */
		
//		for( int i=0; i<엘든링.length; i++) {
//			프롬소프트[i] = 엘든링[i];
//			프롬소프트[i+3] = 세키로[i]; // 왜 +3?
//		}
		
		
		// 복사 할배열 , 복사 인덱스, 저장할 배열, 저장 위치 인덱스, 몇 개?
		System.arraycopy(엘든링,0, 프롬소프트,0, 엘든링.length); // 배열 복사 메소드
		System.arraycopy(세키로, 0, 프롬소프트,3, 세키로.length);
		
		for( int i=0; i<프롬소프트.length; i++) {
			if(프롬소프트[i] >=80) {
				System.out.println(프롬소프트[i]);
			}
		}
		
		// Arrays.sort 배열을 오름 차순으로 정렬.
		Arrays.sort( 프롬소프트); 
		System.out.println( Arrays.toString(프롬소프트));
		
		boolean same = Arrays.equals(엘든링, 세키로);
		System.out.println("엘든링,세키로 배열이 같은가?" + same);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
