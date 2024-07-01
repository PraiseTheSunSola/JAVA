package java_0701;

import java.util.Arrays;

public class java_Array {

	public static void main(String[] args) {
		
		/* 많은 양의 데이터를 다룰때는 배열을 사용한다.
		 * 상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		 * 보통은 배열의 구조에 데이터를 저장한다.
		 * 
		 * 동적 배열 만들기
		 * 기존의 배열 크기를 늘리거나 줄여서 사용하는 배열
		 */
		
//		int[] a = new int[5];
//		
//		a[0] = 10; a[1]= 20; a[4]= 40;
//		
//		System.out.println( Arrays.toString(a));
//		
//		a = new int[7];
//		a[5] = 100;
//		System.out.println( Arrays.toString(a));
		
//		int[ ] num = new int[] {10,20,30,40,50};
//		
//		// num[5] =60; 인덱스 범위 벗어나서 오류
//		// 데이터를 추가로 더 저장 하려면 배열의 크기를 늘려야 한다.
//		
//		int size = num.length; // 기존 배열의 크기
//		
//		int[] temp = new int[size+1];
//		
//		for(int i=0; i<size; i++) {
//			temp[i] = num[i];
//		}
//		
//		num = temp;
//		num[5] = 60;
//		System.out.println("크기 증가 후 : " + Arrays.toString(num));
		
		// 문자열에서 같다 비교는 .equals(); 로 한다.
		// 문자열에 특정문자나 문자열 포함여부는 .contains();
		// 다음 주소중 선화동에 주소만 추출하여 배열에 저장하세요.
		// 배열에 잘 저장되었는지 확인 출력은 Arrays 이용하여 출력.
		
		String[] addr = new String[] {
				"대전 중구 선화동 25", " 대전 중구 선화동 92",
				"대전 서구 둔산동 111", "대전 서구 둔산동 1023",
				"대전 유성구 노은동 93", " 대전 중구 대흥동 932",
				"대전 동구 가양동 945", "대전 중구 선화동 1234",
				"대전 중구 대흥동 23", "대전 중구 선화동 984"
		};
		String[] 선화동 = new String[addr.length];
		int  index= 0;
		
		for(int i=0; i<addr.length; i++) {
			if (addr[i].contains("선화동")) {
				선화동[index++]= addr[i];
				
			}
		}
//		System.out.println(Arrays.toString(선화동));
		
		/*[대전 중구 선화동 25,  대전 중구 선화동 92, 대전 중구 선화동 1234, 대전 중구 선화동 984, null, null, null, null, null, null]
		 * 라고 나오는데 null이 나오는건 선화동 배열 길이를 addr.length로 했기 때문에 선화동이 아닌 값들도 null로 표현되어 같이 들어온다.
		 */
		
		
		// 2차원 배열
		// 1차원 배열의 공간에 1차원 배열을 연결해놓은 구조
		// 데이터가 너무 다양하다면 배열을 쓰지 않는다.  속도도 떨어지기 때문에 4차원의 경우 
		
		int [][] arr = new int [5][3];  // 3개짜리 배열이 2개 있다는 의미. 
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr [0][2] = 30;
		arr [1][0] = 40;
		arr [2][1] = 50;
		
		/*	고등학교 1학년 학생들의 성적
		 * 	1학년은 1반부터 6반까지 있다.
		 * 	new [6] [30];
		 *  나머지 2차원 배열은 c언어에서 공부한다.
		 */
		
		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
		
		for( int data :  a) {
			System.out.println(data); // 배열에 있는 인덱스를 순차적으로 표현할거라면 이렇게 간단하게 식을 짜도 됨. 자바스크립트에선 for each에 해당한다. 배열전용으로만 쓰는 for문이다.
		}
		// 단점은 index가 없기 때문에 인덱스의 위치를 모른다. 
		
		/* 교제 184p의 문제를 해보자. 
		 * 
		 */ 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

}
