package java0718_3;

public class Money extends Thread{

	
	private int myMoney = 10000;
	
	public int getMyMoney() {
		return myMoney;
	}
	 	// widhdraw �޼��带 �Ӱ迵������ ����
	public synchronized boolean windhdraw(int money) {
		if(myMoney >= money) {
			
		// ���� �������� �ݾ׺��� ��ݱݾ��� ���ų� ���ٸ� ���
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
			
				//���
				myMoney -= money;
				return true;
		}
		return false; 	// ��� ���� (������)
	}
	
	
}

/*
 		�ϳ��� �������� ���̼�  ����ϰ� ������ ������ �߻���. 
 		�׷��� �Ӱ� ������ �������� synchronized �� 
 		windhdraw�� �ٿ��ش�. 
 		�� �� ���ư��鼭 ��� �ϰԲ� ���� 
 		�� ���� ������̸� �ٸ� �� ���� ���ó�� �� 
 */
