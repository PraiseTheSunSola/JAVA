package homeProduct;

public class Tv  extends House{
//					(�ڽ�)				(�θ�)
	
	int channel;	// ä��
	int vol = 5; 	// �Ҹ� 
	
	
	Tv() {
		// super() �� �ȿ� �������. ����� �޾Ҵٸ� super() = House (); �θ� ����.
	}
	
	// �Ű����� �ִ� ������ �޼��� 
	Tv (String brand, int price) {
		super(brand, price);  // �θ�Ŭ���� �����ڸ޼��� ȣ��
		// �ٸ� �� ��� �θ��ʿ��� �Ű������� �ִ� ������ �޼��带 �������Ѵ�.
	}
	
	void channerlUp() {
		this.channel++;
		
		//return�� �ʿ���°� Ƽ���� �ϳ��� Ŭ���� �ȿ��� �̷������ �����̶� �ڱⲨ �ڱⰡ �����ϴ°Ŷ� 
	}
	
	void channerlDown() {
		this.channel--;
	}
	
	
	
}// end


// ��ӻ����� �Ű������� �ִ� ������ �޼��带 �ڵ��� �� 
// �θ��ʿ� ������ �ǵ��� super(); �� ����Ѵ�. 