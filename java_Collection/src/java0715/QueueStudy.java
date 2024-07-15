package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		

		Queue<String> q = new LinkedList < > ();
		
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살구");
		
		System.out.println(q.poll());  // .poll() -> 내보내는 메서드
		System.out.println(q);
		System.out.println(q.peek());  // .peek() 확인 
		System.out.println( q );
		System.out.println(q.element() );  
		//  q에 아무것도 넣지  않은 상태에서 .element() 를 사용하면 에러 발생 
		// .element()와 .peek()는 다음 내보낼 값을 확인하는 메서드 
		System.out.println(q.contains("복숭아"));
		
		
		
		// 우선순위 Q는 입력한 순서대로 출력 됨.  
		//  숫자의 값이 낮을수록 우선순위가 높음 ( 순차적 순위가 아님)
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq );
		
		for( int i=1; i<5; i++) {
			System.out.println(pq.poll());
		}
		
		
		
		
		/*
		 		개발자가 정의한 클래스의 객체에서 우선순위를 정하려면
		 		compare 메서드를 구현해야한다. 
		 		인터페이스 Comparator를 implements 해야한다. 
		 		
		 		
		 		
		 		
		 */
		
		
		
		
		
		
	}

}


/*
  		Queue - 큐 - ex) cpu의 명령처리  - 자바에선 LinkedList로 구현되어 있음 
  		FIFO - 선입선출 
  		예외적으론 우선순위 Queue ( 백신같은)
  		스택은 입구와 출구가 따로 있음
  		array list와 LinkedList도 중복이 가능 
  		
 */
