package java0718_2;

public class web  extends Thread{

	
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			System.out.println( name + " 쓰레드 시작");
			
			
			
			System.out.println( name + " 쓰레드 종료");
		}
}
