package java0718;

import java.util.Scanner;

public class learning_Threads2 {

	public static void main(String[] args) throws InterruptedException {
		
		Th1 th = new Th1();		// �Ϲ� Ŭ���� ��ü ����. �����尡 �ƴ� 
		new Thread(th).start();	// ������ ��ü ����
		
		for(int i=1; i<=5; i++) {
			System.out.println(" �¾縸��");
			Thread.sleep(2000);
		}
		
		
		

	}	// end  main

}	// end learning_Threads2

 class Th1 implements Runnable{

	@Override
	public void run() {
		Scanner sun = new Scanner(System.in);
		System.out.println("���� �Է� :  ");
		int num = sun.nextInt();
		System.out.println("�Է� ���� : "  +  num);
	}
	
}