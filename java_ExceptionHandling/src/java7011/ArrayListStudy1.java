package java7011;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member("이순신", 34, "19990405"));
		list.add(new Member("김춘추", 25, "19991208"));
		list.add(new Member("장보고", 28, "19960712"));
		list.add(new Member("한석봉", 31, "19930120"));
		list.add(new Member("김광식", 39, "19851010"));
		
		System.out.println( list);
		
		for( Member m : list) {
			if( m.getAge() >= 30) {
				System.out.println( m);
			}
			
		}

		System.out.println("========== 1995년 이후에 태어난 사람들==========");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(0,4); 
			//  1985 기준 인덱스 0~3까지 이지만 4까지 해야 0~4전까지 출력이 됨
			int year = Integer.parseInt(temp);
			if( year > 1995) 
				System.out.println( m);
		}
		
		
		// 8월, 9월, 10월, 11월에 태어난 사람만 출력
		
		System.out.println("==== 8월, 9월, 10월, 11월에 태어난 사람 ===");
		
		for( Member m: list) {
			String temp = m.getBirth().substring(4,6);
			int month = Integer.parseInt(temp);
			if(month >= 8 && month <= 11) {
				System.out.println(m);
			}
		}
		
		
		
		list.add(2 , new Member("장영실", 34, ""));
		System.out.println(list);
		
		
		// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고
		// 0월 0일로 저장되게 하라. 
		
		for(Member mem : list) {
			if( mem.getBirth().isBlank()) {
				int year = 2024 - mem.getAge();
				mem.setBirth(year + "0000");
			}
		}
		
		System.out.println(list);
		
		Member t =  new Member ("장보고", 0, "0");
		
		list.indexOf(t);
		
		
	} // end main

} // end ArrayListStudy1
