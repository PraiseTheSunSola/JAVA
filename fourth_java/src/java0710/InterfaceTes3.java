package java0710;

abstract class Unit {
		int hp; 

}		
interface Repairable {
	public void repair();

}


class Marine extends Unit { // ���̿���
	Marine() { super.hp = 50;}
	
}

class Dropship extends Unit implements Repairable{ // ��ī��
	Dropship () {super.hp = 100; }
	
	@Override
	public void repair() {System.out.println("scv�� ���� ");}
}

class Tank extends Unit implements Repairable{ // ��ī��
	Tank () {super.hp = 150; }
	
	@Override
	public void repair() {System.out.println("scv�� ���� ");}
}


public class InterfaceTes3 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Dropship d = new Dropship();
		Tank t = new Tank();
		
		m.hp -= 10; 	// hp -> 40 
		d.hp -= 20;	// hp -> 80
		t.hp -= 50;	// hp -> 100 
		d.repair();
		t.repair();

	}

}