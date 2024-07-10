package java0710;

/*
  		�������̽��� ����� ��쿣 Ŭ������ 
  		�������̽��� Ŭ������ �����ؼ� ����� �� �ִ�. 
  		���߻�ӵ� ����  ( ���� ����)
  		
  		1.�������̽�
  		
  		1. ���� ����
  			Ŭ������ �������� �������̽��� �����Ͽ� ���� �� �� �ִ�.
  			
  		2. 	������
  		
  		Ŭ������ �ʿ��� �������̽��� �����Ͽ� ���� �� �� �̴�.
  		
  		3. ���� ����
  		Ŭ������ �ʿ��� �� �������̽��� ���� �ϸ� �ǹǷ� ��Ӱ����϶�����
  		�������� ��������. (��Ӻ��� ������ ����)
  		
  		
   */

interface bird {
	public void fly();
}


interface Animal1 {
		static int a = 10;
		final int b = 10;
		static void mee() {
			
		}
		public void sound(); 		// �߻� �޼��� 
}

class Dog1 implements Animal1{
	
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat1  implements Animal1{
	
	@Override
	public void sound() {
		System.out.println("�ɳ�");
	}		
}

class Pigeon1  implements Animal1, bird{
	
	@Override
	public void sound() {
		System.out.println("����");
	}
		@Override
		public void fly() {
			System.out.println("���忡 ���� ����̿��� ���̳״�!");
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
