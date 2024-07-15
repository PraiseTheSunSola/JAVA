package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		

		Queue<String> q = new LinkedList < > ();
		
		q.add("�ڵ�");
		q.offer("����");
		q.offer("����");
		q.offer("�챸");
		
		System.out.println(q.poll());  // .poll() -> �������� �޼���
		System.out.println(q);
		System.out.println(q.peek());  // .peek() Ȯ�� 
		System.out.println( q );
		System.out.println(q.element() );  
		//  q�� �ƹ��͵� ����  ���� ���¿��� .element() �� ����ϸ� ���� �߻� 
		// .element()�� .peek()�� ���� ������ ���� Ȯ���ϴ� �޼��� 
		System.out.println(q.contains("������"));
		
		
		
		// �켱���� Q�� �Է��� ������� ��� ��.  
		//  ������ ���� �������� �켱������ ���� ( ������ ������ �ƴ�)
		
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
		 		�����ڰ� ������ Ŭ������ ��ü���� �켱������ ���Ϸ���
		 		compare �޼��带 �����ؾ��Ѵ�. 
		 		�������̽� Comparator�� implements �ؾ��Ѵ�. 
		 		
		 		
		 		
		 		
		 */
		
		
		
		
		
		
	}

}


/*
  		Queue - ť - ex) cpu�� ���ó��  - �ڹٿ��� LinkedList�� �����Ǿ� ���� 
  		FIFO - ���Լ��� 
  		���������� �켱���� Queue ( ��Ű���)
  		������ �Ա��� �ⱸ�� ���� ����
  		array list�� LinkedList�� �ߺ��� ���� 
  		
 */
