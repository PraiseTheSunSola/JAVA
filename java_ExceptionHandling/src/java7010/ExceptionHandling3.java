package java7010;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		
		try {
			// �ڵ� 
//			if() 
				throw new NullPointerException("aa");   // �Ϻη� ������ ���� �� 
				// Ư�� ��Ȳ�϶��� �Ϻη� ������ ���� try �ȿ� �Է��Ѵ�.  djfudnj
				
			// �ڵ� 
				
		}catch(Exception e) {
				System.out.println("���� ���� �߻�");
		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	void setAge() {
		this.age = 2024 - birth;
	}
}