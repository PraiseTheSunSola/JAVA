package java_0712_2;

public class Node { //  노드는 데이터를 저장하는 기본 단위 (객체)	

	int num; 	//	데이터 저장
	Node next; 	// 다음 노드의 주소를 저장
	
	public Node(int num) {
		this.num = num;
		this.next = null;
	}
}
