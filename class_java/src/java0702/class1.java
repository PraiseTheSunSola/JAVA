package java0702;

public class class1 {

	public static void main(String[] args) {
		// �޼��� - ������ �Լ�
		// �Լ� - ���������� �����. 
		// Ŭ������ �빮�ڷ� ������ 
		// ���� -> �迭 -> ����ü -> Ŭ����
		// new -> �����Ҵ�
		
		
		// 	���� �� Ŭ���� Ÿ���� ������ �����Ѵ�.
		//	������ ������ �����͸� �����Ѵ�.
		//	Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ�����Ѵ�.
		// ��ü ( (�ν��Ͻ�) (�ν��Ͻ�) (�ν��Ͻ�) )  ��ü�� ū ���� 
		
		// ����� Ŭ���� �ν��Ͻ� ���� - 
		Member member1 =  new Member(); 	// �� �ȿ� String name�� int age�� ��� ����.
		Member member2 =  new Member();  // �׸��� �� ������ ����������. �����ε��ÿ� �̰� �Ұ���
		
		// new Member();  �� �ڹٿ��� ������ �޼��� ��� �Ѵ�.  	
		
		member1.name = "�̼���";
		member1.age = 23;
		
		member2.name = "������";
		member2.age = 34;
		
//		System.out.println(member1.name); 
//		System.out.println(member1.age);
		// . ������ �ߴ� ��� �� �Ķ��� ���� �������� ��� Ŭ������ �����ִٴ� �ǹ�
		
		
		
		// java - 495p , �޸�����ȭ��� - 893p
		
		Book book1 = new Book();
		Book book2 = new Book ();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		// ��ü(�ν��Ͻ�) �ϳ� �� ���� ���� �ϳ��� �־����! �׷��� �޸� �ּҰ� ������.
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram) ũ�⿡ ����
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ�
		// �� ����, ����� �ϼ���. (����Ʈ�� 3��)
		
		SmartPhone smartphone1 = new SmartPhone();
		SmartPhone smartphone2 = new SmartPhone();
		SmartPhone smartphone3 = new SmartPhone();
		
		smartphone1.name = "galaxy";
		smartphone1.os = "�ȵ���̵�";
		smartphone1.ram = 12;
		
		smartphone2.name = "iphone";
		smartphone2.os = "ios";
		smartphone2.ram = 8;
		
		smartphone3.name = "moto";
		smartphone3.os = "�ȵ���̵�";
		smartphone3.ram =  10;
		
		System.out.println(smartphone1.name);
		System.out.println(smartphone1.os);
		System.out.println(smartphone1.ram);
		
		System.out.println(smartphone2.name);
		System.out.println(smartphone2.os);
		System.out.println(smartphone2.ram);
		
		System.out.println(smartphone3.name);
		System.out.println(smartphone3.os);
		System.out.println(smartphone3.ram);
		
		
		
		
		
	}	//main

}

// å ����� �� ���������� �����ϱ� ���� Ŭ���� ���� 

class Book{
	String title;
	int page;
};


class SmartPhone {
	String name;
	String os;
	int ram;
};



// Ŭ���� - �ؾƲ, ��ü - �ؾ  ����(214p)


// Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
class Member{	// Member ��� �̸��� Ŭ���� ���� 
	
	String name; // �̸� ���� ��Ī�� �ν��Ͻ� ����
	int age; // ����
	// 	Member(); �̳༮�� ���� ���� �ִµ� �ڹ� ��ü���� ������.  
	// 	����  new Member()�� Member()�� ����.
}