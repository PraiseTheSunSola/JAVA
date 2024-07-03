package java0703;

public class class5 {

	public static void main(String[] args) {
		
		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();  // return 타입과 동일하게 타입을 정해줘야한다. 
		System.out.println(num);
		
		
		// 메서드로부터 두 정수의 더하기 결과 받아서 출력하기
		int 결과 = rm.sum();
		System.out.println(결과);
		
		
		// 다음 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 태양만세 해라!! 
		
		
		String userName = rm.getName();
		int age = 34;
		System.out.println(userName + "  " + age);
		
		
		// 출력은 이 공간에서 이 주석이 있는 여기!
		
		// 국어(89), 영어(78), 수학(50) 세 과목의 총점을 구하는 메서드
		// 세 과목의 평균을 구하는 메서드 ( 메서드 두 개를 사용한다.)
		// 총점과 평균을  출력하세요. 
		
		int 총점 = rm.total();
		int 평균 = rm.avg();
		System.out.printf("세 과목의 총점:  %d  세 과목의 평균: %d", 총점, 평균);
	}

}


class ReturnMth {
	
	int total() {
		
		int 국어 = 89;
		int 영어 = 78;
		int 수학 = 50;
		
		int 총점 = 국어+영어+수학;
		
		return 총점;
	}
	
	int avg() {
		
		int 총점 = total();
		int 평균 = 총점/3;
		
		
		return 평균;
	}
	
	
	String getName() {
		
		String name = "불명의이순신";
		
		return name;
	}
	
	int sum () {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		
		return 10;
	}
	
	
	
	
	
} // ReturnMth