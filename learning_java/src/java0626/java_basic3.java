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
		Integer.parseInt(sun.nextLine());
		
		float tax = 0.08f;
		// �ʱ�ȭ�� ����ȭ ����. 
		String Sola = null;
		String Team1 = null;
		int solaPay = 0;
		
		
		String Artorias = null;
		String Team2 = null;
		int artoriasPay = 0;
		
		int  salary =0;  // �̷��� �Է��ϸ� �Ʒ������� ���� ������. ���� ����		

		
//		System.out.println("�̸�  : " + name + " �μ� : " +team+ "  ���ɾ� : " +  salary) �� ǥ�� �Ҽ� �ְ� ������ �����ؼ� ����ص� ��������. �� ������ ��� 
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
		salary = (int)(solaPay - (solaPay* tax)); 
		System.out.printf("�ֶ��� �Ǽ��ɾ��� :  %d\n",  salary);
		
		/*
		 *  next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��
		 *  nextLine() - ����Ű ������ �Է� ��
		 */
		
		sun.nextLine();// �Է� ���۸� ��� �����μ� ������ �ʰ� �ٸ� ���ڰ� ���� �ٿ� �ִ� ���� ����  �� �� ���ڸ� �޴� �Ϳ��� nextLine���� �ٲ��ش�.
		System.out.print("�̸� :  " );
		Artorias = sun.nextLine();
		System.out.print("�ҼӺμ�:  " );
		Team2 = sun.nextLine();
		
		System.out.print("�� �޿��� :");
		artoriasPay = sun.nextInt();
		
		System.out.print(Artorias + "\n");
		System.out.print(Team2+ "\n");
		System.out.print(artoriasPay+ "\n");
		
		salary = (int)(artoriasPay - (artoriasPay* tax)); 
		System.out.printf("�Ƹ��丮�콺�� �Ǽ��ɾ��� :  %d",  salary);
		
		/*
		 *  Ű���带 ���������� �Է¹��۶�� ���� ���� �ӹ����ٰ� �ü������ ���޵ȴ�. 
		 *  
		 *  �Ź� ����ַ��� ���°� ������. 
		 *  Integer.parseInt(sc.nextLine())�� ��ܿ� �����ָ� �˾Ƽ� ��� ����ش�. �� ��쿣 sun
		 * */
	}

}
