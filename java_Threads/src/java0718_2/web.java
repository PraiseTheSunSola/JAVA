package java0718_2;

public class web  extends Thread{

	
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			System.out.println( name + " ������ ����");
			
			
			
			System.out.println( name + " ������ ����");
		}
}
