package java7011;

import java.util.InputMismatchException;
import java.util.Scanner;


class NameValueException extends Exception {
	public NameValueException(String msg) {
		super(msg);  // �θ� Ŭ���� ��Ī 
	}
}






public class ExceptionQuestion {

	static Scanner sun = new Scanner(System.in);
	
	public static void main(String[] args) {
		
/*   	���� 
		String name = null;
		int age = 0;
		String userInfo = null;
		
		System.out.print("�̸� : ");
		name = sun.nextLine();
		
		
		System.out.print("���� : ");
		age = sun.nextInt();
		sun.nextLine();  // ���� ����
		if(age >= 20) {
			System.out.print("�ڱ�Ұ� : ");
			userInfo = sun.nextLine();
		}
		
		System.out.println(age+ "�� " + name + "���� " );
		System.out.println(userInfo.substring(0,10));
	*/	
		
				
		
		String name = null;
		int age = 0;
		String userInfo = null;
		
		
	try {	
		System.out.print("�̸� : ");
		name = sun.nextLine();
		
		//	isEmpty() - ���ڿ� ���̰� 0�� ��� true;
		// 	isBlank() - ���ڿ��� ����ְų� �� ������ ��� true; ("", "   ")
		if(name.isBlank())  
				throw new NameValueException("�̸��� �Է��ϼ���");
			
  		}catch(NameValueException n) {
			System.out.println(n.getMessage());
		}
			
			
		try {
			
		System.out.print("���� : ");
		age = sun.nextInt();
		
		}catch(InputMismatchException i) {
				System.out.println("10���� ������ ���̸� �Է��ϼ���");
				
		}finally {
			sun.nextLine();  // ���� ����
		}
		
		
		
		if(age >= 20) {
			System.out.print("�ڱ�Ұ� : ");
			userInfo = sun.nextLine();
		}
		
		System.out.println(age+ "�� " + name + "���� " );
		
		try {
		System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("�ڱ�Ұ��� 10�� �̻� �ۼ����ּ���!");
		}catch (NullPointerException e2) {
			System.out.println("������ �Ǹ� �Ͷ�!");
		}
		
		
	} // end main

} // end  ExceptionQuestion
