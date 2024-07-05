package homeProduct;

public class Aircon  extends House{

	static  final String[] windText = {"미", "약", "강"}; // final은 변경되지 않게 하는 기능
	
	
	int wind = 0;	 // 바람세기 
	int temperature;
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand, price);
	}
	
	void tempUP() {
		this.temperature++;
	}
	
	void widControl () {
		
		wind++;
		
		if (wind == windText.length) wind= 0;
		System.out.println("현재 바람세기 : " + windText[wind]);
	}
		
// 인스턴스 변수들을 가지고 식을 만들 때 최대한 데이터의 영향에 받지 않도록 식을 짜야한다. (데이터는 값을 의미)
	
	@Override
	void power() {
		super.onOff = !super.onOff;
		System.out.println("에어컨 전원 : "  + super.onOff);
	}
	
	
	
}// end
