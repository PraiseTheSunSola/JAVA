package java0718_3;

public class Sync {

	public static void main(String[] args) {
		
		BankTh thread = new BankTh();
		
		Thread th1 = new Thread(thread);
		Thread th2 = new Thread(thread);
		th1.setName("솔라    ");
		th2.setName("  			아르토리우스");
		
		th1.start();
		th2.start();
		
		
	}

}
