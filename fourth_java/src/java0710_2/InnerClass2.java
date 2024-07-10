package java0710_2;


interface Runnable{
	public void run(); 
}

class BankAccount {
	
	private int balance;  // 잔액
	private static String bankName = "솔라Bank";
	
	public BankAccount(int balance) { // 생성자 메서드
			this.balance = balance;
	}
	
	public void showBalance() { // 잔액 확인 메서드 
		System.out.println( "계좌 잔액 :  " + balance);
	}
	

	
	//인스턴스 내부 클래스
	
	class Transaction { // 거래 - 입금, 출금
	     void deposit(int amount) {
	    	 balance = balance + amount;
	    	 System.out.println("입금 금액 : " + amount);
	     }
	     
	     void withdraw( int amount) {
	    	if(balance >=  amount) {
	    	 balance = balance - amount;
	    	 System.out.println("출금 금액 : " +amount);
	     } else {
					 System.out.println( "잔액 부족! 출금 불가") ;
	      }
	 }
  }// end  BankAccount
	
	
	// 정적 내부 클래스

	static class BankInfo {
			void showBankName() {
					System.out.println("은행 이름 :  " +  bankName);
			}
	}
	
	
	//  지역 내부 클래스 
	
	public void applyLoan(int amount) { // 대출 신청
		class Loan { // 지역 내부클래스 - 대출 
				void  progress() { 
						System.out.println("대출 신청 금액 : " + amount);
				}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	
	// 익명 내부 클래스 
	
	public void interrestCala() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interrestMoney = (int) (balance * 0.03);
				balance += interrestMoney;
				System.out.println("이자 지급 : " +interrestMoney);
			}
		};
		interest.run();
	}
	
} // end BankAccount





public  class InnerClass2 {

	public static void main(String[] args) { 
		// 메모리상 가장 먼저 실제로 실행되는 녀석! main! ( 준비 과정 빼고)
		
		
		BankAccount account = new BankAccount(9000000);
		account.showBalance();
		
		BankAccount.Transaction  tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		
		//정적 내부클래스 객체 생성 - 외부클래스 이용해서 만듬 
		BankAccount.BankInfo info = new BankAccount.BankInfo();
			info.showBankName();
			
			
		// 지역 내부클래스 사용 
			account.applyLoan(4000000);
			
       // 익명 내부클래스 사용
			account.interrestCala();
			
			
			
			
			
			
			
			
			
	} // end main

	
	
} // end InnerClass2


/*
		클래스 : BankAccount;
		BankAccount 내부클래스 ->
					인스턴스내부 클래스 : Transaction (거래)
					정적 내부 클래스 : BankInfo (은행정보)
					지역 내부 클래스 : Loan ( 대출)
					익명 내부 클래스 : Runnable  // 특별한게 아니면 인터페이스 변수 끝에 able을 붙인다. 
					
					  
					 
*/