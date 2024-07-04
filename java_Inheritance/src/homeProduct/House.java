package homeProduct;

public class House {

	
	boolean onOff;
	House() {
		this.onOff = false;
	}
	
	void power() {
		this.onOff = !this.onOff;
		System.out.println(" Àü¿ø : " + this.onOff);
	}
	
	
}
