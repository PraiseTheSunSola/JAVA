package java0718_3;

public class BankTh  implements Runnable{
	// �ϳ��� ��ü�� �������� ��ü ���� ���� =>  Runnable ����ؼ�!
	
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getMyMoney() > 0) {
			// ��ݱݾ�
			int money = (int)( (Math.random()*3) +1 )*1000;
			if(my.windhdraw(money)) {
				 System.out.println
				 (Thread.currentThread().getName()
						 + " -> ��� :  " +money+", �ܾ� : "
						 +my.getMyMoney());
			}else { // ��� ���� - �ܾ׺���
					System.out.println("��� �ź� - �ܾ׺���");
			}
			
		}
		
	}
	
	
	
	
	
	
}
