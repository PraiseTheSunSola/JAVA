package java0703;

public class class5 {

	public static void main(String[] args) {
		
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();  // return Ÿ�԰� �����ϰ� Ÿ���� ��������Ѵ�. 
		System.out.println(num);
		
		
		// �޼���κ��� �� ������ ���ϱ� ��� �޾Ƽ� ����ϱ�
		int ��� = rm.sum();
		System.out.println(���);
		
		
		// ���� ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �¾縸�� �ض�!! 
		
		
		String userName = rm.getName();
		int age = 34;
		System.out.println(userName + "  " + age);
		
		
		// ����� �� �������� �� �ּ��� �ִ� ����!
		
		// ����(89), ����(78), ����(50) �� ������ ������ ���ϴ� �޼���
		// �� ������ ����� ���ϴ� �޼��� ( �޼��� �� ���� ����Ѵ�.)
		// ������ �����  ����ϼ���. 
		
		int ���� = rm.total();
		int ��� = rm.avg();
		System.out.printf("�� ������ ����:  %d  �� ������ ���: %d", ����, ���);
	}

}


class ReturnMth {
	
	int total() {
		
		int ���� = 89;
		int ���� = 78;
		int ���� = 50;
		
		int ���� = ����+����+����;
		
		return ����;
	}
	
	int avg() {
		
		int ���� = total();
		int ��� = ����/3;
		
		
		return ���;
	}
	
	
	String getName() {
		
		String name = "�Ҹ����̼���";
		
		return name;
	}
	
	int sum () {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		
		return 10;
	}
	
	
	
	
	
} // ReturnMth