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


      /*
  		ArrayList와 LinkedList 차이점
  		
  		자료구조는 크게 두 가지로 나뉜다. 
  		배열과 LinkedList.
  		
  		순차적인 작업을 할 땐 ArrayList가 좋다 (배열 기반)
  		그렇지 않을 땐 LinkedList가 좋다 (배열보다 중간 중간 수정하는 속도가 빠름)
  		
  		LinkedList는 이동시간이 ArrayList에 비해 길다. 
  		
  		많은 양의 데이터를 순차적으로 처리 한다면 ArrayList가 좋고,
  	    많은 양의 데이터를 수정하면서 처리 한다면 LinkedList가 좋다.
  	    
  	    
  	     */
  	   
 
