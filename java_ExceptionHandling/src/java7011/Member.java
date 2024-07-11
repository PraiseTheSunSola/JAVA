package java7011;

public class Member {
	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth) {
			this.name = name;
			this.age= age;
			this.birth = birth;		
			
	}
	
	
	@Override
	public String toString() {
		return name + " , " + age + " ," + birth;
	}
	
	@Override
	public boolean equals(Object  o) {
		
		Member tmp = (Member) o;
		/*
		  	a와 b를 비교 한다면 
		  	A.equalsB 
		  	this.equalsB 
		  	this는 A 
		  	Object에 들어오는건 똑같은 멤버 클래스 녀석
		  	강제형변환을 해줘야한다. 높은거에서 낮은거 바꿀때 
		  	부모클래스 타입인 Object를 Member 클래스로 바꿔준다. 
		 */
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
