package java0718_2;

public class learning_Threads4 {

	public static void main(String[] args) {
		
		
		web th1 = new web("ù°");
		web th2 = new web("  	��°");
		web th3 = new web("    		��°");
		web th4  = new web("   			��°");	
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.MAX_PRIORITY);
		
		// ����Ǵ� ������ Max - NORM - MIN
		
		// �켱������ ������������ ����� ����� �������� �ʴ´�. 
		// Ȯ���� �� ������ ������ �ü�� ȯ�濡 ���� �ٸ���. 
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
