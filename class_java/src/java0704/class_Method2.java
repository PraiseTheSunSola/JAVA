package java0704;

import java.util.Scanner;

public class class_Method2 {

	public static void main(String[] args) {
		
		/*
		 컴퓨터와 가위바위보 하기 
		 컴퓨터의 가위바위보 값은 comInput 메서드를 사용한다.
		 유저의 가위바위보는 한글로 입력한다.
		 승, 무, 패에 대해 출력한다. 
		 메서드 - 유저 가위바위보 입력하고 저장하는 메서드
		 		   - 컴퓨터와 비교하여 결과 출력하는 메서드
		 Game 클래스에 필요한 변수나 메서드 작성
		 main 메서드에서는 Game 클래스 객체로 메서들만 실행		   
		 */
		
		Game game = new Game();
		game.play();


		
		
	}

} // end 




class Game{
	String com;
	String user;
	
	
	void userInput() {
		Scanner sun = new Scanner(System.in);
		System.out.print("가위바위보 : ");
		this.user = sun.nextLine();
		
	}
	
	
	void comInput() {
		int temp1= (int) (Math.random()*3);
		switch(temp1) {
		case 0: this.com = "가위"; break;
		case 1: this.com = "바위"; break;
		case 2: this.com = "보"; break;
		
		
		}
		
	}
	
	void result () {
		
		if( user.equals(com)) {
			System.out.println("비김");
			
		}else if  (  (user.equals("가위") && com.equals("보") ) ||
							(user.equals("바위") && com.equals("가위") ) ||
							(user.equals("보") && com.equals("바위") ) ){
			System.out.println("유저승 , 컴퓨터 패");
		}else {
			System.out.println("유저 패, 컴퓨터 승 ");
		}
		
	}
	
	void play () {
		
		userInput();
		comInput();
		result ();
		
	}
	
}// end
