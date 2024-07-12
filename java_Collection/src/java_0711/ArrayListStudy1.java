package java_0711;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member("이순신", 34, "19990405"));
		list.add(new Member("김춘추", 25, "19991208"));
		list.add(new Member("장보고", 28, "19960712"));
		list.add(new Member("한석봉", 31, "19930120"));
		list.add(new Member("김광식", 39, "19851010"));
		
		System.out.println( list);
		
		for( Member m : list) {
			if( m.getAge() >= 30) {
				System.out.println( m);
			}
			
		}

		System.out.println("========== 1995년 이후에 태어난 사람들==========");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(0,4); 
			//  1985 기준 인덱스 0~3까지 이지만 4까지 해야 0~4전까지 출력이 됨
			int year = Integer.parseInt(temp);
			if( year > 1995) 
				System.out.println( m);
		}
		
		
		// 8월, 9월, 10월, 11월에 태어난 사람만 출력
		
		System.out.println("==== 8월, 9월, 10월, 11월에 태어난 사람 ===");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(4,6);
			int month = Integer.parseInt(temp);
			if(month >= 8 && month <= 11) {
				System.out.println(m);
			}
		}
		
		
		
		list.add(2 , new Member("장영실", 34, ""));
		System.out.println(list);
		
		
		// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고
		// 0월 0일로 저장되게 하라. 
		
		for(Member mem : list) {
			if( mem.getBirth().isBlank()) {
				int year = 2024 - mem.getAge();
				mem.setBirth(year + "0000");
			}
		}
		
		System.out.println(list);
		
		/*
		 		개발자가 정의한 클래스를 컬렉션에 사용하는경우
		 		컬렉션의 메서드들을 온전히 사용하려면 필요한 메서드를
		 		클래스에 구현해야한다.
		 		필요한 메서드는 최상위 부모 클래스인 Object가 가지고 있다.
		 		추가로 컬렉션에 관련된 인터페이스를 implements 하기도 해야한다. 
		 */
		

		
		
		Member t =  new Member ("장보고", 28, "19960712");
		
		System.out.println(list.indexOf(t)); 	// Member클래스를 indexOf에 넣어서 찾기  
		
		System.out.println(list.contains(t));
		// indexOf = 배열 안에서 특정 값이 같은 것이 있는지 배열 안을 돌면서 비교한다.  없으면 -1
		// Integer 안에 equals를 개발자(내가 ) 직접 만들어줘야한다.  
		
		
		list.remove(t);
		
		System.out.println( list);
		
		list.forEach(m -> System.out.println(m));
		
		Member[] mem = list.toArray(new Member[list.size()]);  //  동적 -> 정적 배열화
		
		// 다른 언어에게 데이터(값)을 넘겨줄때 필요함. 
		
		for( Member mm : mem) {
			System.out.println(mm);
			
		}
		//  Member 안에 public String toString을 만들어 줘서 출력값이 나오는 것
		
		
		
		
		// 정렬
		
		// 자바의 버블 정렬에선 계산해서 양수일 경우에만 자리를 바꾼다. 
		
		Collections.sort(list);
		System.out.println("==== 정렬 후 =====");
		list.forEach(m -> System.out.println(m));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end main

} // end ArrayListStudy1
