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
