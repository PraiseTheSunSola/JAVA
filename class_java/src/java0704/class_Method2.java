package java0704;

import java.util.Scanner;

public class class_Method2 {

	public static void main(String[] args) {
		
		/*
		 ��ǻ�Ϳ� ���������� �ϱ� 
		 ��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		 ������ ������������ �ѱ۷� �Է��Ѵ�.
		 ��, ��, �п� ���� ����Ѵ�. 
		 �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		 		   - ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		 Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		 main �޼��忡���� Game Ŭ���� ��ü�� �޼��鸸 ����		   
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
		System.out.print("���������� : ");
		this.user = sun.nextLine();
		
	}
	
	
	void comInput() {
		int temp1= (int) (Math.random()*3);
		switch(temp1) {
		case 0: this.com = "����"; break;
		case 1: this.com = "����"; break;
		case 2: this.com = "��"; break;
		
		
		}
		
	}
	
	void result () {
		
		if( user.equals(com)) {
			System.out.println("���");
			
		}else if  (  (user.equals("����") && com.equals("��") ) ||
							(user.equals("����") && com.equals("����") ) ||
							(user.equals("��") && com.equals("����") ) ){
			System.out.println("������ , ��ǻ�� ��");
		}else {
			System.out.println("���� ��, ��ǻ�� �� ");
		}
		
	}
	
	void play () {
		
		userInput();
		comInput();
		result ();
		
	}
	
}// end
