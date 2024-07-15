package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
	
		Stack <String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "���̹�";
		
		Scanner sun = new Scanner(System.in);
		
		while(true) {
				System.out.print("�̵������� �Է� (1.�� 2. ��) : ");
				String temp = sun.nextLine();
				if(temp.equals("1") && !back.isEmpty() ) { // ���� ������ �̵�
					pre.push( now );  // ���� �������� ���� ���ÿ� ����
					now = back.pop(); 
					
					
				} else if ( temp.equals("2") && !pre.isEmpty() ) { // �� ������ �̵�
					back.push(now);
					now = pre.pop();
					
					
					
				}else { // �� ������ �̵�
					back.push( now );
					pre.clear();
					now = temp;
				}
				
				System.out.println("���� ������ : " + now);
				System.out.println("back ������ ��� : " + back);
				System.out.println("pre ������ ��� : " + pre);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		Stack<String> st = new Stack<>();
		
		st.add("�̼���");
		st.push("������");
		st.push("������");
		st.push("�庸��");
		st.push("������");
		
		System.out.println(st);
		System.out.println(st.pop());  // ��� pop�ϸ� �� ������������ ���� 
		System.out.println(st);
		System.out.println(st.search("������"));  // �ε��� ��ȣ �˻� 
		
		System.out.println(st.size());
		
		// st.size() - st.search("������)
		// pop�޼��� ���� Ƚ�� 
		
		System.out.println(st.isEmpty());
		
	*/
		
		
	} // end main

} // end Stack

/*
	Stack  (�迭 ����)��
	
	�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����.
	�� ���� ���� ����� ����� �̷������ �����̴�.
	FILO - first in last out
	ex) �湮���
	�� ó�� ������ ���� �� �ؿ� ���̰� �� �������� ������ ������ ������ ����. 
	�� ó�� ���� ����Ϸ��� �� ���� ������ ���� ���� ������ ��� ������.
	
*/