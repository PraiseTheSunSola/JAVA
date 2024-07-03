package java0703;

public class class5 {

	public static void main(String[] args) {
		
		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		
		System.out.println(num);
		
		
	}

}



class ReturnMth {
	
	int get() {
		
		return 10;
	}
	
	
	
	
	
} // ReturnMth