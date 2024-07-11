package java7010;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		Member member = new Member("�̼���", 2077);
		System.out.println( member.name + " " + member.birth);
		try {
		member.setAge();
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
		System.out.println(member.age);
		
		
		
		
		
		/*
		try {
			// �ڵ� 
			if() 
				throw new NullPointerException("���⼭���� ���� ����");   
			// �Ϻη� ������ ���� ��. ������ ����� ����� Ȯ���ϱ� ���� ����Ѵ�. 
			// �ٸ� �༮���� ������ ���ѱ�� ���ؼ� ����ϱ⵵ �Ѵ�. �׷��� ������ ��ó�� Ȯ���� �� �� �ֱ⵵ �Ѵ�.  (�߾�����ȭ)
		   // Ư�� ��Ȳ�϶��� �Ϻη� ������ ���� try �ȿ� �Է��Ѵ�.  
		   //  ���ܸ� ������� ���ѱ��� ���� ���Ǵ� ��찡 ����. 
				
			// �ڵ� 
				
		}catch(Exception e) {
				System.out.println("���� ���� �߻�");
		}
*/
		
		
	} // end main

} // end  ExceptionHandling3

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
/*
	 setAge �޼��带 ȣ���Ͽ� age������ �����ϴµ� 
	 age������ ���̸� ǥ���ϱ� ���� ������ 0���� ���� ���� ����Ǹ� �ȵȴ�. 
	 ���� �⵵���� �¾ �⵵�� ���� ������ 0���� �������� ���´ٸ� �߸��� ���̴�. 
	 �� ������ birth������ ���� �߸� �Ǿ��⿡ �߻��� �����ϱ� 
	 setAge �޼��忡�� ó���� �ϴ°� �ƴϰ� ���� �ڵ忡�� �ذ��ؾ��ϹǷ� 
	 ���� �߻���Ű�� �Ѱ��ֱ⸦ �Ѵ�.
 */
void setAge() throws RuntimeException{ // ���ѱ���� () �ȿ� �޼��� �̸��� ���°� �ƴ� �� �ڿ� 
		this.age = 2023 - birth;
		if( age < 0 ) 
			throw new RuntimeException("�¾ �⵵�� �߸��Ǿ���.");
	}
}

// throw - ���� �߻���Ű��
// throws - ����ó�� �̷��



//class Member{
//	String name;
//	int age;
//	int birth;
//	Member(String name, int birth){
//		this.name = name;
//		this.birth = birth;
//	}
//	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age <0) 
//				throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//	} // end steAge
//}