package java0709;

class RestCustomer { // �Ĵ翡 ã�� ���� �մ�
	String customer; // ���� �մ�
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
}

class ReservCustomerA extends RestCustomer {
	
} // ����մ� A


class ReservCustomerB extends RestCustomer {
	
} // ����մ� B

class Owner { // ����
	void  food(ReservCustomerA cusA) {
		System.out.println( cusA.customer + " û���� �ش�");
		
	}
	void food(ReservCustomerB cusB) {
		System.out.println(cusB.customer + " ��� �ش�. ");
	}
}



public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
	}

}
