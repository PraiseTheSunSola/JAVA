package java0718;

import java.util.Scanner;

public class learning_Threads {

	public static void main(String[] args) {

		MyThread th = new MyThread();	// ������ ��ü ����
		th.start();  //  ������ ���� 

		
		for(int i=1; i<=10; i++) {
			System.out.println(" 			����  Main �ֶ��"  + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	/*	
		Scanner sun = new Scanner(System.in);
		System.out.println("���� �Է� :  ");
		int num = sun.nextInt();
		System.out.println(num);
	*/
	
	// �����带 ���ؼ� �ݺ����� ����Ǹ鼭�� num�� ���ڸ� �Է��ؼ� ��� ���� 
	//  �����̶�� ��� ������ �����带 ���ؼ� �ϳ� �� ����������ν� �� ���� �۾��� �ð� ���� ���ؼ� ��� �ǰ� �ִ� ��! 	
		
		
		
		
		
		
	} // 	main
	
}		// end learning_Threads

class MyThread extends Thread{
	
	@Override  // �������̵� �Ǿ� �ֱ� ������ �޼��� �����ϸ� �ȉ�.
	public void run( ) {
		for(int i=1; i<=10; i++) {
		System.out.println("��! ������~~ �¾縸��" + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
	
	
	
	
}


/*
		���μ��� - cpu�� ���� �޸� (ram)�� �ε� �Ǿ��ִ� ���α׷��� ���Ѵ�. 
		
		��, �������� ���α׷����� ���μ����̴�. 
		102���� ���μ����� �ִٶ�� ���� 102���� ���α׷��� �������� �Ҹ�. 
		
		��ǻ�Ϳ� �������� ���μ��� Ȯ���ϴ� �� 
		
		1. �۾������� ����
		
		2. ���������Ʈâ ����  ( ������ Ű + ����Ű R) => cmd �Է� 
		=> tasklist  �Է� 
		
		��, ������ -> �͹̳� ��� ps - e 
		
		���μ��� ���� - taskkill / pid[pid��]
		��, ������ - pkill - 9, -f
					   - sudo kill ���μ��� ��ȣ
					   
	 	������ - ���μ����ȿ��� ���� ������ �����ϴ� ���� 
	 				�����带 �߰��ϸ� ���ÿ� ���� ���� ������ ���� �� �� �ִ�. 
	 	������� ���� ��� -> �غ� -> �������� �̷�� ����. 
	 	
	 	�ڹ� ������
	 	������ ������
	 	Thread()	:  ���ο� ������ ��ü �Ҵ� 
	 	Thread("�̸�") : 	���ο� ������ ��ü�� �Ҵ� �ϸ鼭 �̸� �ο� 
	 	
void run( ) 
�������� �����ڵ尡 �ۼ��Ǵ� �޼ҵ�� 
����ڴ� run() �޼ҵ带 �������̵� �Ͽ� ����ؾ� �մϴ�.

void start( ) 
: �����尡 ���۵ǵ��� ��û�ϴ� �޼ҵ�� 
JVM�� �ش� �������� run() �޼ҵ带 ȣ���մϴ�. 

void interrupt( ) : �����带 ���� ��ŵ�ϴ�. 

void join( ) : �� �����尡 ���������� ��ٸ��ϴ�. 

void join(long millis) 
: �ִ� millis �ð����� �� �����尡 ���������� ��ٸ��ϴ�.

static void sleep(long millis) 
: millis �ð����� ���� �����带 �Ͻ�������ŵ�ϴ�. 

static void yield( ) : ���� �������� ����ð��� �ٸ� �����忡�� �纸�մϴ�.
 
static Thread currentThread( ) 
: ���� �������� ������ ��ü�� �������� ��ȯ�մϴ�. 

long getId( ) : �������� Id�� ��ȯ�մϴ�. 

String getName( ) : �������� �̸��� ��ȯ�մϴ�. 

int getPriority( ) 
: �������� �켱���� ���� ��ȯ�մϴ�. (�켱���� ���� : 1 ~ 10)

Thread.State getState( ) : �������� state ���� ��ȯ�մϴ�.

ThreadGroup getThreadGroup( ) 
: �����尡 ���� ������ �׷��� ��ȯ�մϴ�. 

static boolean interrupted( ) 
: ���� �������� interrupted ���θ� ��ȯ�մϴ�. 

boolean isInterrupted( ) 
: �� �������� interrupted ���θ� ��ȯ�մϴ�. 

boolean isAlive( ) : �� �����尡 ����ִ��� ���θ� ��ȯ�մϴ�. 

boolean isDaemon( ) : �� �����尡 ���� ���������� ���θ� ��ȯ�մϴ�. 

void setDaemon(boolean on) : �� �����带 ���� ������� �����մϴ�. 
 
void setName(String name) 
: �� �������� �̸��� name���� �����մϴ�. 

void setPriority(int newPriority) 
: �� �������� �켱������ newPriority�� �����մϴ�. 

String toString( ) 
: �� �������� �̸�, �켱����, ������׷���� ������ ���� ���ڿ��� ��ȯ�մϴ�. 
	 	
*/