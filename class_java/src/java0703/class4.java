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
		
		
		// �޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		// �Ű����� ���� �޼���, Ű���带 �Է� X
		
		Calc sayMyName = new Calc();
		sayMyName.sayMyName();
		
		
		//�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���.
		String animal = "��帮Ʈ������ �¾縸���� ������";
		String announcementDate = "2024-07-01";
		
		TestMethod test1 = new TestMethod();
		test1.test1(animal, announcementDate);
		
		
		// ���� ��¥�߿��� ���� �ϸ� ����ϼ���.
		// ���ڿ� �޼��� substring �Ǵ� split ���
		String examDate = "2024-08-13";
		test1.test2(examDate);
		
		
		
		// �� ����� ���� ��� ���� ���Ͽ� ����ϼ���.
		// ��հ��� �����Դϴ�. 
		
		int ��� = 31, ���� = 23, ���� = 28, ��� = 37;
		test1.test3(���, ����, ����, ���);
						
	}

} // class4


// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���.
// Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸����� ~~~~~~~~ ���.

class TestMethod {
	
	void test1 (String string1, String string2) {
		System.out.println(string1+" "+ string2);
		
	}
	
	void test2 (String date) {
		
		// substring ��� 
		date = date.substring(5,10);
		System.out.println("���� �� : "+date);
		
		// split ��� 
//		String[] current = date.split("-");
//		System.out.println(current[1] + " " + current[2]);
		}
	
	void test3 (int ��, int ��, int ��, int �� ) {
		
		int avg = (��+��+��+��) / 4;
		System.out.println("�� ���� ������ ����� "+avg+"�Դϴ�. �׷��ϱ� �¾縸��!!!!!!!!!!!!!!!!!");
		
	}
	
	
	
	
	
	
	
} // TestMethod





class Calc{
	
	
	
	
	void sayMyName () {
		String name = "Solaire of Astora";
		int age = 38;
		
		System.out.println("my name :"+name +" "+ " my age :"+ age);
		
	}
	
	
	
	
	
	
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