package java0718;

public class learning_Threads3 {

	public static void main(String[] args) {
		
		MeThread th1 = new MeThread(2000, "��õ");
		MeThread th2 = new MeThread(3000, "��õ");
		
		
		// ���������� ������ ���� 
		
		th1.start();
		
		 //  .join ���Ŀ� ���� �� �����带 ��� ���·� ���� th1. ���� ������
		try {
			th1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		th2.start();
		
		
		
		
		
//		while(true) {
//			System.out.print("");
//			int num = MeThread.num;
//			if(num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}
		
		
		
		
	}

}


/*		�������� �޼��� ��� 
 
 	   sleep(�и�������) - ������ �ð� ��ŭ ���
 	   
 	   start() - ������ ����, run �޼��� ȣ��
 	   
 	   join() - �ش� �����尡 ���������� ���� ������ ���
 	   
 	   run() �����带 �����ϴ� �޼���
 	   
 	   stop() - �����带 �ߴ���. ( ����� �������� ����)
 	   
 	   interrupt() - ������ �ߴ�
 	   
 	   setPriority(������) - �������� �켱���� 
 	   									=> �������� ������ �ϼ��� �켱���� UP!
 	   
 	   getPriority() - ������ ������ �켱������
 	   
 	   isAlive() - ���� �����尡 ����ִٸ� true, 
 	   						����Ǿ����� false
 	   
 	   suspend() - �����带 �Ͻ����� ��Ų��.  ( ����� �������� ����)
 	   
 	   resume() - �Ͻ������� �����带 ���� (����� �������� ����)
 	   
 	   yield() - �ٸ� �����忡�� ���� ���¸� �纸�ϰ� ��� 
 	   
 	   notify() - ��� ���¿� �ִ� �����带 ���� ���� ��ȯ
 	   						�����⿡ �ִ� ������� ���� ���·� ��ȯ�ȴ�. 
 
 
 
 
 
 
*/