package java0704;

import java.util.Scanner;

public class class_Method {

	public static void main(String[] args) {
	

		MethodUtil util = new MethodUtil ();
		MethodUtil login = new MethodUtil();
		MethodUtil cal = new MethodUtil();
		// ���� 1 
		// �� ���� ������ ��ȯ �ϱ�
		int[] num = util.twoNum();

		// ���� 2
		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���.
		// ���̴� main �޼��忡�� ��µǰ� �ϼ���.
		
//		Square square = new Square();
//		int area = square.area();
		
//		System.out.println("���̴� " + area);
		
		//���� 3
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main���� 
		
		
//		boolean isFail = login.login();
//		
//		
//		if( isFail)  {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
		// ���� 4  
		// ���� �� ���� Ű���带 ���� �Է� ��������. 
		//  �Է��� �� ������ ���� 100�� ������
		// 100 - ���� ����� ����ϰ� ( 100 - �� ���⸦ �ǹ���) 
		// 100�� ���� ������ �� ������ ���� ����ϼ���.
		// main �޼��忡�� ���
		
		
		System.out.println(cal.cal());
		
	}
}	// end


class MethodUtil {
	
	int cal () {
		Scanner sun = new Scanner(System.in);
		System.out.println("ù ��° ���� :");
		int fist = sun.nextInt();
		
		System.out.println("�� ��° ���� :");
		int second = sun.nextInt();
		
		System.out.println("�� ��° ���� :");
		int third = sun.nextInt();
		
		int total = fist+second+third;
		int oneHundred = 100;
		
		if( total < oneHundred) {
			System.out.println(total);
			return total;
		}else {
			System.out.println(oneHundred -total);
		}
		return (oneHundred -total);
		
		/*
		 ���޾Ƽ� �Է��ص� �������. �Է����� �Ǵ��ϴ°� �����̽��� ���� 
		int fist = sun.nextInt();
		int second = sun.nextInt();
		int third = sun.nextInt();
	     */
		
	}// end
	
	
	
	
	
	
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
//		int [] temp = new int [] {num1,num2}; temp ������ ����� return�� temp�� �൵ �ȴ�.
		return new int [] {num1,num2};
		// return���� ��ȯ ��ų �� �ִ� ���� ���� ���̴�.
		// �������� �����͸� return �ϰ� �ʹٸ� �迭�� �������Ѵ�. 
		// int twoNum() {}; -> int[] twoNum() {}; �� �ٲ�����Ѵ�.!
	}
	
	
//	boolean login(){
//		Scanner  sun =new Scanner(System.in);
//		System.out.print(" ���̵� : ");
//		String id = sun.nextLine();
//
//		
//		System.out.print("��й�ȣ : ");
//		String password =  sun.nextLine();
//		password = sun.nextLine();
//		
//		
//		boolean isSuccess = true;
//		if(id.equals("skyblue")) {
//			if( password.equals("1234sea"))
//				return isSuccess;
//		}
//			
//		return  isSuccess = false;
//	}
//	
//	
//	
}// end




class Square {
	
	int area () {
		int  bottomLine= 5;
		int heigth = 8;
		int area = bottomLine*heigth;
		return  area;
		
	}
	
	
	
	
}// end

