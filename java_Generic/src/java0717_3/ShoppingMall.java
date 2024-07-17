package java0717_3;

public class ShoppingMall {

	public static void main(String[] args) {
		
		Electronics elec =
				new Electronics("E12001", "냉장고", 1702000, "삼성");
		
		Clothing clt = 
				new Clothing("C12032", "바지", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart( elec,3);
		shop.addCart(clt, 2);
		
		shop.showCart();
		
	}

}

/*
		쇼핑몰 사이트 제작의뢰가 들어왔다.
		의로인이 다음의 내용을 요구했다.
		
		쇼핑몰은 여러 종류의 상품을 판매한다. (전자제품, 의류 등)
		각 상품은 고유의 ID와 이름, 가격을 가지고 있습니다. 
		고객은 여러 상품을 장바구니에 추가하고 주문을 할 수 있습니다. 
		시스템은 다양한 상품 타입을 처리할 수 있도록 유연해야합니다. 


*/