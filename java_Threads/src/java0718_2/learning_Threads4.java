package java0718_2;

public class learning_Threads4 {

	public static void main(String[] args) {
		
		
		web th1 = new web("첫째");
		web th2 = new web("  	둘째");
		web th3 = new web("    		셋째");
		web th4  = new web("   			넷째");	
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.MAX_PRIORITY);
		
		// 종료되는 순서는 Max - NORM - MIN
		
		// 우선순위는 무조건적으로 예상된 결과를 가져오진 않는다. 
		// 확률을 더 높여줄 뿐이지 운영체제 환경에 따라 다르다. 
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
