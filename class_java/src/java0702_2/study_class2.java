package java0702_2;

public class study_class2 {

	public static void main(String[] args) {
		// static�� �����ڷμ� ��������� �ñ⸦ �������ش�?  (��������) = (���� �޼���)
		// static void = Ŭ���� �޼��� 
		
		//Car car1 = new Car(); 
		// ���� ���������� ���� �� �����ؾ� ��μ� �޸𸮿� �Ҵ�ȴ�. �� ������ �������� ����.
		
//		System.out.println(Car.������);
		
		
		Car car1;
		
		
		car1 = new Car(); // carName, ��ⷮ, ���� ���� ����
		car1.carName = "�Ÿ";
		car1.���� = "�ֹ���";
		car1.������ = "���";
//		System.out.println(Car.������);
		
		Car car2 = new Car("�׷���", 3000,"�ֹ���");
		// ���� ���������� �����ϴ��� �޸𸮿� �Ҵ���� �ʾұ� ������ ����� �� ����. 
		
		
		/*
			������ : �̸�, 	����Ʈ, 		����
						��ǿ�,	 4580, 	4.3
						�����,	 3485, 	4.1
						�����,	 90930, 	2.7
						������,	 19200, 	3.1
		
		���Ҽ� �۰����� ������ ������, �Ҽ� ��Ƚ���� ���� ����Ʈ�����̴�.
		�� ������ ���� �� �� �ִ� Ŭ������ �����ϰ� ������ �Է� �� ����ϼ���.
		( �Ű����� �ִ� ������ �޼���� �� �� �̻� ����)
		
		
		*/
		
		Novel review0 = new Novel(); 
		// �����ε��� �޼��尡 ������ �̷����� ������ ����, �̷��� �ϰ� ������ 
		// �ƹ��͵� ���� ���� �޼��嵵 �ϳ� ����� �����.
		
		Novel review1 = new Novel("��ǿ�",4580,4.3f);
		Novel review2 = new Novel("�����",3485,4.1f);
		Novel review3 = new Novel("�����",90930,2.7f);
		Novel review4 = new Novel("������",19200,3.1f);
		
//		System.out.println(review1.name);
//		System.out.println(review1.point);
//		System.out.println(review1.rating);
//		
//		System.out.println(review2.name);
//		System.out.println(review2.point);
//		System.out.println(review2.rating);
//		
//		System.out.println(review3.name);
//		System.out.println(review3.point);
//		System.out.println(review3.rating);
//		
//		System.out.println(review4.name);
//		System.out.println(review4.point);
//		System.out.println(review4.rating);
//		
//		System.out.println(review4);
		
		
		


	}

}



class Novel {
	String name;
	int point;
	float rating;
	
	Novel() {
		
	};
	
	
	Novel(String Name){
		
		this.name = Name;
	};
	
	
	Novel(String Name, int Point, float Rating){
		this.name = Name;
		this.point = Point;
		this.rating = Rating;
	};
	
	
	public String toString( ) { // �̰� ���п� System.out.println(review4);  ��� ����
		return name+ " " + point +"�� " + rating;
	}
};







// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �� ������ �ִ�. 
// Ŭ���� ����, �ν��Ͻ�	���� 

class Car{ // Ŭ���� = ��ü 
static String ������ = "����"; 	// Ŭ���� ���� (���� �ڿ�)
	
	String carName; // �ν��Ͻ� ����
	int ��ⷮ; 	//	�ν��Ͻ� ����
	String ����; 	//	�ν��Ͻ� ���� 
	
	/*
	 * ���� ����� new ������ �ȿ��� �ν��Ͻ��� �����ϱ� ������ Ŭ���� ������ ������� 
	 * ���Ե��� �ʴ´�.  �ٸ� new��  ���� ����� �������� �����Ѵ�.
	 * �ν��Ͻ������� Ŭ���� ��ü ������ �޸𸮰� �Ҵ�ȴ�. (new �����ڸ� ����)
	 * Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
	 * Ŭ���� ������ ���α׷� ������ �� �޸𸮿� �ε��ϸ鼭 �����ȴ�.
	 * Ŭ���� ������ ������ �����ϳ� �����ҽ� Ŭ���� �ȿ� �ٸ� �ν��Ͻ����� ���۵鵵 ������ �� �� �ִ�. 
	 * �׷��Ƿ� Ŭ���� ������ ������ �����ؾ��Ѵ�. �ٲٷ��� ����ȭ �۾��� �ؾ��Ѵ�.
	 * �ַ� ���� ���°� �ν��Ͻ� �����̴�.
	 */
	
	
	// ������ �޼��� - ��ü(�ν��Ͻ�) ������ �����Ҷ� ���� �ʱ�ȭ ���ִ� �޼���
	// ������ �޼��� - return�� �������� �ʴ´�.
	// return�� �ϸ� �ȵǴ� ����: �����ڸ޼��忡�� return Ÿ�� ������ �ȵǱ� ������
	// ��ü���� ����� Ư¡. ���� �̸��� �Լ��� ����°� �����ϴ�. (���� Car �̸��� �����Լ��� 3����) = overloading
	// �����ε� <-> �������̵� 
	// �����ε� - �����ε� ���� ����
	//	1. ���� Ŭ���������� �����ϴ�. ���� �̸��� Ŭ���� ���ο����� �����ϴ�. �ۿ��� �Ұ���
	//	2. �޼����� �̸��� ���ƾ� �Ѵ�.
	//	3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�. 
	// 	4. �Ű������� ������ �޶�� �Ѵ�. 
	
	
	
	Car( ){
		// �����ڸ޼����� ���� - �ν��Ͻ� ������ �ʱⰪ ����
		
		���� = "�ֹ���";  
		// �⺻ null���� "�ֹ���"��� �ʱⰪ�� ������ ��. 
		// new �����ڿ� ���� ��ü ������ ���ắ���� �ֹ��� ����ȴ�.
	};
	
	// �Ű������� �ִ� ������ �޼���
	
	Car(String ����) {
		this.���� = ����;
	}
	
	Car( String carName, int cc , String fuel){
			this.carName = carName;
			��ⷮ = cc;
			this.���� = fuel;
	}
	
};



// �ڹ� �޼��� 

// ��ȯŸ�� �޼��� �̸�(�Ű�����) {	}

// ��ȯŸ�� - int, short, float, double, char, boolean
//				void, String
//				�޼����� return ������ Ÿ��
// 		return 10; 	-> ��ȯŸ�� int, short, long
//	return income;  ->  income  ������ Ÿ���� ��ȯŸ������

//	void Ÿ���� 	��ȯ���� ���ٶ�� �ǹ�

/*
 				�ֹε�Ϲ�ȣ�� �������� �������� ����
 				String gender(	String jumin) {
 				
 					String gen = jumin.substring( 7, 8);
 					if( gen. equals("1") || gen.equals("3") ) {
 							return "����";
 					} else if( gen.equals("2") || gen.equals("4) ) {
 							return	"����";
 					}
 					return "ȥ��";
 				}
 
 
 
 */























