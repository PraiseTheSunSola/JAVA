package java0702_2;

public class jvm {
	
//	main �޼��� -> JVM (������ ��ǻŸ) �ü�� ������ ����
//	main�� �ݵ�� �־�� �ϰ� JVM�� ���� �� �� ���� ���� ����� ���� main�̴�.
	
	public static void main(String[] args) {
		
		// Ŭ�����޼��忡�� ���� Ŭ���� ������ Ŭ���� �޼��常
		// ���� - �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ����� ����
		// �̷������ ������ �ν��Ͻ������� �ν��Ͻ� �޼���� �ȵȴ�.
		
		int num = 300;
		output(num);
	//  num�� main�� ���������� ����� �ȵȴ�. 
	// output�� �Ű����� int a�� ����� output() �ȿ� num�� �־� �޾ƿ´�.

	}
	
	// �Ű����� ���� ����������� ������ ������ Ÿ���� �����ϰ� ��������Ѵ�.
 static void output(int a) {
	    System.out.println( a); 
		System.out.println("���� �޼����Դϴ�.");
	}
	
 
}



class a{
	int num=10;
	
	static void out( ) { // Ŭ���� �ż���
//			System.out.println(num);
	}
	
};



