package java0703;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		
		// ���� �� �� �Է� �޾� ���� ����ϱ� 
		
		Calc calc = new Calc();
		calc.sum();

	}

}


class Calc{
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("�� : " + result);
		
	}
}