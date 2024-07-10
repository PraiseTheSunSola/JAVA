package java7010;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		/* Tip 
		  {} �ȿ� ���� �������� �� �ȿ����� ��밡���� ���� ����
		 */
		
		
		
//		Scanner sun = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		int num = sun.nextInt();
//		
//		sun.nextLine(); 	// ���� ����
//		
//		System.out.println(num + 100);

		// ���� �ڵ忡 try �� catch�� �ִ´ٸ�  �Ʒ�ó�� ���Ѵ�. 
		
		
		Scanner sun = new Scanner(System.in);
		int num=0;
		boolean is = true;
		
		
		do {
			try {
				
				
				System.out.print("���� �Է� : ");
				num = sun.nextInt();
				
				is = false;
//				if(is) break;
			} catch(InputMismatchException e) {		
		
			System.out.println("������ �Է��ϼ���!");
			
		}	finally {  // ������ ���� �����ϰ� ���� �ʾƵ� ����ȴ�.  ���ϰ� �����ͺ��̽����� finally�� ����Ѵ�. 
			// �����̳� �����ͺ��̽��� �ݴ´ٴ°� ���۸� ���� ����. �������Ѵ�. 
			sun.nextLine(); 	// ���� ����
		}
		 
	}while(is);
		
		System.out.println(num + 100);
		System.out.print("�̸� :  ");
		String name = sun.nextLine();
		System.out.println(name);
			
		
	} // end main

} // end ExceptionHandling2
