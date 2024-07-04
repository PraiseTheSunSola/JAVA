package java0704;

public class class_Method {

	public static void main(String[] args) {
	

		MethodUtil util = new MethodUtil ();
		// 두 개의 정수를 반환 하기
		int[] num = util.twoNum();
		
		
		
	}
}

class MethodUtil {
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
//		int [] temp = new int [] {num1,num2}; temp 변수를 만들고 return에 temp를 줘도 된다.
		return new int [] {num1,num2};
		// return으로 반환 시킬 수 있는 값은 단일 값이다.
		// 여러개의 데이터를 return 하고 싶다면 배열로 만들어야한다. 
		// int twoNum() {}; -> int[] twoNum() {}; 로 바꿔줘야한다.!
	}
	
	
	
	
}// end