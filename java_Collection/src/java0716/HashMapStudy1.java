package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {
		
	
		//	�ؽ��� �ؽ� �Լ��� ���ڿ� �Է°��� �־ Ư���� ������ �����ϴ� ���� �ǹ�
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		
		// .put();  => key�� value�� ������ �� �ִ� �޼���
		
		map.put("�̼���", 19990405); 
		map.put("������", 19900101);
		map.put("�念��", 20110718);
		map.put("�̵�", 20051103);
		map.put("������", 20091010);
		map.put("�̼���", 19990405);
		
		// .putIfAbsent(); => ���� Ű�� �����Ѵٸ� ���� ���� �ʰ�, ���ٸ� �������ִ� �޼���
		
		map.putIfAbsent("�念��", 1222);  
		
		
		System.out.println(map);
		
		
	//  .println(��������.get("key") );  map�� index�� ������� �ʰ� ���¸� ���, �ҷ��� key�� �Է��Ѵ�.
	//	key�� ��Ī�Ǵ� value ��� 
		
		System.out.println(map.get("�̵�") );    
		
		
		// value ���� �����ϰ��� �ϴ� key�� value�� �����ϱ⿡ key�� �տ�, �����Ϸ��� value ������ �ڿ� ���´�. 
		
		map.replace("�̼���", 19760505);
		
		//   .containsKey => �ش� HashMap�� Ư�� key�� �����ϴ��� Ȯ���Ҷ� ��� true, false�� ���
		//   .containsValue => �ش� HashMap�� Ư�� Value�� �����ϴ��� Ȯ���Ҷ� ��� true, false�� ���
		
		System.out.println(map.containsKey("����ȣ"));
		System.out.println(map.containsValue(1222));
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		//set  �Ǵ� collection ��ȯ
		
		Set<String> keys	= map.keySet();
		
		System.out.println(keys);
		
		// map�� �ݺ����� ����� �� ����.  ����ϰ��� �Ѵٸ� map�� Set���� ��ȯ �� ����Ѵ�. 
		
		for(String name : keys) {
				System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
		
		// Ű�� ���� �ϳ��� ���ļ� ����� �� ���  / ��ɾ ���� ó�� 
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet(); 
		System.out.println(entry);
		
		
		//  (�Ű����� , �Ű�����)  -> System.out.println(Ű + " " + ��)); 
		// ������ ��ȯ ���̵� .forEach(); ��밡�� 
		
		map.forEach((k,v) -> System.out.println(k+ " " + v));
		
		
		
		
		
		
		
		
		
		
	} 	//  end main

}	//	end HashMapStudy1

/*
		HashMap ( �̳༮�� Collection interface�� �ƴϰ� key�� value�� �̷���� Map interface��. ) 
		- ���������� ������� �ʴ´�. 
		- Key : value 
		- Key �ߺ� ���� ���� �ʴ´�. 
		-value �ߺ� ���
		-Map�� ���� �˻��� Ưȭ �Ǿ��ִ�.  (������ � �ٷ��̿� ����ִ� ����(Database)�� ���� ������ ������ ���� ������ ǥ)
		-�޸� ������ ���� �Һ��Ѵ�. 
		Key�� Value �� ������ ����ϱ� ������ Ÿ�Ե�  �� ������ ����Ѵ�. 
*/