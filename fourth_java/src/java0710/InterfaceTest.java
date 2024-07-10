package java0710;

abstract class animal { // 부모 클래스
	
	/*
	  		상속을 통하면 부모클래스를 통해서 제어가 가능하지만
	  		부모가 가진 클래스들 전부 자식들이 무조건 상속해야하기 때문에 
	  		원하지 않는 것 까지도 강제로 수용해야하는 상황이 오기 때문에 
	  		이는 상속의 한계.
	  		또한 다중상속이 불가능 ex)  extends animal  
	  		animal   단 하나만 가능
	  		
	  		클래스 상속
	  		1. 단일상속 - 하나의 클래스만 상속 가능하다. 
	  			자식클래스는 하나의 부모클래스만 가질수 있다. 
	  			다른 클래스의 기능을 사용하려면 포함관계로 구현
	  			포함관계 예시
	  			
	  			class A{}
	  			class B{
	  					A a= new A();
	  			}
	  			자동차 - 타이어, 엔진, 창문, 에어컨, 핸들... 이 여러가지 클래스들이 
	  			자통차에 포함해야 자동차라고 할 수 있다. 
	  			
	  			자동차 - 소나타, 아반떼, 그랜저, 스포티지, 카니발
	  			이 경우엔 자동차가 부모가 되는게 맞다 
	  			
	  		2.  부모클래스의 변수와 메서드를 상속받아 사용한다.
	  			  부모클래스의 public , protected, default 제어자
	  			  	변수와 메서드만 상속된다. 
	  			  자식클래스는 부모가 상속으로 주는 모든것을 다 받아야한다. 
	  			  자식클래스 입장에선 선택지가 없다. 강제적으로 상속이다. 
	  			  
	  		3. 강한 결합
	  			  부모 클래스의 변경이 자식클래스에 영향을 준다.
	  		
	 */
	
	
//	public abstract void  fly();  
	public abstract void sound(); // 추상 메서드 
		// System.out.println("동물소리");
	
}

class dog extends animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class cat  extends animal{
	
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}







public class InterfaceTest {

	public static void main(String[] args) {
		
		animal d = new dog();
		animal c = new cat();
		
		d.sound();
		c.sound();

	}

}

/*
		동물들의 소리를 출력한다.
		개, 고양이, 닭, 비둘기, 소 등등
		각 동물은 서로 다른 개체이기 때문에  각각의 클래스로 구현
		하지만 개, 고양이 , 닭들은 동물로 통합이 가능하므로 
		animal이라는 부모 클래스를 두겠다. 

*/