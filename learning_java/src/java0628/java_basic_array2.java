package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class java_basic_array2 {
	static Scanner sun = new Scanner(System.in);
	public static void main(String[] args) {
		
		// ���� 1��
		// ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է��Ͽ� �����ϼ���.
		// ���� �迭�� ����� �ǸŰ��ݵ��� ���հ� ����� ���ϼ���.
		
//		int[] snack = new int[5];
//		snack[0] = sun.nextInt();
//		System.out.println(snack[0]);
//		snack[1] = sun.nextInt();
//		System.out.println(snack[1]);
//		snack[2] = sun.nextInt();
//		System.out.println(snack[2]);
//		snack[3] = sun.nextInt();
//		System.out.println(snack[3]);
//		snack[4] = sun.nextInt();
//		System.out.println(snack[4]);
//		
//		System.out.println(Arrays.toString(snack));
		
//	for ( int i = 0; i<snack.length; i++) {
//		System.out.print("snack" + (i+1)+"	����	");
//		snack[i] = sun.nextInt();
//	}
//		
//		
//		int sum = 0;
//		int avg = 0;
//		for(int i=0; i<snack.length; i++) {
//			sum = sum +snack[i];
//		}
//			avg = sum/5;   // �Ǵ� sum / snack.length; �� ǥ�� ������.
//
//		System.out.printf("���ڵ��� ���հ� ���:  %d, %d" , sum,avg);
		
		
		/* ���� 2��
		 * 6���� Ű�� tall �迭�� �����Ͽ���.
		 * Ű 175 �̸��� ����ϼ���.
		 */
		
//		float[] tall = new float[] { 173.4f, 175.1f,
//					169.5f, 181.4f, 178.8f, 185.3f
//		};
//		
//		for(int i=0; i<tall.length; i++) {
//			if(tall[i]<175) {
//				System.out.println(tall[i]);
//			}
//		}
		/* ���� 3�� 
		 * from �迭�� ���ڿ��߿��� "��ũ�ҿ�2", "���庻", "��ũ�ҿ�3","��Ű��"��
		 * ���ߴ� �迭�� �����ϰ� ����ϼ���.
		 */
//		String[] from = new String[] {
//				"ŷ���ʵ�", "������ҿ�", "��ũ�ҿ�1", "��ũ�ҿ�2",
//				"���庻","��ũ�ҿ�3","��Ű��"," ���縵" };
//		
//		String[]  vanguard =  new String[4];
//		
//		System.arraycopy(from, 3, vanguard, 0,4); 
//		// ��ü�� �����Ѵٰ� �� �� from.length Ȥ�� ������ �迭�� ���� (�� ��.0~������ �ڸ�����)
//		System.out.println(Arrays.toString(vanguard));
		
//		String word = "i like banana"; //  llke�� ǥ���ϸ� -1�� �� ���°� -1
//		/* �ڹٿ��� ��ü�� indexOf�� ������. �׸��� ���� �迭�� ��ü�� �ƴ� �迭�� 
//		 * Ŭ������ ����
//		 * ����� ���̶� indexOf ����� �ȵȴ�.
//		*/
//		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġã�� - indexOf
//		System.out.println(word.indexOf("like"));
//		
//		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� �������� - true, false
//		System.out.println(word.contains("ba"));
//		String[] a= new String[] {"banana", "orange"};
//		
//		a[0].indexOf("na");
//		a[1].contains("ge");
		
		
//		String[] from = new String[] {
//				"ŷ���ʵ�", "������ҿ�", "��ũ�ҿ�1", "õ��","��ũ�ҿ�2",
//				"���庻","��ũ�ҿ�3","��Ű��"," ���縵" ,"�Ƹӵ��ھ�6"};
//		
//		System.out.print("Ÿ��Ʋ �˻� :	");
//		String search = sun.nextLine();
//		
//		for( int i=0; i< from.length; i++) {
//			// ���ڿ��� ǥ���Ǿ� ������ �޼ҵ� ��� �� [i]�� ǥ�� �ؾ��Ѵ�.
//			if(from[i].contains(search)) {
//				System.out.println("�˻� ��� :	"  + from[i]); 
//			}
//		}
		
		/* ���� 4��
		 *  ���� �˻��Ͽ� �����̸��� �ݾ��� ��µǰ� �ϼ���.
		 *  ī�� �迭�� ���� ���� �˻��� �˼��մϴ�. �غ����Դϴ�. ��� ���
		 */
		
		String[] cafe = new String[] {
				"�Ƹ޸�ī�� : 2000��", "ȭ��Ʈ �Ƹ޸�ī�� : 2800��", 
				"ī��� : 3000��", "��ü�� : 3800��", 
				"ī���ī : 3800��", "�����ֽ� : 4000��","��Ӿ��̽�Ƽ : 2900��",
				"�����ƾ��̽�Ƽ : 2800��", "�ڵξ��̽�Ƽ : 2800��",
				"���ڿ��̵� : 3500��",
				"�����̵� : 3500��", "û�������̵� : 3500��"
		};
		
		System.out.print("�޴� �˻� :  ");
		String search = sun.nextLine();
		
		boolean isDrink = true;
//		for( int i=0; i< cafe.length; i++) {
//			if(cafe[i].contains(search)) {
//				System.out.println("�˻� ��� : " + cafe[i]);
//			}else {
//				System.out.println("�˼��մϴ�. �غ����Դϴ�. �ν�Ÿ DM���� ���� ��Ź�帳�ϴ�.");
//			}
//		}
		for( int i=0; i< cafe.length; i++) {
			if(cafe[i].contains(search)) {
				System.out.println("�˻� ��� : " + cafe[i]);
				isDrink = false;
			}
		}
		
		if( isDrink) {
			System.out.println("�˼��մϴ�. �غ����Դϴ�.");
		}
		
		
		
		
		
		
		
	}

}
