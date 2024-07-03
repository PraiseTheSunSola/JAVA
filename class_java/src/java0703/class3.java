package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class class3 {

	public static void main(String[] args) {
		
		Member member1 = new Member("이순신", 31, "군인");
		Member member2 = new Member("문익점", 29, "산업스파이");
		Member member3 = new Member("장영실", 45, "발명가");
		// 태어난 년도
		
		
		// 년도 - 	.getYear();
		// 월 - 		.getMonthValue();
		// 일 - 		.getDayOfMonth(); 
		// 요일 - 	.getDayOfWeek().getValue();
		// 1(월요일), 2(화요일), ... , 7(일요일)
		
		
		// 위처럼 해도 정상적으로 되지만 자기 자신에게 물어보는 형식이다. 그래서 이것을 바꾸기 위해 this를 사용한다.
		// 그래서 void birth의 인스턴스 메서드 파라미더((	)) 안은 비우고 매개변수 자리에 this를 넣는다. 
		// member1.birth(member1); ->  member1.birth( ); 의 모습이 된다. 
		
		member1.birth(	);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 추상 클래스 = 객체를 만들지 못 하는 클래스  = new 연산자를 사용하지 못 함
		// 아이콘 구체 안에 알파뱃 C가 들어있는 것만 객체 만들 수 있음.
		// 클래스 변수는 클래스 이름으로 불러오는걸 권장함.
		
		
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int 월 = cal.get( Calendar.MONTH) + 1; 
//		int 일 = cal.get(Calendar.DAY_OF_MONTH);
//		int 요일 = cal.get(Calendar.DAY_OF_WEEK); // 일요일이 1부터 시작함
		
		
//		System.out.println( year);
		
//		Date today = new Date();
//		System.out.println(today.get); 	//getYear 옛날 방식 권장사항은 아니다.
		
		
		
		
		
	}

}

class Member {
		String name;	 // 이름
		int age;		// 나이
	    String job;	//직업
	    // 기본 생성자메서드
	    Member() {
	    	// 매개변수가 있는 생성자 메서드 
	    }
	    
	    Member( String name, int age, String job) {
	    	this.name= name;
	    	this.age=age;
	    	this.job=job;
	    }
	    
	    // 태어난 년도 언제인가 출력하는 메서드 
	    // 값이 없다고 표현해주는 데이터타입 = void;
	    
	    void birth(	) {
	    	
			LocalDate today = LocalDate.now();		
			int nowYear = today.getYear();
			// 화면 출력 - 이순신 태어난 년도 : 0000년
			
			int birthYear1 = nowYear -this.age;
			System.out.printf("%s 태어난 년도 : %d년 \n", this.name, birthYear1);
	    }
	    
}


// 메서드나 함수를 사용하는 이유 
// 배열, 계산 - 반복문 - 단순 출력
//메서드를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아진다.
// 메서드를 사용하면 구조화된 프로그래밍이 가능하다. 
// 기초 및 기본 문법에 어느 정도 익숙해졌다면 그 후엔 모듈화 시키는 연습을 해야한다. (코드를 기능별 목적별로 분리해서 만드는)
// 