package java0712;

import java_0711.Member;

// �� ���� ���� �ڵ�� �������� ���� �߰��� �� ��.  ��Ʈ�� equals �ʿ���. 

public class Asset 
{
	private String bank;
	private int balance;
	private String accountNum;
	private String holder;
	
	
	public Asset(String bank, int balance, String accountNum,   String holder)
	{
		this.bank = bank;
		this.balance = balance;
		this.accountNum = accountNum;
		this.holder = holder;
		
	}
	
	@Override 
	public String toString () 
	{
		return bank+ "(" + accountNum+ "), " +balance+","+holder ;
	}
	
	@Override 
	public boolean equals(Object  o)  // �񱳰� �ʿ��� ��� Ŭ���� �ȿ� equals �޼��带 ����� ��� �Ѵ�.
	{
		
		Asset tmp = (Asset) o;
		
		boolean  isSame = this.bank.equals(tmp.bank);
		if(isSame)  {
			isSame = this.holder.equals(tmp.holder);
		}
		return isSame;
		
		
	}
	
	
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	
	
} // end Asset
