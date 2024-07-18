package java0718;

public class learning_Threads {

	public static void main(String[] args) {

		MyThread th = new MyThread();	// 쓰레드 객체 생성
		th.start();  //  쓰레드 실행 

		
		
	}

	
	
}

class MyThread extends Thread{
	
	@Override  // 오버라이드 되어 있기 때문에 메서드 변경하면 안됌.
	public void run( ) {
		System.out.println("오! 쓰레드~~ 태양만세");
		
	}
	
	
	
	
}


/*
		프로세스 - cpu에 의해 메모리 (ram)에 로드 되어있는 프로그램을 말한다. 
		
		즉, 실행중인 프로그램들이 프로세스이다. 
		102개의 프로세스가 있다라는 얘기는 102개의 프로그램이 실행중인 소리. 
		
		컴퓨터에 실행중인 프로세스 확인하는 법 
		
		1. 작업관리자 실행
		
		2. 명령프롬프트창 열기  ( 윈도우 키 + 단축키 R) => cmd 입력 
		=> tasklist  입력 
		
		맥, 리눅스 -> 터미널 열어서 ps - e 
		
		프로세스 종료 - taskkill / pid[pid값]
		맥, 리눅스 - pkill - 9, -f
					   - sudo kill 프로세스 번호
					   
	 	쓰레드 - 프로세스안에서 실제 동작을 수행하는 단위 
	 				쓰레드를 추가하면 동시에 여러 개의 동작을 수행 할 수 있다. 
	 	
	 	자바 쓰레드
	 	쓰레드 생성자
	 	Thread()	:  새로운 쓰레드 객체 할당 
	 	Thread("이름") : 	새로운 쓰레드 객체를 할당 하면서 이름 부여 
	 	
*/