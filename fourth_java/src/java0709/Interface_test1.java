package java0709;

class RestCustomer { // 식당에 찾아 오는 손님
	String customer; // 예약 손님
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
}

class ReservCustomerA extends RestCustomer {
	
} // 예약손님 A


class ReservCustomerB extends RestCustomer {
	
} // 예약손님 B

class Owner { // 사장
	void  food(ReservCustomerA cusA) {
		System.out.println( cusA.customer + " 청국장 준다");
		
	}
	void food(ReservCustomerB cusB) {
		System.out.println(cusB.customer + " 돈까스 준다. ");
	}
}



public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A-이순신");
		b.setCustomer("B-장보고");
		
		ow.food(a);
		ow.food(b);
	}

}
