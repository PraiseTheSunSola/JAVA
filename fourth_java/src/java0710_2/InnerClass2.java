package java0710_2;


interface Runnable{
	public void run(); 
}

class BankAccount {
	
	private int balance;  // �ܾ�
	private static String bankName = "�ֶ�Bank";
	
	public BankAccount(int balance) { // ������ �޼���
			this.balance = balance;
	}
	
	public void showBalance() { // �ܾ� Ȯ�� �޼��� 
		System.out.println( "���� �ܾ� :  " + balance);
	}
	

	
	//�ν��Ͻ� ���� Ŭ����
	
	class Transaction { // �ŷ� - �Ա�, ���
	     void deposit(int amount) {
	    	 balance = balance + amount;
	    	 System.out.println("�Ա� �ݾ� : " + amount);
	     }
	     
	     void withdraw( int amount) {
	    	if(balance >=  amount) {
	    	 balance = balance - amount;
	    	 System.out.println("��� �ݾ� : " +amount);
	     } else {
					 System.out.println( "�ܾ� ����! ��� �Ұ�") ;
	      }
	 }
  }// end  BankAccount
	
	
	// ���� ���� Ŭ����

	static class BankInfo {
			void showBankName() {
					System.out.println("���� �̸� :  " +  bankName);
			}
	}
	
	
	//  ���� ���� Ŭ���� 
	
	public void applyLoan(int amount) { // ���� ��û
		class Loan { // ���� ����Ŭ���� - ���� 
				void  progress() { 
						System.out.println("���� ��û �ݾ� : " + amount);
				}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	
	// �͸� ���� Ŭ���� 
	
	public void interrestCala() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interrestMoney = (int) (balance * 0.03);
				balance += interrestMoney;
				System.out.println("���� ���� : " +interrestMoney);
			}
		};
		interest.run();
	}
	
} // end BankAccount





public  class InnerClass2 {

	public static void main(String[] args) { 
		// �޸𸮻� ���� ���� ������ ����Ǵ� �༮! main! ( �غ� ���� ����)
		
		
		BankAccount account = new BankAccount(9000000);
		account.showBalance();
		
		BankAccount.Transaction  tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		
		//���� ����Ŭ���� ��ü ���� - �ܺ�Ŭ���� �̿��ؼ� ���� 
		BankAccount.BankInfo info = new BankAccount.BankInfo();
			info.showBankName();
			
			
		// ���� ����Ŭ���� ��� 
			account.applyLoan(4000000);
			
       // �͸� ����Ŭ���� ���
			account.interrestCala();
			
			
			
			
			
			
			
			
			
	} // end main

	
	
} // end InnerClass2


/*
		Ŭ���� : BankAccount;
		BankAccount ����Ŭ���� ->
					�ν��Ͻ����� Ŭ���� : Transaction (�ŷ�)
					���� ���� Ŭ���� : BankInfo (��������)
					���� ���� Ŭ���� : Loan ( ����)
					�͸� ���� Ŭ���� : Runnable  // Ư���Ѱ� �ƴϸ� �������̽� ���� ���� able�� ���δ�. 
					
					  
					 
*/