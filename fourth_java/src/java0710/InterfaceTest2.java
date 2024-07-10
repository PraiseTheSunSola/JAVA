package java0710;

/*
  		인터페이스를 사용할 경우엔 클래스가 
  		인터페이스의 클래스를 선택해서 사용할 수 있다. 
  		다중상속도 가능  ( 다중 구현)
  		
  		1.인터페이스
  		
  		1. 다중 구현
  			클래스가 여러개의 인터페이스를 연결하여 구현 할 수 있다.
  			
  		2. 	유연성
  		
  		클래스는 필요한 인터페이스를 조합하여 구현 할 수 이다.
  		
  		3. 약한 결합
  		클래스는 필요한 인 인터페이스만 구현 하면 되므로 상속관계일때보다
  		유연성이 높아진다. (상속보다 영향이 적다)
  		
  		
   */

interface bird {
	public void fly();
}


interface Animal1 {
		static int a = 10;
		final int b = 10;
		static void mee() {
			
		}
		public void sound(); 		// 추상 메서드 
}

class Dog1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat1  implements Animal1{
	
	@Override
	public void sound() {
		System.out.println("냥냥");
	}		
}

class Pigeon1  implements Animal1, bird{
	
	@Override
	public void sound() {
		System.out.println("구구");
	}
		@Override
		public void fly() {
			System.out.println("새장에 갇힌 기분이에요 아이네님!");
		}
		
}




public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon1 p = new Pigeon1();
		
		d.sound();
		c.sound();
		p.sound();
		p.fly();

	}

}
