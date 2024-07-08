package java0708;

import java.util.Scanner;

public class DbTest {

	static Scanner sun= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Dao dao = new Dao();
		
	switch () {
	case 1:
		
	
		System.out.print("학생 이름 : ");
		String name = sun.nextLine();
		
		System.out.print("국어 성적 : ");
		int kor = sun.nextInt();
		
		System.out.print("영어 성적 : ");
		int eng = sun.nextInt();
		
		System.out.print("수학 성적 : ");
		int mat = sun.nextInt();
		
		Member member = new Member(name,kor,eng,mat);
		// new를 통해 만들어진 객체는 메소드 동작이 완료되도 지워지지 않고 프로그램이 종료될 때 같이 삭제 된다. ( 메모리에서)
		
		
		total_avg(member);
		System.out.println(member);
		
		// 데이터베이스에 저장 
		
		dao.insert(member);
		break;
		
	case 2: // 데이터 전부 출력
		break;
	}
		
	} // end mian

	// 같은 메모리 공간을 사용하고 있기에 아래의 메서드는 return할 필요가 없다.
	static void total_avg(Member m) {
		int total = m.getKor() + m.getEng() + m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
		
	}
	
}//  DbTest end 
