package java0715_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		/*
		 
		HashSet<String> hash = new HashSet<>();  // HashSet�� �Ϲ����� �迭�� �ƴ�
		
		hash.add("¥���");
		hash.add("«��");
		hash.add("���뱹��");
		hash.add("�������");
		hash.add("��������");
		hash.add("¥���");  // �ߺ��� ���� ������ ����� ������ ¥����� �� ��!
		
		System.out.println(hash);  // Hash �˰��� ���� ����Ǳ� ������ ����� ���Ƿ� ������ �˾Ƴ��⿣ �ſ� �����
		
		// -������ �����͸� �ϳ��� ������ �� �Ѵ�. (�׷����� �����̱� ����)
		
		
		hash.remove("«��");  // ��� ������ �����͸� �ϳ��� ������ ������.
		
		System.out.println(hash);
		
		// for�� ����ϸ� �ϳ��� ���� �� ����. 
		
		for( String food : hash) {
			System.out.println(food);
		} 
		
		//	�ٸ� HashSet�� ����� �� �ϳ��� ������ ����
		
		//  ArrayList, LinkedList�� ��ȯ�ؼ� �׷��� Ǯ� ������ ��� ���� �̷��� �����. �ϳ��� ����ؾ��� �� 
		ArrayList<String> list = new ArrayList<>(hash);  // ArrayList���� ������. 
		
		System.out.println(list);
		System.out.println( list.get(3)); 
		
		*/
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<> ();
		
		����.add("¥���"); ����.add("������");
		����.add("���"); ����.add("�޲ٹ̺���");
		
		���.add("��ġ������");  ���.add("������");
		���.add("¥���"); ���.add("���");
		
		// ������ - �� �� �̻��� �׷쿡 �������� ���� ����
		
		HashSet<String> ���� = new HashSet<>();
		
		// Iterator => ������ó���� ���� �÷��� �����ӿ�ũ������ ����� �� �ִ� �������̽�. ( ��ȸ��)
		//  Iterator�� ���� �����͸� �Ѽ� ��Ű�� �ʰ� ���� �� ����� ���� ����ϱ� ������ �����ϴ�. 
		
		Iterator<String> it = ����.iterator(); 
		
		// while�� �̿��ؼ� ������ �� ���� ������ ������ ������. 
		
		while(it.hasNext()) {
			String ����food = it.next();
			if(���.contains(����food)) {
				����.add(����food);
			}
		}
		System.out.println("����, ��� ������ : " + ����);
		
		
		
		// ������ - A���տ��� B���հ��� �����յ����͸� ������ ������������
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if( !���.contains(����food)) { // �������� ���� ���������� ������ ����̶�� �ǹ̷� �տ� !�� ����
				������.add(����food);
			}
		}
		System.out.println("��ο� ���� ���� ������ : " + ������);
		
		// ������ - A���հ� B������ �� (�ߺ�����)
		
		HashSet<String> �� = new HashSet<>();
//		�� = ����.clone(); �̷��Դ� ������� �� ��. ��ȯ Ÿ���� �� �� ���. 
		
		�� = (HashSet<String>)����.clone();
		��.addAll(���);  
		System.out.println(��);
		
		// ������ ���Ҷ� ��� �Ǵ� �޼��� .addAll();
		// ������ - retainAll -> ����.retainAll(���)
		// ������ - removeAll ����.removeAll(���)
		
		HashSet<Integer> num0 = new HashSet<>();
		
		while(num0.size()<=10) {
			num0.add( Integer.valueOf((int)(Math.random()*50)) );
		}
		
//		System.out.println(num0);
		
		/*
		 		���� 
		 		num1, num2, num3 �� ���� ������ �����
		 		���� 1~50������ ������ 15�� ������ �ϼ���.
		 		num1�� num3�� ������
		 		num1�� num2�� ������
		 		num2�� num3�� ������
		 		num1,num2,num3�� ������
		 */
		
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size()<=14) {
			num1.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num1);
		
		while(num2.size()<=14) {
			num2.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num2);
		
		while(num3.size()<=14) {
			num3.add( Integer.valueOf((int)(Math.random()*50)+1) );
		}
		System.out.println(num3);
		
		//num1�� num3�� ������
		
		// HashSet <Integer> ������1_3, ������2_3, ��, ������; ���� �������� �������� ���� ����
		
		HashSet<Integer> ������1_3 = new HashSet <>();
		
		������1_3 = (HashSet<Integer>)num1.clone();
		������1_3.addAll(num3);  
		System.out.println(������1_3);
		
		
		
		// num1�� num2�� ������
		
		HashSet<Integer> ������1_2 = new HashSet <>();
		
		������1_2 = (HashSet<Integer>)num1.clone();
		������1_2.removeAll(num2);
		System.out.println(������1_2);
		
		
		
		
		// num2�� num3�� ������
		HashSet<Integer> ������1_3 = new HashSet <>();
		
		������1_3 = (HashSet<Integer>)num2.clone();
		
		������1_3.retainAll(num3);
		System.out.println(������1_3);
		
		
		
 		// num1,num2,num3�� ������
		
		HashSet<Integer> ������1_2_3 = new HashSet <>();
		
		������1_2_3 = (HashSet<Integer>)num1.clone();
		������1_2_3.addAll(num2);
		������1_2_3.addAll(num3);
		System.out.println(������1_2_3); 
		
		
		// ���� ���� Ŭ�������� ������ ������ ������ ���ҷ��� equals() ���������Ѵ�. 
		
		
		
		
	} 	// end main

}	// end SetStudy1


/*
 			
 			
 			Set �������̽�
 			-HashSet , TreeSet
 			-������� ���� ���� �ʴ´�. 
 			-�ߺ� ������� �ʴ´�.  => ���� ǥ���� ������. ������, ������, ������. 
 			-������ �����͸� �ϳ��� ������ �� �Ѵ�. (�׷����� �����̱� ����)
 			-�ε����� ����. 
 			-Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�. 
 			-HashSet -> ������ ǥ��
 			-TreeSet -> �˻��� Ưȭ 
 			
 			�ߺ� ���ſ� �׷�ȭ �� �� HashSet�� ����Ѵ�. 
 			
 			
 */
