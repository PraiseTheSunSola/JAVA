package java0704;

public class class_Method {

	public static void main(String[] args) {
	

		MethodUtil util = new MethodUtil ();
		// �� ���� ������ ��ȯ �ϱ�
		int[] num = util.twoNum();
		
		
		
	}
}

class MethodUtil {
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
//		int [] temp = new int [] {num1,num2}; temp ������ ����� return�� temp�� �൵ �ȴ�.
		return new int [] {num1,num2};
		// return���� ��ȯ ��ų �� �ִ� ���� ���� ���̴�.
		// �������� �����͸� return �ϰ� �ʹٸ� �迭�� �������Ѵ�. 
		// int twoNum() {}; -> int[] twoNum() {}; �� �ٲ�����Ѵ�.!
	}
	
	
	
	
}// end