package homeProduct;

public abstract class House {

	
	protected boolean onOff;
	protected String brand;	 // ��ǰ �귣��� 
	protected int price;  	// ��ǰ ���Ű���
	
	protected House() {
		this.onOff = false;
	}
	
	protected House(String brand, int price){
		this.brand = brand;
		this.price=price;
	}
	
	
//	void power() {
//		this.onOff = !this.onOff;
//		System.out.println(" ���� : " + this.onOff);
//	}
	
	// �������̵��� �ڽ� Ŭ������ ����ϴ� �θ�� ������ ��ǻ� �ʿ����. ���� �Ʒ�ó�� �ٲ��� �� �ִ�.
	
	abstract void power(); // �߻� �޼��� 
	
	// �߻� �޼���ȭ�� �Ѵٸ� �ݵ�� �ش� Ŭ������ �߻�ȭ �������! ( public abstract class House) ó�� 
	// �߻�Ŭ������ ��ü ���� �Ұ�
	// �߻� �޼��带 ������ �ִ� Ŭ������ �ݵ�� �߻�Ŭ������ �Ǿ�� �Ѵ�. 
	//  new �����ڴ� ��ü�� ����� ���� �޸� ����� �Ի��ؼ� �ü������ ��û�ϰ� ���� �޾ƿ� �����
	// �߻�Ŭ������ ��ü�� ������ �� �ϴ� ������ new �����ڰ� ����� �ؾ��ϴµ� 
	// �ڽ� Ŭ������ �����÷� ũ�Ⱑ �޶����� ��Ȯ�� �޸� ���� ��û�� �� ���� ������ ���� �� ����.
	// �θ�Ŭ������ �߻�Ŭ������� �ݵ�� �ڽ�Ŭ������ �߻�޼��带 �����ؾ��Ѵ�.
	// �θ��� �߻�޼��带 ������ ���� ��������� �ڽ�Ŭ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
	
}
