package java0701;

import java.util.Scanner;

public class java_bingo {
	
		static Scanner sun = new Scanner(System.in);
	public static void main(String[] args) {
		
//		int [] number = new int[20];
//		
//		for( int i =0; i<number.length; i++) {
//			number[i] = (int)(Math.random()* 30)+1;
//			
//		}
//		
//		int count=0; // 5�� ��� ������ ������ ����
//		for(int i=0; i< number.length; i++) {
//			if(number[i] % 5 == 0) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println("5�� ��� �� �� ? " + count);
		
		/*�迭 �������, �迭�� ������ �����ϴ� ���
		 * �迭�� ����� ������ ���� �Ǵ� ���
		 * �迭�� ���������� ����� �Ǿ� ���� �ǹ̰� �ִ�. 
		*/
		
		
		/* ���� ���� Ǯ�� */ 
		
		/*	���� ���� �����
		 * 	1. 25 ũ�⸦ ������ �迭 ���� 
		 * 	�迭�� ���� ���� ����
		 * 	�ߺ����� ����
		 * 	25�� ���ڸ� ȭ�鿡 ���
		 * 	���� ���� - ���ڼ���( �Է�)
		 * 	������ ���� ��ġ�� ǥ���ϱ�
		 * 	�� �� �������� Ȯ���ϱ�
		 * 	������ ȭ�鿡 ��� 
		 */
		
		int[ ] bingo = new int[ 25];
		// 25�� ���� �ߺ����� ����
		for(int i=0; i< bingo.length; i++) {
				bingo[i] = (int) (Math.random () * 50 )+1;
				for(int k=0; k< i; k++) {
					if( bingo[k] == bingo[i]) {
						i --;  break; // �ߺ�üũ  k�� i�� �ε��� ǥ���� �ٸ��� ������ ���� ��ü�� �ϳ��̱� ������ k���� �������� ����. 
					}
				}
		}
		
		
	while( true) {
		// 5�� 5ĭ ���
		for( int i= 0; i<bingo.length; i++) {
			if( i%5 ==0)
				System.out.println(); // ��ȣ�� �����̸� /n �� ���������� �����ϰ� �ֱ� ������ �ڵ������� �ٹٲ��� �ȴ�.
			
			if( bingo[i] == 0)
				System.out.printf(" %2c ", '��'); // %c�� ���� ��� 
			else
			System.out.printf(" %2d", bingo[i] ); // %2d�� ����� ������ �ڸ��� ����.  ���ϱⰡ �ƴ�
			
		}
		// ���� ���� ����
		System.out.print("������� �Է�  :  ");
		int num = sun.nextInt();
		
		// ������ ���� ǥ���ϱ� 
		for(int i=0; i<bingo.length; i++) {
			if( num == bingo[i]) {
				bingo[i] = 0; break;
			}
		}
		
		//  5�� �����? �� �� �����
		
		int row = 0, column = 0, diagonal1 = 0, diagonal2 = 0, end = 0;		// row(����) column (����) diagonal(�밢��)
		
		for(int i=0; i<5; i++) {
			for( int k=0; k<5; k++) {
				if( bingo[i*5+k] == 0 ) row++;
				if( bingo[k*5+i] == 0) column++;
			}
			
			if( bingo[i*6] == 0) diagonal1++;
			if( bingo[i*4+4] ==0) diagonal2 ++;
			
			if(diagonal1 == 5) end++;
			if(diagonal2 == 5) end++;
			if( row == 5 ) end++; // �� �ٿ� 0�� 5����� 1�� ����
			if( column == 5) end++;  // �� ���⿡ 0�� 5����� 1���� 
			row = 0;
			column = 0;
		 }
		
		if ( end == 5) { // 5�� �����̴�.
			System.out.println(" 5�� ���� �ϼ�!!");
			break; // ���ѷ��� ����
		}
	}
	

		
		
		
		
		
		
		
		
	} // Main 

} // Public Class
