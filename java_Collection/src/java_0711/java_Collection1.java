/*		�ڹ� �÷��� �����ӿ�ũ
  
  		�����͸� ����,�����ϱ����� �ڷᱸ�� ��
  		�����͸� ����ó���ϴ� �˰����� �����Ǿ��ִ� 
  		Ŭ�������� ����ü 
  		
  		�� Ŭ�������� ����, Ư¡, ��Ȱ���� �� �ľ�����!
  		
  		Collection, Map interface
  		
  		Collection interface
  		- List interface
  		{
  		 *���� interface�� �����ϱ� ������ ����ϴ� �޼��嵵 ����*
  		 
  			ArrayList Ŭ���� 
  			vector
  			LinkedList( �� �������� ����, �迭�� ������ ������)
  			Stack
  			Queue
  		}
  			
  		- Set interface 
  		{
  			HashSet (�����͵��� �׷�ȭ �������� ����)
  			TreeSet ( �˻� �� ���� Ưȭ)
  			LinekdHashSet
  		}	
  	Map interface
  	{
  			-HashMap (�����͵��� �׷�ȭ �������� ����)
  			-TreeMap ( �˻� �� ���� Ưȭ)
  			-LinkedHashMap
  	}		
  			
  			
  			
 */


package java_0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class java_Collection1 {

	public static void main(String[] args) {
		
		
		
		//ArrayList�� ���� �迭�̰� ó�� ���� �� �迭�� ������ ������ �ʾƵ� �ȴ�. 
	/*
		ArrayList list1 = new ArrayList();
		
		list1.add(89);
		list1.add(230);
		list1.add(5252);
		list1.add(45.78);  // �Ǽ��� ������ ������. 
		list1.add("�ֶ�"); // ���ڿ��� ������.
		System.out.println(list1);
	*/	
		// Ÿ�������� ����� �ϴµ� ����� �Ǵ� ������ �ֻ��� Ŭ������ ������Ʈ�� �ν��ϰ� �������� ���� �۵��ȴ�. 
		// �׷��Ƿ� Ÿ���� ����������Ѵ�. 
		
		
		

		ArrayList<Integer> list1 = new ArrayList<Integer>();  // < >  �ȿ��� �ݵ�� Ŭ����Ÿ�Ը� �����Ѵ�. int (X)
		
		/* 	Ŭ���� Ÿ�� ���
				
				Byte - byte
				Short - short
				Integer - int ( ��Ʈ���̶�°� ����ؾ߸� ����� �� ����)
				Long - long
				Float - float
				Double - double
				Character - char
				Boolean - boolean
		*/
		
		
		list1.add(89);
		list1.add(230);
		list1.add(5252);
		list1.add(3434);
		list1.add(2);
		
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		
		 // �迭������ Ŭ���� ����̱� ������  .length�� �ƴ� .size(); ��  ����Ѵ�. 
		
		for( int i=0; i<list1.size(); i++) {
			
			// Ŭ���� ����̱� ������ ���� �޼��带 ����Ѵ�. 
			
				System.out.println( list1.get(i));
		}
		
		System.out.println( list1.indexOf(232));  // ã���� �ϴ� �ε����� �迭 �ȿ� ���ٸ� -1�� ��µȴ�.
		System.out.println( list1.contains(3434)); 
			
//			list1.remove(230);  
			// remove ()�� �迭 �� Ư�� �ε��� ����
//			System.out.println(list1);
			
		System.out.println( list1.isEmpty()); 	//  ���ڿ� ����ִ��� Ȯ�� ������� �ʴٸ� false ��� 
			
		list1.add(1,450);  // (index number / data);  �߰��ϰ� ���� �ε��� �ڸ� �ѹ� / �� �� �Է��ϸ� �ش� �ε��� �ѹ��� ���� �߰�
		System.out.println(list1);
		System.out.println(list1.lastIndexOf(230));
		
		list1.forEach(n -> System.out.println(n));
		
		/*
		 for(Integer n : list1) {
		   System.out.println(n);  
		   
		   =
		   
		   list1.forEach(n -> System.out.println(n)); ���� 
		 */
		
		list1.set( 3, 15);
		System.out.println( list1);
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = 
								new ArrayList<Integer>(Arrays.asList(aa)); 	// ���� �迭�� ��ȭ 
		
		Collections.sort(list1); 	// �ε��� ������ ���� ���� �������� ���� ���� ���ں��� ū ���ڷ�  
		System.out.println(list1);
		
		
		list1.remove(Integer.valueOf(89));  // �迭 �ȿ� ����ִ� Ư�� �ε��� �� ���� 
		System.out.println( list1);
		
		
		//  ���� 
		// ������, �念��, �̼���, ������, ������, ����ȣ
		// �� �̸��� ArrayList�� �����ϰ� ����ϼ���. 
		
		ArrayList<String> greatMan = new ArrayList<>();   // ���ʿ� ������Ÿ���� ���� ������ �ڿ��� <>�� ����ص� �ȴ�. 
		
		greatMan.add("������");
		greatMan.add("�念��");
		greatMan.add("�̼���");
		greatMan.add("������");
		greatMan.add("������");
		greatMan.add("����ȣ");
	
		System.out.println(greatMan);
		
		ArrayList<String> greatMan2 = 
				new ArrayList<>(
						Arrays.asList(
								new String[] {
			"������", "�念��", "�̼���", "������", "������", "����ȣ"
								})
						);
		
		for( String greatMan3 : greatMan2 ) {
			System.out.println(greatMan3);
		}
		
		greatMan2.forEach(greatMan3 -> System.out.println(greatMan3)); 
		// greatMan2�� ���� greatMan3�� �����ϰ� greatMan3�� ��� 
		
		
		
	// �̸��� ����Ǿ��ִ� ArrayListe�� �̼����� ������ �߰������ϰ� 
	// ������ �������� �ʱ�. 
		
		if (!greatMan.contains("�̼���") ) {
			greatMan.add("�̼���");
		}
		System.out.println(greatMan);
		
	}	// end main

} // end java_Collection1
