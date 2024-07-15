package java0715_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		/*
		 
		HashSet<String> hash = new HashSet<>();  // HashSet은 일반적인 배열이 아님
		
		hash.add("짜장면");
		hash.add("짬뽕");
		hash.add("순대국밥");
		hash.add("들깨국수");
		hash.add("맑은곰탕");
		hash.add("짜장면");  // 중복은 되지 않지만 덮어쓰기 됨으로 짜장면은 한 개!
		
		System.out.println(hash);  // Hash 알고리즘에 의해 저장되기 때문에 사람이 임의로 순서를 알아내기엔 매우 어려움
		
		// -저장한 데이터를 하나씩 꺼내지 못 한다. (그룹으로 움직이기 때문)
		
		
		hash.remove("짬뽕");  // 대신 저장한 데이터를 하나씩 삭제는 가능함.
		
		System.out.println(hash);
		
		// for을 사용하면 하나씩 꺼낼 수 있음. 
		
		for( String food : hash) {
			System.out.println(food);
		} 
		
		//	다만 HashSet을 사용할 땐 하나씩 꺼내진 않음
		
		//  ArrayList, LinkedList로 변환해서 그룹을 풀어서 데이터 출력 가능 이렇게 사용함. 하나씩 출력해야할 땐 
		ArrayList<String> list = new ArrayList<>(hash);  // ArrayList으로 변경함. 
		
		System.out.println(list);
		System.out.println( list.get(3)); 
		
		*/
		
		HashSet<String> 재학 = new HashSet<>();
		HashSet<String> 상민 = new HashSet<> ();
		
		재학.add("짜장면"); 재학.add("볶음밥");
		재학.add("돈까스"); 재학.add("쭈꾸미볶음");
		
		상민.add("김치볶음밥");  상민.add("떡볶이");
		상민.add("짜장면"); 상민.add("돈까스");
		
		// 교집합 - 두 개 이상의 그룹에 공통적인 값의 집합
		
		HashSet<String> 공통 = new HashSet<>();
		
		// Iterator => 순차적처리를 위해 컬렉션 프레임워크에서만 사용할 수 있는 인터페이스. ( 일회용)
		//  Iterator는 원본 데이터를 훼손 시키지 않고 복사 후 출력을 위해 사용하기 때문에 유용하다. 
		
		Iterator<String> it = 재학.iterator(); 
		
		// while을 이용해서 마지막 빈 값에 도달할 때까지 돌린다. 
		
		while(it.hasNext()) {
			String 재학food = it.next();
			if(상민.contains(재학food)) {
				공통.add(재학food);
			}
		}
		System.out.println("재학, 상민 교집합 : " + 공통);
		
		
		
		// 차집합 - A집합에서 B집합과의 교집합데이터를 제외한 데이터의집합
		HashSet<String> 차집합 = new HashSet<>();
		it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food = it.next();
			if( !상민.contains(재학food)) { // 차집합을 위해 공통적이지 않은것 출력이라는 의미로 앞에 !를 붙임
				차집합.add(재학food);
			}
		}
		System.out.println("상민에 대한 재학 차집합 : " + 차집합);
		
		// 합집합 - A집합과 B집합의 합 (중복없이)
		
		HashSet<String> 합 = new HashSet<>();
//		합 = 재학.clone(); 이렇게는 사용하지 못 함. 반환 타입을 알 수 없어서. 
		
		합 = (HashSet<String>)재학.clone();
		합.addAll(상민);  
		System.out.println(합);
		
		// 합집합 구할때 사용 되는 메서드 .addAll();
		// 교집합 - retainAll -> 재학.retainAll(상민)
		// 차집합 - removeAll 재학.removeAll(상민)
		
		HashSet<Integer> num0 = new HashSet<>();
		
		while(num0.size()<=10) {
			num0.add( Integer.valueOf((int)(Math.random()*50)) );
		}
		
//		System.out.println(num0);
		
		/*
		 		문제 
		 		num1, num2, num3 세 개의 집합을 만들고
		 		각각 1~50까지의 랜덤값 15개 저장을 하세요.
		 		num1과 num3의 교집합
		 		num1과 num2의 차집합
		 		num2와 num3의 교집합
		 		num1,num2,num3의 합집합
		 */
		
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size()<=14) {
			num1.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num1);
		
		while(num2.size()<=14) {
			num2.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num2);
		
		while(num3.size()<=14) {
			num3.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num3);
		
		//num1과 num3의 교집합
		
		// HashSet <Integer> 교집합1_3, 교집합2_3, 차, 합집합; 으로 여러개의 참조변수 생성 가능
		
		HashSet<Integer> 합집합1_3 = new HashSet <>();
		
		합집합1_3 = (HashSet<Integer>)num1.clone();
		합집합1_3.addAll(num3);  
		System.out.println(합집합1_3);
		
		
		
		// num1과 num2의 차집합
		
		HashSet<Integer> 차집합1_2 = new HashSet <>();
		
		차집합1_2 = (HashSet<Integer>)num1.clone();
		차집합1_2.removeAll(num2);
		System.out.println(차집합1_2);
		
		
		
		
		// num2와 num3의 교집합
		HashSet<Integer> 교집합1_3 = new HashSet <>();
		
		교집합1_3 = (HashSet<Integer>)num2.clone();
		
		교집합1_3.retainAll(num3);
		System.out.println(교집합1_3);
		
		
		
 		// num1,num2,num3의 합집합
		
		HashSet<Integer> 합집합1_2_3 = new HashSet <>();
		
		합집합1_2_3 = (HashSet<Integer>)num1.clone();
		합집합1_2_3.addAll(num2);
		합집합1_2_3.addAll(num3);
		System.out.println(합집합1_2_3); 
		
		
		// 내가 만든 클래스에서 합집합 교집합 차집합 구할려면 equals() 만들어줘야한다. 
		
		
		
		
	} 	// end main

}	// end SetStudy1


/*
 			
 			
 			Set 인터페이스
 			-HashSet , TreeSet
 			-순차대로 저장 되지 않는다. 
 			-중복 허용하지 않는다.  => 집합 표현이 가능함. 교집합, 차집합, 합집합. 
 			-저장한 데이터를 하나씩 꺼내지 못 한다. (그룹으로 움직이기 때문)
 			-인덱스가 없다. 
 			-Set은 집합(데이터의 그룹)을 다룰때 사용된다. 
 			-HashSet -> 집합을 표현
 			-TreeSet -> 검색에 특화 
 			
 			중복 제거와 그룹화 할 때 HashSet을 사용한다. 
 			
 			
 */
