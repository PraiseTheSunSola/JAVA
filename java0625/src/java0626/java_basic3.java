package java0626;

import java.util.Scanner;

public class java_basic3 {

	public static void main(String[] args) {
		
		/* �ڵ� �ۼ��ϱ��� �ؾ� �� �� - �����ľ�, �䱸���׵���
		 *  ���ڿ� - " "  ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
		 *  ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
		 *  
		 *  
		 *  ���� 2.
		 *  ���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
		 *  ������ 8%�� ����. �Ǽ��ɾ��� ������ ���
		 *  �̸�, �μ�, �Ǽ��ɾ��� ����ϼ���.
		 *  �� ���� ������ ���� ����ϼ���.
		*/
		
		Scanner sun = new Scanner(System.in);
		
		String Sola;
		String Team1;
		int solaPay;
		float tax = 0.08f;
		
		String Artorias;
		String Team2;
		int artoriasPay;
		

		
		
		System.out.print("�̸� :  " );
		Sola = sun.next();
		System.out.print("�ҼӺμ�:  " );
		Team1 = sun.next();
		System.out.print("�� �޿��� :");
		solaPay = sun.nextInt();
		
		System.out.print(Sola + "\n");
		System.out.print(Team1+ "\n");
		System.out.print(solaPay+ "\n");
		
// �ڹٿ��� ������ �������� �Ǽ��� �Ǽ����� �ؾ��Ѵ�. �׷��� ��������ȯ�� ������Ѵ�.
// ���� �ʿ��� ū �����δ� �ڵ�����ȯ�� �ǰ�, ū �ʿ��� ���� ���� ������ȯ�� �ʿ���.
// ���ڿ��� ������ ������ �ٲܼ� ����.
//		float salary = solaPay - (solaPay* tax);  �̰ſ��� �Ʒ� �ڵ�� �ٲ���
		int  salary = (int)(solaPay - (solaPay* tax)); 
		System.out.printf("�ֶ��� �Ǽ��ɾ��� :  %d",  salary);
	}

}
