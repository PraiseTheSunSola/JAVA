package java0703;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		
		
		// ���� �� �� �Է� �޾� ���� ����ϱ� 
		Calc calc = new Calc();
		calc.sum(40,10);
		
		
		
		
//		calc.sum();
		
		// �� ������ ������ ���Ͽ� ����ϼ���.
		int kor = 89, eng = 74, mat = 43;
		
		Calc newCalc = new Calc();
		newCalc.newSum(kor, eng, mat);
		
		
		// �޼��� ȣ���Ͽ� '�޼��� cat ��Ƴ�~'  ��� ���
		Calc catEasy = new Calc();
		catEasy.catDifficult();
		
		
		// �ν��Ͻ� ���� view�� ����ִ� a�� b ����ϱ�.
		
		Calc abprint = new Calc();
		abprint.view();
	}

}


class Calc{
	
	void view() {  // ���� a, b �� �� ����ϴ� �޼���
		int a = 10, b = 20;
		System.out.println(a+" "+b);
	}
	
	
	
	
	
	void catDifficult ( ) {
		
		System.out.println(" �޼��� cat ��Ƴ�~ �׷��ϱ� �¾縸��!!!!!");
	
	};

	
	
	
	
	
	void newSum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("�� ������ ���� : " + result);
	}
	
	
	
	
	
	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("�� : " + result);
	};
	
	
	
	
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