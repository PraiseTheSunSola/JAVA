package java0717;

public class Juice {

	public void makeJuice(FruitBox <? extends Fruit> box) {
		
	}
	
	
	/*
	 	아래와 같이  같은 FruitBox를 사용하고 있깅 오버로딩은 할 수 없다.

	 
	 	public void makeJuice(FruitBox <Apple> box) {
		
	}
	
	public void makeJuice(FruitBox <Banana> box) {
		
	}
	
		 	FruitBox		box와 <Apple>는 상관이 없다. 
	 	box는 FruitBox 타입이기 때문에 
	 	makeJuice(FruitBox <Fruit> box)  해도 오버로딩이 되지 않는다.
	
	
	
		public void makeJuice(FruitBox <Fruit> box) {
		
	}
	
	public void makeJuice(FruitBox <Fruit> box) {
		
	}
	
	현재 Juice 클래스는 제네릭을 사용하고 있지 않지만, 
	제네릭을 사용중인 FruitBox <Fruit> box에는 적용되지 않는다. 
	
	그래서 Juice 클래스에도 제네릭을 한번 더 사용해야한다. 
	
	public void makeJuice(FruitBox <T extends Fruit> box) {
		
	}
	
	다만 메서드에선 바로 위의 코드처럼은 타입 표현이 되질 않는다. 
	그래서 <T extends Fruit> => <?>으로 해주면 적용이 된다. 
	
	<?> = 와일드 카드라고한다.  메서드쪽에 사용하는 표현식이다. 
	
	다만 과일만 들어오기 위해 extends Fruit 라고 제한을 걸었으니 
	
	<?> 에도 제한 표시를 해줘야한다. 
	
	=> FruitBox <? extends Fruit> 이렇게. 
	
	해주지 않으면 코드 상에는 문제없지만 타입 에러나 휴먼 에러가 나중에
	 생길 수 있다. 
	
	 */
	
	
}	// end Juice
