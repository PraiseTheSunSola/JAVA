package java0627;

public class java_basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �������� ������ ������ �ٲٷ��� ����� �ؾ��Ѵ�. 
		
		//  ������
		// ������ ������ �����ϸ� ��� ���� 
		//  ������ �Ǽ��� �����ϸ� ����� �Ǽ�
		
		//  ��������� - +, -, *,  /(��) , %(������)
		
		System.out.println(  10 / (float)4);
		System.out.println(  10 % 3);
		
		// ���������� - ++ , --
		// ���� ������ - = 
		// ���մ��Կ����� - +=, -=, *=,  /= , %= 
		int a = 10;
		a += 3; // a = a + 3; ����Ǵ� ������ ���Ǵ� ������ �ݵ�� �����ؾ��Ѵ�. 
		
		// �� ������ - > , < , >= , <= , == , ! =  ���ڸ� ����! ���ڿ��� �̰� ���� �ʴ´�.
		System.out.println(10 == 20);
		System.out.println(10 == 3.4);
		String name1 = "������";
		String  name2 = "������";
		System.out.println(name1.equals(name2));
		// �� ������ - &&, \\, !
		//���� ������ - (���ǽ�) ? ������ : ���� ����;		
		
		//��Ʈ ������ 
		//��Ʈ �� ������ -&, \, ~ , ^
		//��Ʈ����Ʈ ������ - >> , <<
		// & ������ ���ϱ�  | (or)�� ���ϱ⸦ �����ϸ� �ȴ�? �� �״�� ���ϰų� ���϶�°� �ƴ϶� �������� ������ �� �׷��ٴ°Ŵ�.
		
		System.out.println( 34 & 15);
		System.out.println(42 | 21);
		System.out.println(42 ^ 30);
		System.out.println(~13);
		System.out.println(~-15);
		// ���� == ������ ��  ex 10�� �Ǳ� ���� 6���� ������ �� 4 == ������ 5
		System.out.println(5 <<  2);
		System.out.println(7 <<  7);
		
		// << 2�� n �� ���Ҷ� 
		System.out.println(1 << 20); // 2�� 4��
		
		// >> 2�� n�� ��ŭ ������
		System.out.println( 1024 >> 3); // 1024�� 2�� 3�� ������.
		
		int red = 188;
		int green = 229;
		int blue = 92;
		int color = (red << 16)  | (green << 8) | blue;
		
		System.out.printf("#%06X /n" , color);
		// rgb ���� ����ڵ�� ��ȯ �÷��� 16������ ��ȯ �� ��  9���� ���ں��� ���ĺ����� ���´�.
	}

}
