package java_0712_2;

public class LinkedList2 {
	
	Node head = null;	// ��ũ�帮��Ʈ�� ù ��° ���
	Node tail; 		//  ��ũ�� ����Ʈ�� ������ ���
	
	
	
	
	void add(int n) {	//	�� ������ ����
		Node temp =new Node(n);
		if(head == null) {
				head= temp;
				tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		
		
	}
	
	@Override 
	public String toString() {	// ��ü ��� 
		// LinkedList ( �迭�� �ƴϱ� ������ for�� ��� while�� ����Ѵ�. )
			String out = "[";
			Node move = head;  // ���� �ٲ�� �ȵȴ�. �׷��� �ٸ� ������ ����Ѵ�.
			while(move !=null) {
				out += move.num+ ",  ";
				move = move.next;
			}
			
			out = out.substring(0, out.length()-2);
			out += "]";
			return out;
	}
	
	
	int get (int index) {  // ������ ��ġ�� ������ ���
		return 0;
	}
	
	
	void remove(int index) {  // ������ ��ġ�� ������ ����
		
	}
	
}


//  �� ������ ���� - add
// ������ ���� -remove
// ��ü ��� - toString
// ������ �ϳ� ��� - get