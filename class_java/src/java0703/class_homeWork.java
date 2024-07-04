package java0703;

import java.util.Scanner;

public class class_homeWork {

	public static void main(String[] args) {
		
		// 과제  주사위 게임
		
		/*
		  j형준과 s석완이가 주사위 게임을 한다.
		  주사위 하나, 육면이다. ( 숫자 범위는 1~6)
		  주사위의 값이 큰 사람이 이긴다.
		  
		  주사위값 구하는 메서드
		  
		  주사위 값 비교하여 누가 이겼는지 출력하는 메서드 
		  
		  주사위는 랜덤값이고  사용하는 주사위는 하나.
		 */
		
		/* 방식 1
		Dice game = new Dice();
		
		int 석완 = game.getDice("석완");
		int 형준 = game.getDice("형준");
		game.result(석완, 형준);
		*/
		
		// 방식 2 
		DiceGame game = new DiceGame();
		game.init(); 	// 주사위 게임 초기 설정 - 참가 인원 및 이름 설정
		game.diceThrow();	 // 참가자 수에 맞게 주사위 던지기 
		game.result(); 	// 모든 참가자들의 주사위 값 비교 
		
		
		
		
	}
} // end

class DiceGame{
	String[] names;
	int[] diceNum;
	
	void init() {
		
		Scanner sun = new Scanner(System.in);
		System.out.print("주사위 게임 참가인원 : ");
		int cnt = sun.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		
		sun.nextLine();  	// 버퍼 비우기 - 엔터  숫자 입력 후 문자 입력할때만 버퍼 비우는걸 입력함 
		for ( int i=0; i<names.length; i++) {
			System.out.print("참가자 이름 : ");
			names[i] = sun.nextLine();
		}
	}
	
	void diceThrow( ) {
		for( int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6)+1;
			System.out.println( this.names[i]+ " 주사위 : " + this.diceNum[i]);
		}
		
	}
	
	void result() { // 주사위 결과 - 주사위 값이 크면 이긴다. 
		// 가장 큰 주사위 값 찾기
		int max= 0;
		for(int num : diceNum) { 
			if( max < num) max = num;
		}
		
		// 모든 참가자들의 주사위 값이 같다면 
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame = false;
		}
		
		if(isSame) {
				System.out.println(" 모든 참가자 주사위 값이 같다 - 비김");
				return; // 데이터 없이 그냥 return 하려면 인스턴스 메서드 타입은 void이여야 한다.
		}
		

		// 가장 큰 주사위 값 가지고 있는 사람들이 이긴다. 
		for( int i=0; i<diceNum.length; i++) {
			if( diceNum[i] == max) {
				System.out.println(names[i] + " 승 ");
			}
		}
		
		
		
	}
	
	
	
	
	
} // end






/* 방식 1
class Dice {
	
	void result(int 서, int 전) {
		
		if(서 > 전 ) {
			System.out.println("석완 승, 형준 패 ");
		} else if (서 < 전) {
			System.out.println("석완 패, 형준 승");
		}else 
			System.out.println("비김");
		
	}
	
	
	int getDice( String name) {
		int num = (int)(Math.random() * 6)+1;
		System.out.println( name+ " 주사위 :" + num);
		return num;
	}
	
	
} //end
*/