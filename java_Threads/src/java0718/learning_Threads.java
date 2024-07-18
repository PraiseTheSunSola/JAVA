package java0718;

import java.util.Scanner;

public class learning_Threads {

	public static void main(String[] args) {

		MyThread th = new MyThread();	// 쓰레드 객체 생성
		th.start();  //  쓰레드 실행 

		
		for(int i=1; i<=10; i++) {
			System.out.println(" 			나는  Main 솔라야"  + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	/*	
		Scanner sun = new Scanner(System.in);
		System.out.println("숫자 입력 :  ");
		int num = sun.nextInt();
		System.out.println(num);
	*/
	
	// 쓰레드를 통해서 반복문이 진행되면서도 num에 숫자를 입력해서 출력 가능 
	//  스택이라는 출력 공간을 쓰레드를 통해서 하나 더 만들어줌으로써 두 가지 작업이 시간 차에 의해서 출력 되고 있는 것! 	
		
		
		
		
		
		
	} // 	main
	
}		// end learning_Threads

class MyThread extends Thread{
	
	@Override  // 오버라이드 되어 있기 때문에 메서드 변경하면 안됌.
	public void run( ) {
		for(int i=1; i<=10; i++) {
		System.out.println("오! 쓰레드~~ 태양만세" + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
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
	 	쓰레드는 보통 대기 -> 준비 -> 실행으로 이루어 진다. 
	 	
	 	자바 쓰레드
	 	쓰레드 생성자
	 	Thread()	:  새로운 쓰레드 객체 할당 
	 	Thread("이름") : 	새로운 쓰레드 객체를 할당 하면서 이름 부여 
	 	
void run( ) 
스레드의 실행코드가 작성되는 메소드로 
사용자는 run() 메소드를 오버라이드 하여 사용해야 합니다.

void start( ) 
: 스레드가 시작되도록 요청하는 메소드로 
JVM은 해당 스레드의 run() 메소드를 호출합니다. 

void interrupt( ) : 스레드를 중지 시킵니다. 

void join( ) : 이 스레드가 끝날때까지 기다립니다. 

void join(long millis) 
: 최대 millis 시간동안 이 스레드가 끝날때까지 기다립니다.

static void sleep(long millis) 
: millis 시간동안 현재 스레드를 일시중지시킵니다. 

static void yield( ) : 현재 스레드의 실행시간을 다른 스레드에게 양보합니다.
 
static Thread currentThread( ) 
: 현재 실행중인 스레드 객체의 참조값을 반환합니다. 

long getId( ) : 스레드의 Id를 반환합니다. 

String getName( ) : 스레드의 이름을 반환합니다. 

int getPriority( ) 
: 스레드의 우선순위 값을 반환합니다. (우선순위 범위 : 1 ~ 10)

Thread.State getState( ) : 스레드의 state 값을 반환합니다.

ThreadGroup getThreadGroup( ) 
: 스레드가 속한 스레드 그룹을 반환합니다. 

static boolean interrupted( ) 
: 현재 스레드의 interrupted 여부를 반환합니다. 

boolean isInterrupted( ) 
: 이 스레드의 interrupted 여부를 반환합니다. 

boolean isAlive( ) : 이 스레드가 살아있는지 여부를 반환합니다. 

boolean isDaemon( ) : 이 스레드가 데몬 스레드인지 여부를 반환합니다. 

void setDaemon(boolean on) : 이 스레드를 데몬 스레드로 변경합니다. 
 
void setName(String name) 
: 이 스레드의 이름을 name으로 변경합니다. 

void setPriority(int newPriority) 
: 이 스레드의 우선순위를 newPriority로 변경합니다. 

String toString( ) 
: 이 스레드의 이름, 우선순위, 스레드그룹등의 정보를 담은 문자열을 반환합니다. 
	 	
*/