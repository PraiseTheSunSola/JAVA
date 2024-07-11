/*		자바 컬렉션 프레임워크
  
  		데이터를 저장,관리하기위한 자료구조 와
  		데이터를 가공처리하는 알고리즘이 구현되어있는 
  		클래스들의 집합체 
  		
  		각 클래스들의 구조, 특징, 역활들을 잘 파악하자!
  		
  		Collection, Map interface
  		
  		Collection interface
  		- List interface
  		{
  		 *같은 interface를 공유하기 때문에 사용하는 메서드도 같다*
  		 
  			ArrayList 클래스 
  			vector
  			LinkedList( 비 연속적인 구조, 배열의 단점을 보완함)
  			Stack
  			Queue
  		}
  			
  		- Set interface 
  		{
  			HashSet (데이터들의 그룹화 목적으로 사용됨)
  			TreeSet ( 검색 및 정렬 특화)
  			LinekdHashSet
  		}	
  	Map interface
  	{
  			-HashMap (데이터들의 그룹화 목적으로 사용됨)
  			-TreeMap ( 검색 및 정렬 특화)
  			-LinkedHashMap
  	}		
  			
  			
  			
 */


package java_0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class java_Collection1 {

	public static void main(String[] args) {
		
		
		
		//ArrayList는 동적 배열이고 처음 만들 때 배열의 공간을 정하지 않아도 된다. 
	/*
		ArrayList list1 = new ArrayList();
		
		list1.add(89);
		list1.add(230);
		list1.add(5252);
		list1.add(45.78);  // 실수도 저장이 가능함. 
		list1.add("솔라"); // 문자열도 가능함.
		System.out.println(list1);
	*/	
		// 타입지정을 해줘야 하는데 출력이 되는 이유는 최상위 클래스인 오브젝트로 인식하고 다형성에 의해 작동된다. 
		// 그러므로 타입을 지정해줘야한다. 
		
		
		

		ArrayList<Integer> list1 = new ArrayList<Integer>();  // < >  안에는 반드시 클래스타입만 들어가야한다. int (X)
		
		/* 	클래스 타입 목록
				
				Byte - byte
				Short - short
				Integer - int ( 스트림이라는걸 사용해야만 사용할 수 있음)
				Long - long
				Float - float
				Double - double
				Character - char
				Boolean - boolean
		*/
		
		
		list1.add(89);
		list1.add(230);
		list1.add(5252);
		list1.add(3434);
		list1.add(2);
		
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		
		 // 배열이지만 클래스 기반이기 때문에  .length가 아닌 .size(); 를  사용한다. 
		
		for( int i=0; i<list1.size(); i++) {
			
			// 클래스 기반이기 때문에 뭐든 메서드를 사용한다. 
			
				System.out.println( list1.get(i));
		}
		
		System.out.println( list1.indexOf(232));  // 찾고자 하는 인덱스가 배열 안에 없다면 -1이 출력된다.
		System.out.println( list1.contains(3434)); 
			
//			list1.remove(230);  
			// remove ()는 배열 안 특정 인덱스 삭제
//			System.out.println(list1);
			
		System.out.println( list1.isEmpty()); 	//  문자열 비어있는지 확인 비어있지 않다면 false 출력 
			
		list1.add(1,450);  // (index number / data);  추가하고 싶은 인덱스 자리 넘버 / 값 을 입력하면 해당 인덱스 넘버에 값이 추가
		System.out.println(list1);
		System.out.println(list1.lastIndexOf(230));
		
		list1.forEach(n -> System.out.println(n));
		
		/*
		 for(Integer n : list1) {
		   System.out.println(n);  
		   
		   =
		   
		   list1.forEach(n -> System.out.println(n)); 같음 
		 */
		
		list1.set( 3, 15);
		System.out.println( list1);
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = 
								new ArrayList<Integer>(Arrays.asList(aa)); 	// 정적 배열로 변화 
		
		Collections.sort(list1); 	// 인덱스 데이터 값을 오름 차순으로 정렬 작은 숫자부터 큰 숫자로  
		System.out.println(list1);
		
		
		list1.remove(Integer.valueOf(89));  // 배열 안에 들어있는 특정 인덱스 값 삭제 
		System.out.println( list1);
		
		
		//  문제 
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하세요. 
		
		ArrayList<String> greatMan = new ArrayList<>();   // 앞쪽에 데이터타입을 정의 했으니 뒤에는 <>만 사용해도 된다. 
		
		greatMan.add("김춘추");
		greatMan.add("장영실");
		greatMan.add("이성계");
		greatMan.add("정몽주");
		greatMan.add("정도전");
		greatMan.add("김정호");
	
		System.out.println(greatMan);
		
		ArrayList<String> greatMan2 = 
				new ArrayList<>(
						Arrays.asList(
								new String[] {
			"김춘추", "장영실", "이성계", "정몽주", "정도전", "김정호"
								})
						);
		
		for( String greatMan3 : greatMan2 ) {
			System.out.println(greatMan3);
		}
		
		greatMan2.forEach(greatMan3 -> System.out.println(greatMan3)); 
		// greatMan2에 값을 greatMan3에 저장하고 greatMan3을 출력 
		
		
		
	// 이름이 저장되어있는 ArrayListe에 이순신이 없으면 추가저장하고 
	// 있으면 저장하지 않기. 
		
		if (!greatMan.contains("이순신") ) {
			greatMan.add("이순신");
		}
		System.out.println(greatMan);
		
	}	// end main

} // end java_Collection1
