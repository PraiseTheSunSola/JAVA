package java0717_3;

public class ShoppingMall {

	public static void main(String[] args) {
		
		Electronics elec =
				new Electronics("E12001", "�����", 1702000, "�Ｚ");
		
		Clothing clt = 
				new Clothing("C12032", "����", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart( elec,3);
		shop.addCart(clt, 2);
		
		shop.showCart();
		
	}

}

/*
		���θ� ����Ʈ �����Ƿڰ� ���Դ�.
		�Ƿ����� ������ ������ �䱸�ߴ�.
		
		���θ��� ���� ������ ��ǰ�� �Ǹ��Ѵ�. (������ǰ, �Ƿ� ��)
		�� ��ǰ�� ������ ID�� �̸�, ������ ������ �ֽ��ϴ�. 
		���� ���� ��ǰ�� ��ٱ��Ͽ� �߰��ϰ� �ֹ��� �� �� �ֽ��ϴ�. 
		�ý����� �پ��� ��ǰ Ÿ���� ó���� �� �ֵ��� �����ؾ��մϴ�. 


*/