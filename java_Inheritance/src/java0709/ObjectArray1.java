package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// ��ȭ ���� 5�� �Է� 
		
		Movie [] mv = new Movie[5];
		
		/*
		 �Ʒ��� ���� ����� ��� �����̴�. 
		 
		mv[0].setTitle("���� ����"); 
		
		�̷��� ����ϸ� ������ �߰� NullPointer ��� ������ �߸� ��ü�� ���ٴ� ��
		Null�� ���������� ������ �ִ� ��
		
		System.out.println( mv[0].getTitle());
		
		*/
		
		
		mv[0] = new Movie("���", "�ö�Ű�λ轺", 99);
		mv[1] = new Movie("����", "����", 19);
		mv[2] = new Movie("����", "���׻轺", 25);
		mv[3] = new Movie("���ֱ�", "���̸�", 50  );
		mv[4] = new Movie("����", "Ʈ����", 17);
		
		
		for( int i=0; i < mv.length; i++) {
			
			System.out.println( mv[i]); 
			// Movie Ŭ���� �ȿ� Override ���� public String toString( ) {} ���� ��� �Ǵ� ��
			
		}
		
		
		for (Movie movie : mv) { // �� ����� �ε��� ǥ���� �Ұ� 
				 System.out.println( movie); // movie�� ����
				 
		}
		
		
		
	} // end main

} // end  ObjectArray1


/*
 	�迭�� ���� TMI
 	1. ������ Ÿ�� [] [] ���ȣ�� ������ ���� �� ������ �迭�� ����ڴ� ��� �ǹ�
 	2. � Ÿ���� �迭�� ����� ������ '��������'�̴�. 
 	3. new �����ڸ� ����Ѵ�. ������Ÿ�� [] �������� = new ������Ÿ��
 	4. new�� ���Ǵ� ������ ���� ��������  <--> (�⺻ ������ Ÿ�� �迭�� �׳� ������)
 	5. ������Ÿ�� [] �������� = new ������Ÿ��[�迭ũ��];
 	
 	����
 	
 	Movie [] mv = new Movie[10];   = mv �迭 10�� ����ڴ�. 
 	��ü�� 10�� ����� �ƴ� �������� 10�� ���� �� 
 	 	�� �� �� ������ �´�(���) ��ü���� ����� �����.  
 	 	
 	 	mv[0] = new Movie();
 	 	mv[1] = new Movie();
 	 	
 	 	
 	 	
 	
 	int [] arr = new int[10];  
 	= int Ÿ���� ���� 10�� ���� (int Ÿ������ ����� ���� 10�� �ִ� �Ͱ� ���ٰ� ���� �ȴ�.)
 	arr[0] = 100;  
 	
 */
 