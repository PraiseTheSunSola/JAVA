package java0627;

import java.util.Scanner;

public class java_basic3 {
	static Scanner sun = new Scanner(System.in);
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
		
//		int num = 0;
//		// 1���� ���� �Է��� ���ڱ����� ������ ���ϼ���.
//		
//		
//		System.out.print("���� �Է� : ");
//		int number = sun.nextInt();
//		
//		int sum = 0;
//		for(int i=1; i<=number; i++) {
//			sum = sum + i;
//		}
//		System.out.println( " ���� : "+ sum);
		
//		for( int i=1; true; i++) {
//			System.out.println(i);
//		} // �������� ����
		
		/*
		 * �ݺ����� �ۼ��Ϸ��� �� �� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		 * �ݺ��� ��������� ���ؼ� ���� �����ؾ� �Ѵ�.
		 * for��, while��, do~while�� ��� ���� �ݺ��� �������ϴ°��� 
		 * ã�� ���ϸ� �ۼ��� �� ����. (���ѷ����̵�, n�� �ݺ��̵�)
		 */
		
		//1.
//		for( ; true; ) {
//			System.out.print("���� �Է� : ");
//			int num = sun.nextInt();
//			if( num==0 ) break;
//		}
		
		//2.
//		 int num1 = -1;
//		for( ; num1!=0; ) {
//			System.out.print("���� �Է� : ");
//			num1 = sun.nextInt();
//			
//		}
		/* ���ѷ��� �����Ű�� ���
		 * 1. if���� ���ǽ��� ���̵Ǹ� break ����
		 * 2. for( ; ���ǽ� ; )  ���� Ȥ�� ���� �ʴ� ��� ������� ����� break�� ���� �ʰ� ���� �� �ִ�. (break�� �ش� �ݺ����� ����)
		 * 3. return; - �ݺ����ڵ尡 �ִ� �޼��带 �����Ű�� ������ �ݺ����� ���� �ȴ�. (return�� �Լ� ��ü�� ����)
		 * 
		 * break; - �ݺ���, switch ��밡��
		 * 				if�� �ܵ����� break��� �Ұ�
		 * if(10>5) break; �̰� ����!!
		 */
		
		//continue;
		
//		for( int i=1; i<=10; i++) {
//			
//			System.out.println( i+ " ��° �ݺ� ���� ");
//			if (i%3 == 0) continue;
//			System.out.println( i+ " ��° �ݺ� ������ ");
//			System.out.println( i+ " ��° �ݺ� ���������� ");
//		}
		
		//  �ڹ��� ����
//		int random = (int)Math.floor(Math.random() *50)+1;  // key�� ���� Ÿ���� ��ġ ��Ű�� ���� Math.floor �տ��� (int)�� ���δ�.
	
	
	/*
	 * ������ ���� (1~50)
	 * ���� �� ��� ��� 
	 * �������� 11�� ����� ��� �ݺ��� ���� 
	 */
	
//		int i = (int)Math.floor(Math.random() *50)+1; 
//	for(  i=1; i<=50; i++) {
//		if(i%11 == 0) {
//			return;
//		}else {
//			System.out.print(i);
//		}
		
		
//		for( ; true; ) {
////			int num1 = (int)Math.floor(Math.random()*50)+1;
//			int num1 = (int)(Math.random()*50)+1; // floor�� �ʿ����. Ÿ�Ժ�ȯ�� �ϸ� �˾Ƽ� �ٲ��ش�. �Ǽ��� ������ 
//			if( num1%11 == 0) break;
//			
//			System.out.println(num1);
//		}
		
		// up & down
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� �������� (�������� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74 ��� 
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//		int min = 20;
//		int max = 100;
//		int com = (int)(Math.random()*(max - min +1 ))  -min;
//		int user= 0;
//		
//		for(; true; ) {
//			System.out.println("�Է� : ");
//			user = sun.nextInt();
//			if(com == user) {
//				System.out.println("����!");
//				break;
//			}else if( user < com) {
//				System.out.println("UP!");
//			}else if(user > com) {
//				System.out.println("DOWN");
//			}
//			
//		}
		
		// �̸��� �ִ� �ݺ���
		
//		int sum = 0;
//		// for���� �̸��� ���ϱ� �̰� ���ϱ⸦ �극��ũ ���ش�.
//		 ���ϱ� : for(int i=1; i<10;  i++) {
//			for( int k=1; k<=4; k++) {
//				if( sum + k > 40) break ���ϱ�;
//				sum = sum +k;
//				System.out.println( i + " " + k);
//			}
//			System.out.println(i);
//			sum = sum +i;
//		}
//		 
//		if( sum < 40) {
//			System.out.println("sum ��� : " + sum);
//		}

		
		// ����Ų��� 31
		//��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		//�� ���� �����Ҽ� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й� 
		
//		int num = 1;
//		for(;;) { // while(true) ���ѷ���
//			System.out.print("���� �� �� : ");
//			int user = sun.nextInt();
//			System.out.print(" �� : ");
//			for(int u=1; u<=user; u++) {
//				System.out.print( num + " ");
//				if(num == 31) break;
//				num++;
//			}
//			if(num == 31) break;
//			System.out.println();
//			
//			int com = (int) (Math.random() *3 )+1;
//			System.out.print("  com : ");
//			for(int c=1; c<= com; c++) {
//				System.out.print( num + " ");
//				if(num == 31) break;
//				num++;
//			}
//			if(num == 31) break;
//			System.out.println();
//		}
		
		// �̸��ִ� �ݺ������� �Ѵٸ� break�� �� ���� ����ϸ� �ȴ�.  ������ �ݺ��� �� break�� �ϳ��� �־�� �Ѵ�.
		
		int num = 1;
		����Ų: 
		for(;;) { // while(true) ���ѷ���
			System.out.print("���� �� �� : ");
			int user = sun.nextInt();
			System.out.print(" �� : ");
			for(int u=1; u<=user; u++) {
				System.out.print( num + " ");
				if(num == 31) break ����Ų;
				num++;
			}
			System.out.println();
			
			int com = (int) (Math.random() *3 )+1;
			System.out.print("  com : ");
			for(int c=1; c<= com; c++) {
				System.out.print( num + " ");
				if(num == 31) break;
				num++;
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
