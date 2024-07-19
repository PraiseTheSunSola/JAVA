package java0719;

import java.lang.Thread.State;

public class learning_Threads6 {

	private static Thread thread;
	private static  Thread stateThread;
	
	public static void main(String[] args) {
		
		stateThread = new Thread(() -> {  // 익명 클래스 객체 생성
			while(true) {
			State state = thread.getState(); // 쓰레드객체의 상태
			System.out.println(thread.getName()+
					" -  쓰레드...  상태 :  "  + state);
			if(state == State.NEW) {
				 System.out.println(" 쓰레드 실행 준비 단계");
				 thread.start();
				 }
			if( state == State.WAITING) {
				 System.out.println("쓰레드 대기 단계");
				 thread.interrupt();
				 
				 // .interrupt();  대기 -> 실행 / 실행 -> 대기로 해주는 메서드 
				 // .join(); 에 의해 대기가 되도 .interrupt();를 사용하면
				 // 실행이 됨. 
			}
			if( state == State.TERMINATED) {
				System.out.println(thread.getName() +
						" - 쓰레드... 상태 :  "  +state);
				break;  // terminated 상태라면 쓰레드가 종료된 상태이다. 
			}
			
//			try {
//				Thread.sleep(500);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
		
		});
		
		thread = new My(" 쓰레드 1번", stateThread);
		stateThread.start();
		
		
		
	}

}
