package java0718;

import java.util.Scanner;

public class learning_Threads2 {

	public static void main(String[] args) throws InterruptedException {
		
		Th1 th = new Th1();		// 일반 클래스 객체 생성. 쓰레드가 아님 
		new Thread(th).start();	// 쓰레드 객체 생성
		
		for(int i=1; i<=5; i++) {
			System.out.println(" 태양만세");
			Thread.sleep(2000);
		}
		
		
		

	}	// end  main

}	// end learning_Threads2

 class Th1 implements Runnable{

	@Override
	public void run() {
		Scanner sun = new Scanner(System.in);
		System.out.println("숫자 입력 :  ");
		int num = sun.nextInt();
		System.out.println("입력 숫자 : "  +  num);
	}
	
}