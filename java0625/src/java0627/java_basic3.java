package java0627;

import java.util.Scanner;

public class java_basic3 {

	public static void main(String[] args) {
		// �ݺ��� - for, while, do~ while
		// �ݺ����� �� �ϰ������ ���ڵ��� �̿��ؼ� ���� �غ��°� ����.
		/*
		for(	�ʱⰪ;  ���ǽ�; 	 ������){ �ݺ�����}
		���ǽ��� ������ �� ������ �߰�ȣ���� ������ ��� ����ȴ�.
		�ʱⰪ -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������ ->
		���ǽĺ� -> �����̶�� -> ��
		*/
		
//		for(int i=1;  i<10; i++) { // �迭�� ������ �ݺ����� for�� 
//			
//				System.out.println("��... �ݺ���... " +(2*i-1));
//		}
//		
//		for(int i=10; i>0; i--) { // �� �� �ε������� ȣ���ϱ�.
//			System.out.println(i);
//		}
		
//		int num = 1;
//		int a=1;
//		num = num +a;
//		System.out.println(num); // 2
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(num);  // 7
//		a++;
	
//		int num = 1;
//		for(int a=1; a<=3; a++) {
//			num = num + a;
//			System.out.println(num);
//		}
		
		int num = 0;
		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
		Scanner sun = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int number = sun.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number; i++) {
			sum = sum + i;
		}
		System.out.println( " ���� : "+ sum);
		
//		for( int i=1; true; i++) {
//			System.out.println(i);
//		} // �������� ����
		
		/*
		 * �ݺ����� �ۼ��Ϸ��� �� �� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		 * �ݺ��� ��������� ���ؼ� ���� �����ؾ� �Ѵ�.
		 * for��, while��, do~while�� ��� ���� �ݺ��� �������ϴ°��� 
		 * ã�� ���ϸ� �ۼ��� �� ����. (���ѷ����̵�, n�� �ݺ��̵�)
		 */
	}

}
