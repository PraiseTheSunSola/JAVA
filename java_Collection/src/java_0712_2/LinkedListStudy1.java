package java_0712_2;

import java.util.LinkedList;

public class LinkedListStudy1 {

	public static void main(String[] args) {
		
		//LinkedList�� ������ ArrayList�� ��������� �� ���� �޼��尡 ���̳���.
		// LinkedList�� ���� equals�� ��������� �ʾƵ� �ȴ�.
		LinkedList<String> list = new LinkedList<>();
		
		list.add("���ֵ�");
		list.add("����");
		list.add("�︪��");
		list.add("��ɵ�");
		list.add("����");
		
		list.indexOf("�︪��");
		System.out.println( list.get(3));
		list.forEach(�� -> System.out.println(��));

	}

}


      /*
  		ArrayList�� LinkedList ������
  		
  		�ڷᱸ���� ũ�� �� ������ ������. 
  		�迭�� LinkedList.
  		
  		�������� �۾��� �� �� ArrayList�� ���� (�迭 ���)
  		�׷��� ���� �� LinkedList�� ���� (�迭���� �߰� �߰� �����ϴ� �ӵ��� ����)
  		
  		LinkedList�� �̵��ð��� ArrayList�� ���� ���. 
  		
  		���� ���� �����͸� ���������� ó�� �Ѵٸ� ArrayList�� ����,
  	    ���� ���� �����͸� �����ϸ鼭 ó�� �Ѵٸ� LinkedList�� ����.
  	    
  	    
  	     */
  	   
 
