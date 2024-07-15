package java0715;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
	
		Stack <String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "네이버";
		
		Scanner sun = new Scanner(System.in);
		
		while(true) {
				System.out.print("이동페이지 입력 (1.뒤 2. 앞) : ");
				String temp = sun.nextLine();
				if(temp.equals("1") && !back.isEmpty() ) { // 이전 페이지 이동
					pre.push( now );  // 현재 페이지는 앞쪽 스택에 저장
					now = back.pop(); 
					
					
				} else if ( temp.equals("2") && !pre.isEmpty() ) { // 앞 페이지 이동
					back.push(now);
					now = pre.pop();
					
					
					
				}else { // 새 페이지 이동
					back.push( now );
					pre.clear();
					now = temp;
				}
				
				System.out.println("현재 페이지 : " + now);
				System.out.println("back 페이지 목록 : " + back);
				System.out.println("pre 페이지 목록 : " + pre);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		Stack<String> st = new Stack<>();
		
		st.add("이순신");
		st.push("김유신");
		st.push("김춘추");
		st.push("장보고");
		st.push("김종서");
		
		System.out.println(st);
		System.out.println(st.pop());  // 출력 pop하면 맨 마지막꺼부터 꺼냄 
		System.out.println(st);
		System.out.println(st.search("김춘추"));  // 인덱스 번호 검색 
		
		System.out.println(st.size());
		
		// st.size() - st.search("김춘추)
		// pop메서드 실행 횟수 
		
		System.out.println(st.isEmpty());
		
	*/
		
		
	} // end main

} // end Stack

/*
	Stack  (배열 구조)ㄴ
	
	데이터를 저장하기 위한 입구와 출력하기 위한 출구가 같다.
	한 곳을 통해 저장과 출력이 이루어지는 구조이다.
	FILO - first in last out
	ex) 방문기록
	맨 처음 저장한 값이 맨 밑에 쌓이고 맨 마지막에 저장한 값부터 꺼내는 구조. 
	맨 처음 값을 사용하려면 그 전에 저장한 값들 전부 꺼내야 사용 가능함.
	
*/