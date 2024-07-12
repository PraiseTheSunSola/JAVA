package java_0712_2;

import java.util.LinkedList;

public class LinkedListStudy1 {

	public static void main(String[] args) {
		
		//LinkedList의 사용법도 ArrayList와 비슷하지만 몇 개의 메서드가 차이난다.
		// LinkedList는 따로 equals를 만들어주지 않아도 된다.
		LinkedList<String> list = new LinkedList<>();
		
		list.add("제주도");
		list.add("독도");
		list.add("울릉도");
		list.add("백령도");
		list.add("마라도");
		
		list.indexOf("울릉도");
		System.out.println( list.get(3));
		list.forEach(도 -> System.out.println(도));

	}

}
