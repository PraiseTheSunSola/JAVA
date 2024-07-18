package java0718_3;

public class Money extends Thread{

	
	private int myMoney = 10000;
	
	public int getMyMoney() {
		return myMoney;
	}
	 	// widhdraw 메서드를 임계영역으로 설정
	public synchronized boolean windhdraw(int money) {
		if(myMoney >= money) {
			
		// 현재 보유중인 금액보다 출금금액이 적거나 같다면 출금
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
			
				//출금
				myMoney -= money;
				return true;
		}
		return false; 	// 출금 실패 (돈부족)
	}
	
	
}

/*
 		하나의 통장으로 둘이서  출금하고 있으니 문제가 발생함. 
 		그래서 임계 영역을 설정해줌 synchronized 를 
 		windhdraw에 붙여준다. 
 		한 명씩 돌아가면서 출금 하게끔 해줌 
 		한 명이 사용중이면 다른 한 명은 블락처리 됨 
 */
