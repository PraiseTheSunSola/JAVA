package java7011;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member("�̼���", 34, "19990405"));
		list.add(new Member("������", 25, "19991208"));
		list.add(new Member("�庸��", 28, "19960712"));
		list.add(new Member("�Ѽ���", 31, "19930120"));
		list.add(new Member("�豤��", 39, "19851010"));
		
		System.out.println( list);
		
		for( Member m : list) {
			if( m.getAge() >= 30) {
				System.out.println( m);
			}
			
		}

		System.out.println("========== 1995�� ���Ŀ� �¾ �����==========");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(0,4); 
			//  1985 ���� �ε��� 0~3���� ������ 4���� �ؾ� 0~4������ ����� ��
			int year = Integer.parseInt(temp);
			if( year > 1995) 
				System.out.println( m);
		}
		
		
		// 8��, 9��, 10��, 11���� �¾ ����� ���
		
		System.out.println("==== 8��, 9��, 10��, 11���� �¾ ��� ===");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(4,6);
			int month = Integer.parseInt(temp);
			if(month >= 8 && month <= 11) {
				System.out.println(m);
			}
		}
		
		
		
		list.add(2 , new Member("�念��", 34, ""));
		System.out.println(list);
		
		
		// ��������� ���� ����� ã�Ƽ� �� ����� ���̸� ���� �⵵�� �ְ�
		// 0�� 0�Ϸ� ����ǰ� �϶�. 
		
		for(Member mem : list) {
			if( mem.getBirth().isBlank()) {
				int year = 2024 - mem.getAge();
				mem.setBirth(year + "0000");
			}
		}
		
		System.out.println(list);
		
		Member t =  new Member ("�庸��", 0, "0");
		
		list.indexOf(t);
		
		
	} // end main

} // end ArrayListStudy1
