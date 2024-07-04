package java0703;

import java.util.Scanner;

public class class_homeWork {

	public static void main(String[] args) {
		
		// ����  �ֻ��� ����
		
		/*
		  j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
		  �ֻ��� �ϳ�, �����̴�. ( ���� ������ 1~6)
		  �ֻ����� ���� ū ����� �̱��.
		  
		  �ֻ����� ���ϴ� �޼���
		  
		  �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼��� 
		  
		  �ֻ����� �������̰�  ����ϴ� �ֻ����� �ϳ�.
		 */
		
		/* ��� 1
		Dice game = new Dice();
		
		int ���� = game.getDice("����");
		int ���� = game.getDice("����");
		game.result(����, ����);
		*/
		
		// ��� 2 
		DiceGame game = new DiceGame();
		game.init(); 	// �ֻ��� ���� �ʱ� ���� - ���� �ο� �� �̸� ����
		game.diceThrow();	 // ������ ���� �°� �ֻ��� ������ 
		game.result(); 	// ��� �����ڵ��� �ֻ��� �� �� 
		
		
		
		
	}
} // end

class DiceGame{
	String[] names;
	int[] diceNum;
	
	void init() {
		
		Scanner sun = new Scanner(System.in);
		System.out.print("�ֻ��� ���� �����ο� : ");
		int cnt = sun.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		
		sun.nextLine();  	// ���� ���� - ����  ���� �Է� �� ���� �Է��Ҷ��� ���� ���°� �Է��� 
		for ( int i=0; i<names.length; i++) {
			System.out.print("������ �̸� : ");
			names[i] = sun.nextLine();
		}
	}
	
	void diceThrow( ) {
		for( int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6)+1;
			System.out.println( this.names[i]+ " �ֻ��� : " + this.diceNum[i]);
		}
		
	}
	
	void result() { // �ֻ��� ��� - �ֻ��� ���� ũ�� �̱��. 
		// ���� ū �ֻ��� �� ã��
		int max= 0;
		for(int num : diceNum) { 
			if( max < num) max = num;
		}
		
		// ��� �����ڵ��� �ֻ��� ���� ���ٸ� 
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame = false;
		}
		
		if(isSame) {
				System.out.println(" ��� ������ �ֻ��� ���� ���� - ���");
				return; // ������ ���� �׳� return �Ϸ��� �ν��Ͻ� �޼��� Ÿ���� void�̿��� �Ѵ�.
		}
		

		// ���� ū �ֻ��� �� ������ �ִ� ������� �̱��. 
		for( int i=0; i<diceNum.length; i++) {
			if( diceNum[i] == max) {
				System.out.println(names[i] + " �� ");
			}
		}
		
		
		
	}
	
	
	
	
	
} // end






/* ��� 1
class Dice {
	
	void result(int ��, int ��) {
		
		if(�� > �� ) {
			System.out.println("���� ��, ���� �� ");
		} else if (�� < ��) {
			System.out.println("���� ��, ���� ��");
		}else 
			System.out.println("���");
		
	}
	
	
	int getDice( String name) {
		int num = (int)(Math.random() * 6)+1;
		System.out.println( name+ " �ֻ��� :" + num);
		return num;
	}
	
	
} //end
*/