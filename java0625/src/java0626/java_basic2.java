package java0626;

import java.util.Scanner;

//import java.util.Scanner; �ڵ��ϼ� Ű�� ��Ʈ�� + �����̽�

public class java_basic2 {

	public static void main(String[] args) {
		System.out.println("praise The Sun!");
		/*�ڹٴ� ȥ�ڼ� ������� �� �Ѵ�.  �ڵ��ۼ� -> ������  -> �δ� (�޸𸮿� �����ϴ� ����) ->  
		  jvm(������ ����)��  C���� ���� �ü������ ��� ��û ->  consoleâ�� ���. 
		 */
		// System. in - �Է� 
		// �Է¹����� �ִ� ���� Ŭ���� - Scanner (��, ����Ϸ��� import�� �ؾ��Ѵ�. ������ �;��Ѵ�.)
		// ��θ� ���� Ŀ���� �����ٴ�� ��θ� �˷��ش�.
		Scanner sun = new Scanner(System.in);
		// scan�� �������� new�� �޸� ������ ������ ���� ������ �ּҸ� ������ �ִ�.
		
		// float Ÿ�� - nextFloat(),  double - nextDouble()
		// byte - nextByte(),  short - nextShort();
		//  char(����) �� ����.
		// ���ڿ� �Է�  - nextLine(),  next();
//		sun.nextInt();

//		int a = sun.nextInt();
//		System.out.println( a );
		
		/*
		 ������ ���ְ� �Ծ����� ö���� ������ �Ա����� �������� ����.
		 ��Զ��� �ﰢ���, �ٳ��������� �Ծ���.
		 ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
		  */
//		int samgakKimbap;
//		int daegeRamyeon ;
//		int bananaFlavoredMilkDrink;
//		// int samgakKimbap, samgakKimbap, bananaFlavoredMilkDrink�� ������ �����ص� �ȴ�.
//		System.out.printf("samgakKimbap : ");
//		samgakKimbap = sun.nextInt();
//		System.out.printf("daegeRamyeon : ");
//		daegeRamyeon = sun.nextInt();
//		System.out.printf("bananaFlavoredMilkDrink : ");
//		bananaFlavoredMilkDrink = sun.nextInt();
//		
//		int total = samgakKimbap + daegeRamyeon + bananaFlavoredMilkDrink;
//		System.out.println("���ɰ� : " + total+ "��");
		// System.out.printf("���ɰ� : %d �� \n", ���ұݾ�);
		
		/*
		 * �ֶ�� ģ������ ������ ���� ���Դ�.
		 * ���ͼ����� ������ ���� �ͼ� ���� ���ٿԴ�.
		 * �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿԴ�.
		 * �ֶ��� ���� 5���̴�. �ֶ� 1�� �ö󰡴µ� 3.4�ʰ� �ɷȴ�.
		 * �ֶ� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� �� ��? 
		 */
		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
		// if, �Լ�(�޼ҵ�), �ݺ���
		
//		int solarHouse;
//		float Time_to_go_up_to_the_first_floor;
//		int inOut;
//		
//		System.out.printf("solarHouse :");
//		solarHouse = sun.nextInt();
//		System.out.printf("Time_to_go_up_to_the_first_floor :");
//		Time_to_go_up_to_the_first_floor = sun.nextFloat();
//		System.out.printf("inOut");
//		inOut = sun.nextInt();
//		
//		float totalTime = (solarHouse-1)*Time_to_go_up_to_the_first_floor *inOut;
//		System.out.printf("�� �ɸ� �ð��� %f �׷��Ƿ� �¾縸��",  totalTime  );
		
		/*
		 * �������� ������ ����, �Ǽ�, ����, boolean(��, ����)
		 * ������ Ÿ��
		 * 	���� - byte, short, int, long
		 * 	����- char
		 * 	�Ǽ�- float, double
		 * 	������- boolean
		 * 
		 * ���� ������ - ������Ÿ�� �����̸�;
		 * int num; ���� Ÿ�� ���� ����
		 * double dnum; �Ǽ� Ÿ�� ���� ����
		 * char ch; ���� Ÿ�� ���� ����
		 * boolean bool; �� ���� ���� ����
		 * 
		 * ������ �ʱ�ȭ 
		 * int num = 10; ���� ����� �Բ� �����͸� ����
		 * 
		 * ��¹��
		 * System.out.println( ��³���);
		 * System.out.print(��³���);
		 * System.out.printf(��³���);		 
		 * 
		 * printf ���� �԰� ����ϴ� ����������
		 *  %d, %u - ����
		 *  %f - �Ǽ�
		 *  %c - ����
		 *  %s - ���ڿ�
		 *  
		 *  int age = 28;
		 *  System.out.printf("%s ������ ���̰� %d���� ���������� %c��  " ,
		 *  									"�ڵ���", age, '��');
		 *  
		 *  Scanner ���� = new Scanner(System.in);
		 *  *Scanner Ŭ������ ����ܺ�Ŭ�����̹Ƿ� import�ؾ��Ѵ�.
		 *  
		 *  ����.nextInt(); intŸ�� ������ �Է�
		 *  ����.nextByte(); byteŸ��
		 *  ����.nextLong(); longŸ�� ������ �Է�
		 *  ����.nextFloat(); floatŸ�� �Ǽ��� �Է�
		 *  ����.nextDouble(); doubleŸ�� �Ǽ��� �Է�
		 *  ����. next(); ���ڿ� �Է� 
		 *  ����.next
		 */
		
		/*
		 * c���, �ڹ�, �����а��� ���� ������ �Է��ϼ���.
		 * �� ������ ������ ����� ���� ����ϼ���. 
		*/
		
		int c = 50;
		int java = 70;
		int architecture_101 = 30;
		int totalPoint = c+java+architecture_101;
		int average = totalPoint /3;
		
		System.out.printf("�� ������ ������ %d praise The Sun!\n" , totalPoint);
		System.out.printf("�� ������ ����� %d praise The Sun!", average);
		
		
	}

}

