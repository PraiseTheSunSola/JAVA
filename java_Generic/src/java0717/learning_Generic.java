package java0717;

import java.util.ArrayList;

public class learning_Generic {

	public static void main(String[] args) {
		
		
		
		FruitBox <Apple> appleBox = new FruitBox<>();		
		appleBox.setFruit(new Apple());
		
		FruitBox <Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(new Banana());
		
		FruitBox <Grape> GrapeBox = new FruitBox<>();
		GrapeBox.setFruit(new Grape());
		
		// 아래 코드는 제네릭을 사용하지 않았다면 강제형변환을 해야한다. 
		// 또한 형변환은 순간적으로 오버헤드를 일으키기 때문에 메모리가 출렁거릴 수 있음.
		
		Apple apple = (Apple)appleBox.getFruit();
		
		/*
		 
		 Toy는 과일이 아니므로 과일이 아니면 들어오지 못 하게 해야한다. 
		 상속을 사용하면 가능하다. 
		 fruit 클래스를 만들어서 과일만 상속을 사용하고 
		 FruitBox 클래스의 제네릭 <T> 안에 => <T extends Fruit>
		로 변경해주면 과일들만 들어올 수 있다.
		
		FruitBox<Toy> toyBox = new FruitBox<>();
		toyBox.setFruit(new Toy());
		
		*/
		
		// 아래에  <Fruit>가 들어올수 있는건 부모여서
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple() );
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		Fruit a =  new Apple();
	    			a =	new Banana();
	    			a = new Grape();
		
		/*
		A<String> a = new A<>();
		
		//	A<String> -> A클래스의 제네릭타입 T에 String으로 지정된다.
	   // 	item변수는 String item으로 사용된다. 
		
		a.item= "솔라";
		
		A<Integer> b = new A<>();
		b.item=233;
		*/
		
		
		
		
		
	} // end main

} // end learning_Generic

/*
class A <T>{  // 제네릭은 클래스 이름 뒤에 <>를 붙여서 사용한다.  제네릭 타입 선언을 두 개 혹은 세 개 했다면 반드시 메인에서도 타입 갯수를 맞춰줘야한다. 
	T item;  // item이라는 변수는 T 타입을 가지는 변수로 정의 됨. 

	T[] arr;
	
	ArrayList<T> list = new ArrayList<>();  // 이녀석은 이런 동작이 가능하게끔 설게되어 있기에 가능하다. 
	
	// T[] arr = new T[3];  => 이렇게는 사용할 수 없다.  이 시점에선 타입이 명확하지 않고 힙 메모리 여역에 들어가는 데이터들은 명확한 크기가 지정되어야 하기 때문 
	
	
	void setItem(T item) {
		this.item = item;
	}
	
} // end class A


class B {  // 제네릭을 사용하지 않는다면 아래와 같이 각 타입별 변수와 해당 생성자 메서드를 만들어줘야한다. 
		
		int item1;
		String item2;
		float item3;
		char item4;
		
		void setItem(int item) {
			this.item1 = item;
		}
		
		void setItem(String item) {
			this.item2 = item;
		}
		
		void setItem(float item) {
			this.item3 = item;
		}
		
		void setItem(char item) {
			this.item4 = item;
		}
}

*/






/*
		Generic
		
		- 클래스
		
		- 클래스 내부의 타입을 지정하는 방법
		클래스를 여러개 만들거나 클래스 내부에 여러개의 타입이 있는 경우 제네릭을 사용한다. 
		제네릭을 사용하면 메서드이든 생성자 매개변수이든 특정 하나만으로 제어 할 수 있게 해주는게 가능하다 
		
		제네릭을 사용하지 않는다면 각 타입 별 모든 변수를 일일이 만들어 줘야한다. 
		
		제네릭 타입 표현 
		
		T -> type
		E -> element
		K -> key
		V -> value
		N -> number
		
		-클래스에 제네릭 표현 방법
		class A<T>
		
		-제네릭 타입은 클래스 타입만 지정할 수 있다.
		A<Tea> a = new A<Tea> ();
		
		-제한없이 '클래스'라면 모두 가능하다.
		
		-제네릭타입으로 사용 가능한 클래스 제한을 두는 방법 (한정적 사용)
		class A< T extends Parent>
		
		=> Parent 클래스의 자식 클래스와 Parent클래스만
		제네릭으로 타입 지정이 가능하다.
		
		이외 다른 클래스들은 불가
		
		=> 다중 타입으로 제한을 설정할 수있다.
		인터페이스만 다중 타입 설정 가능! 
		클래스는 안됨
		
		- 제네릭 와일드 카드 <?>  
		(카드 게임에서 어떤 용도로도 쓰일 수 있는 비장의 카드를 이르는 말이다.)
		
		- 제네릭 타입의 한계를 보완 하기 위해 사용하는 방법
		- 메서드의 매개변수타입으로 제네릭 타입 표현되는 클래스를 사용한다면
		  클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에 
		  (표현되지 않는 이유 : ( 클래스가 달라서) => 메모리 위치가 다르기 때문에 )
		  다시 한번 제네릭 지정 해야한다. 
		  
		  이때 사용되는 예외 없이 허용한다라고 해서 ? 로 표현 
		  
		  -와일드 카드의 제한 
		  
		  <? extends T> : T 클래스와 그 자식까지 가능
		  <? super T> : T클래스와 그 조상까지 가능( 자식은 안됨!)
		
*/