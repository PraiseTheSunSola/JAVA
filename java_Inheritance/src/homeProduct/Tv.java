package homeProduct;

public class Tv  extends House{
//					(�ڽ�)				(�θ�)
	
	private int channel = 10;	// ä��
	private int vol = 5; 	// �Ҹ� 
	
	
	// �� ������ ���� Ŭ�� -> �ҽ� ->  ���׷���Ʈ ���� ���� Ŭ�� 
	// �����ϰ��� �ϴ� ���� Ŭ�� �ϰ� �Ʒ� Ŭ�� �ϸ� �ѹ��� ������� 

	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	protected  Tv() {
	super(); // �� �ȿ� �������. ����� �޾Ҵٸ� super() = House (); �θ� ����.
	}
	
	// �Ű����� �ִ� ������ �޼��� 
	public Tv (String brand, int price) {
		super(brand, price);  // �θ�Ŭ���� �����ڸ޼��� ȣ��
		// �ٸ� �� ��� �θ��ʿ��� �Ű������� �ִ� ������ �޼��带 �������Ѵ�.
	}
	
	public void channerlUp() {
		this.channel++;
		
		//return�� �ʿ���°� Ƽ���� �ϳ��� Ŭ���� �ȿ��� �̷������ �����̶� �ڱⲨ �ڱⰡ �����ϴ°Ŷ� 
	}
	
	public void channerlDown() {
		this.channel--;
	}
	
	@Override
	public void power() {
		super.onOff = !super.onOff;
		System.out.println("TV ���� : " + super.onOff );
	}
	
	
	// �����ε� - ���ο� �޼��带 �����ϴ�  ��
	// ���� ���̵��� ������ �޼��带 �������ϴ� �� 
	
	
	// @Override�� ��ǻ�Ϳ��� �� �޼��带 ���� ���̵� �ϰ� �ִٰ� �������ִ� ��   
	// ������ �ٷ� �� �ϳ���. ����� �� ����� ���� �� �Ʒ� �پ����.
	
	// ���� ���̵� ����
	// �θ� Ŭ������ �ش� �޼��尡 �����ؾ��Ѵ�.
	// �������̵� �޼���� �ݵ�� ��ȯŸ��, �޼��� �̸�, �Ű����� ��� �Ȱ��� �ۼ��ؾ��Ѵ�. 
	// �޼����� { } ������ �޶� �ȴ�.  �ڽ� Ŭ������ ������ ���ٸ� �θ���� �����Ѵ�. 
	// ��µǴ°� �ڽ� Ŭ������ �޼����̰� �ٽ��̴�. 
	
}// end


// ��ӻ����� �Ű������� �ִ� ������ �޼��带 �ڵ��� �� 
// �θ��ʿ� ������ �ǵ��� super(); �� ����Ѵ�. 