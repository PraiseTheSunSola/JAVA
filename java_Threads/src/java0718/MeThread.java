package java0718;

public class MeThread extends Thread{
	public static int num = 10;  // 클래스 변수 
	private int time; // sleep에 적용할  시간 
	
	public MeThread(int time, String name) {
		super(name);
		this.time = time;
		
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
				System.out.println
				("쓰레드명 : " + name + " 공유num : " + num);
				
				num++;
				if( num == 17) break;
				
				try { 
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
		}
		
		// 특정 쓰레드에 의해서 클래스 변수에 값이 달라졌을 때 다른 쓰레드
		// 에도 영향을 줄 수 있다. 
		
//		while(true) {
//			System.out.println
//			("쓰레드명 : " + name + " 공유num : " + num);
//			
//			num++;
//			if(num == 15) break;
//			
//			try {
//				Thread.sleep(time);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//	}
		
		
		
		
	}
	
}
