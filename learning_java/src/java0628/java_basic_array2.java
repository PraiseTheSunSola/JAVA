package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class java_basic_array2 {
	static Scanner sun = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 문제 1번
		// 과자 배열에 좋아하는 과자의 판매가격을 키보드로 입력하여 저장하세요.
		// 과자 배열에 저장된 판매가격들의 총합과 평균을 구하세요.
		
//		int[] snack = new int[5];
//		snack[0] = sun.nextInt();
//		System.out.println(snack[0]);
//		snack[1] = sun.nextInt();
//		System.out.println(snack[1]);
//		snack[2] = sun.nextInt();
//		System.out.println(snack[2]);
//		snack[3] = sun.nextInt();
//		System.out.println(snack[3]);
//		snack[4] = sun.nextInt();
//		System.out.println(snack[4]);
//		
//		System.out.println(Arrays.toString(snack));
		
//	for ( int i = 0; i<snack.length; i++) {
//		System.out.print("snack" + (i+1)+"	가격	");
//		snack[i] = sun.nextInt();
//	}
//		
//		
//		int sum = 0;
//		int avg = 0;
//		for(int i=0; i<snack.length; i++) {
//			sum = sum +snack[i];
//		}
//			avg = sum/5;   // 또는 sum / snack.length; 로 표현 가능함.
//
//		System.out.printf("과자들의 총합과 평균:  %d, %d" , sum,avg);
		
		
		/* 문제 2번
		 * 6명의 키를 tall 배열에 저장하였다.
		 * 키 175 미만을 출력하세요.
		 */
		
//		float[] tall = new float[] { 173.4f, 175.1f,
//					169.5f, 181.4f, 178.8f, 185.3f
//		};
//		
//		for(int i=0; i<tall.length; i++) {
//			if(tall[i]<175) {
//				System.out.println(tall[i]);
//			}
//		}
		/* 문제 3번 
		 * from 배열의 문자열중에서 "다크소울2", "블러드본", "다크소울3","세키로"를
		 * 선발대 배열에 저장하고 출력하세요.
		 */
//		String[] from = new String[] {
//				"킹스필드", "데몬즈소울", "다크소울1", "다크소울2",
//				"블러드본","다크소울3","세키로"," 엘든링" };
//		
//		String[]  vanguard =  new String[4];
//		
//		System.arraycopy(from, 3, vanguard, 0,4); 
//		// 전체를 복사한다고 할 땐 from.length 혹은 복사할 배열의 숫자 (총 수.0~마지막 자리까지)
//		System.out.println(Arrays.toString(vanguard));
		
//		String word = "i like banana"; //  llke로 표기하면 -1이 뜸 없는건 -1
//		/* 자바에서 객체는 indexOf가 가능함. 그리고 정적 배열은 객체가 아닌 배열을 
//		 * 클래스만 가능
//		 * 만드는 것이라 indexOf 사용은 안된다.
//		*/
//		// 문자열에서 특정 문자나 문자열의 위치찾기 - indexOf
//		System.out.println(word.indexOf("like"));
//		
//		// 문자열에서 특정 문자나 문자열의 존재유무 - true, false
//		System.out.println(word.contains("ba"));
//		String[] a= new String[] {"banana", "orange"};
//		
//		a[0].indexOf("na");
//		a[1].contains("ge");
		
		
//		String[] from = new String[] {
//				"킹스필드", "데몬즈소울", "다크소울1", "천추","다크소울2",
//				"블러드본","다크소울3","세키로"," 엘든링" ,"아머드코어6"};
//		
//		System.out.print("타이틀 검색 :	");
//		String search = sun.nextLine();
//		
//		for( int i=0; i< from.length; i++) {
//			// 문자열로 표현되어 있으니 메소드 사용 전 [i]로 표현 해야한다.
//			if(from[i].contains(search)) {
//				System.out.println("검색 결과 :	"  + from[i]); 
//			}
//		}
		
		/* 문제 4번
		 *  음료 검색하여 음료이름과 금액이 출력되게 하세요.
		 *  카페 배열에 없는 음료 검색시 죄송합니다. 준비중입니다. 라고 출력
		 */
		
		String[] cafe = new String[] {
				"아메리카노 : 2000원", "화이트 아메리카노 : 2800원", 
				"카페라떼 : 3000원", "돌체라떼 : 3800원", 
				"카페모카 : 3800원", "수박주스 : 4000원","써머아이스티 : 2900원",
				"복숭아아이스티 : 2800원", "자두아이스티 : 2800원",
				"유자에이드 : 3500원",
				"레몬에이드 : 3500원", "청포도에이드 : 3500원"
		};
		
		System.out.print("메뉴 검색 :  ");
		String search = sun.nextLine();
		
		boolean isDrink = true;
//		for( int i=0; i< cafe.length; i++) {
//			if(cafe[i].contains(search)) {
//				System.out.println("검색 결과 : " + cafe[i]);
//			}else {
//				System.out.println("죄송합니다. 준비중입니다. 인스타 DM으로 문의 부탁드립니다.");
//			}
//		}
		for( int i=0; i< cafe.length; i++) {
			if(cafe[i].contains(search)) {
				System.out.println("검색 결과 : " + cafe[i]);
				isDrink = false;
			}
		}
		
		if( isDrink) {
			System.out.println("죄송합니다. 준비중입니다.");
		}
		
		
		
		
		
		
		
	}

}
