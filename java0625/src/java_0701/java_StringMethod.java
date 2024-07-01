package java_0701;

import java.util.Arrays;
import java.util.Scanner;

public class java_StringMethod {

	public static void main(String[] args) {
		
		/*�ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
		 * String Ŭ������ ���������� char �⺻ ������Ÿ���� �迭�� �����ǵ��� �Ǿ��ִ�.
		 * char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�.
		 * ���α׷����� ���Ǵ� �������� 70% ������ ���ڿ� �������̴�.
		 * ���ڿ� ���� �޼���� ���� �� �ݵ�� �������Ѵ�.
		 */
		
		// ���� 189p, 201p, �޼ҵ�� �ݵ�� �����ؾ���. 
		
		
		// ���ڿ� �����͸� �����ϴ� ���
		String  word = "i like banana"; // �� ������ ��������(Ŭ������ ������� ��� ������ ���� ��������). �޸� �ּҸ� ������  �� �ִ� �����̴�.  ���ڰ���� �ȵ�!
		// i like banana�� ����ִ� �ּҸ� word�� �����ؼ� �ҷ����� �� �� word ��ü�� �ƹ��͵� ������ �ʴ´�.
		
		// ���ڿ��� - ���� ���ڿ��ΰ�?
		// equals
		System.out.println("equals : " + (word.equals("i like orange") ));
		
		// ���ڿ� ���Կ���
		System.out.println("contains : "	+	(word.contains("banana") ));  // ���� ���θ� �˷���. ���� �����ִ°� �ƴ�!
		
		System.out.println("indexOf : "	+word.indexOf("orange") ); // -1�� ����, ���ԵǾ� ���� �ʴٴ� ��
		
		//���ڿ� ��ġ��
		System.out.println(word + " ��ġ��");
		System.out.println( word.concat("��ġ��"));
		
		// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
		System.out.println( word.indexOf('b'));  // �� �տ������� ���������� ���� �˷���.
		System.out.println(word.lastIndexOf('a')); // �� �ڿ������� ã��
		
		// ���ڿ����� Ư�� ���� ����
		System.out.println( word.charAt(5)); // Ű����� ���ڸ� �Է¹ް� ������ �����.
		
		Scanner sun = new Scanner(System.in);
		
		// Ű����� �����Է� �ޱ�
		System.out.print("���ĺ� �ϳ� �Է� : ");
		char alp = sun.nextLine().charAt(0);
		
		System.out.println("�Է��� ���� : " + alp);
		
		
		// 	 �����ڵ��߿��� �⺻ �����ڵ�� �ƽ�Ű�ڵ��̴�.
		// 	�ƽ�Ű�ڵ�ǥ�� �� 128�� ����
		//	�ƽ��ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
		char ch = 'A';   // �����ڵ忡 �ѱ۵� �ֱ� ������ �ѱ۵� ������. 
		System.out.println( ch+4); // �ƽ�Ű�ڵ�� 10������ ǥ�� �Ǿ��ֱ� ������ ����� �����ϴ�. 
		
		//���ڿ��� ����
		System.out.println("���ڿ� ���ڼ� : " + word.length());
		
		// �빮�� �ҹ��� ��ȯ
		String �빮�� = word.toUpperCase();
		String �ҹ��� = word.toLowerCase();
		
		System.out.println(�빮��);
		System.out.println(�ҹ���);
		
		// ���� ����
		String word2 = "  i hate java  "; 
		System.out.println(word2);
		System.out.println( word2.trim());  // ���� ���� ���鸸 ���� ���� ����� �������� �� ��.
		
		// �� �޼��� �� ���� ���� ���Ǵ� �͵�
		 // equals, contains, 
		 
		 //���ڿ� ����
		System.out.println( Arrays.toString( word.split(" ") ));
		String name = "�̼���@������-������@";
		
		String[] names = name.split("@");  //  @ �������� ������ ���̰� ������ �Ǵ� ���ڴ� �迭�� ���� �ʴ´�. 
		System.out.println( names[1]);
		
		// ���ڿ� �ڸ���(����)
		
		System.out.println( 	word.substring(2)	);   // 2�� �ε������� ������ �ε������� ���Ͷ�.
		System.out.println(	word.substring(6) 	);  // 6�� �ε������� ������ �ε������� ���Ͷ�.
		System.out.println( 	word.substring(2, 6) 	);  // 2�� �ε������� 6�� �ε��� �� ������ ����. 
		
		// ���ڿ� ��ȯ
		
		String �ǻǻ� = "�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ " + "�ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
		
		String ���� = �ǻǻ�.replace( "�ǻǻ�", "�׻׻�");  // �ٲٰ��� �ϴ°� �տ�  �׸���  ����� ���� �ڿ� 
		
		System.out.println(����);
		
		���� = ����.replaceAll("�׻׻�", "�ѿ��");
		
		System.out.println( ����);
		
		// .replaceAll������ ����ǥ���� ��밡�� (java����)
		
		/*
		 * 	����ǥ����
		 * 	^ - ���ڿ��� ���� 
		 * 	$ - ���ڿ��� ����
		 * 	. - ������ �� ����( �ƹ��ų� ���� �ϳ�)
		 *   * - �� ���ڰ� �ְų� ���ų� ( *��	->  	���� ������ �ܾ ����)
		 *   + - �� ���ڰ� �ϳ� �̻�
		 *   ? - �� ���ڰ� ���ų� �ϳ�����
		 *   [] - ������ �����̳� ������ ��Ÿ��
		 *   {} - Ƚ�� �Ǵ� ����
		 *   () - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		 *   | - ���� �ȿ��� or ���� ����
		 *    \(��������)  �� ������ �� 
		 *   \s - ���鹮��
		 *   \S - ���鹮�ڰ� �ƴ� ������ ����
		 *   \w - ���ĺ��̳� ����
		 *   \W - ���ĺ��̳� ���ڸ� ������ ����
		 *   \d - ����
		 *   \D - ���ڸ� ������ ��� ����
		 *   
		 *   
		 *   ���ڿ����� ���ڸ� ���� - replace("[0-9]","")
		 *   ����ó - ^010- \d{4}-\d{4}$
		 *   �ѱ۸� �ۼ� Ȯ�� - ^[��-�H]
		 */
		
		String a = "abc73jd82kd74j";
		System.out.println(a.replaceAll("[0-9]", ""));
		System.out.println(a.replaceAll("[\\d]", ""));
		
		System.out.println(a.replaceAll("[\\D]", ""));
		
	}

}
