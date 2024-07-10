package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		// ���� Ŭ���� ����
		
		Out out = new Out();
		out.num = 100;
		out.obj.age= 34;
		out.obj.setName("Ŭ������Ʈ��");
		
		Out.InstanceInnerClass in =  out.new InstanceInnerClass();  // InstanceInnerClass�� ��ÿ�� ������� �ϴ� ���̱� ������ new�� ��ġ�� out �ڷ� �����Ѵ�. 
		in.age = 20;
		in.setName("����Ͽ콺");

	}

}

/*
 	static���� ���� �� ������ ������ �޼����
 	�ν��Ͻ� �޼��忡�� ��밡��
 	�ν��Ͻ� ���� �޼���� static �޼��忡�� ��� �Ұ�  ( �޸� ������ static�� ���� ��������� �ν��Ͻ� ���� �޼���� ���� ��������� �𸣱� ������ = ������� ������ �޶� )
 	
 */

class Out {
	static int count ;// Ŭ���� ����
	int num; // �ν��Ͻ� ����
	private String job; // �ν��Ͻ� ����
	InstanceInnerClass obj = new InstanceInnerClass();
	
	
	/*���� Ŭ���� ���� ������� Ŭ���� �ȿ����� ��밡���ϴ�. ������ public�� �پ! 
 	(���� ���踦 ������ �� �� ���� ���� Ŭ������ ���� �ش� Ŭ���������� ��� �����ϰ� �ϰ� ������ �����.)
	 */
	static void save() {
		
	}
	
	//  static class StaticClass�� Out Ŭ���� ��ü�� ������ �ʴ´�.  // ��ü�� ������ ���� �̹� �޸𸮿� ����Ǿ� ����� �� ��. 
	// class�� ���ؼ� ��ü�� ���������.  
	
	
	static class StaticClass { // ���� ����Ŭ����
		int tall; 
		static int birth;
		static void update() {
			
		}
	}
	
	
	class InstanceInnerClass { 

		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
		void create() {
			count = 10;
		}
	}
	
}






/*
 	����Ŭ���� - Ŭ���� ���ο����� ��� ������ Ŭ���� 
 	1. �ν��Ͻ� ���� Ŭ����
 	2. ���� ���� Ŭ����
 	3. ���� ���� Ŭ����
 	4. �͸� ���� Ŭ����
 */
