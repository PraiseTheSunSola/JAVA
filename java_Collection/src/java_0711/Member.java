package java_0711;


public class Member implements Comparable<Member>{
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
	public boolean equals(Object  o) { // 어떤 데이터로 비교할 것인가?
		Member tmp = (Member) o;
//		return this.age == tmp.age; 	// 나이 비교  
//		return this.name.equals(tmp.name); // 여기서 .equals은 String name
		boolean isSame = this.age == tmp.age; 
		if( isSame)
			isSame = this.name.equals(tmp.name);
		if(isSame)
			isSame = this.birth.equals(tmp.birth);
		return isSame; 	//  이름, 나이, 생년월일까지 같은지 비교해서 찾는 식  
		
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


	@Override
	public int compareTo(Member o) { // 비교 해주는 메서드 
		
//		return this.age - o.age; 	// 나이 기준 오름 차순
//		return (this.age - o.age)*-1; 	// 나이 기준  내림 차순 o.age - this.age도 가능
//		return this.name.compareTo(o.name); 	//  문자열 안에 compareTo가 있기 때문에 계산이 됨.
//		return this.name.compareTo(o.name)*-1; 	//  문자열 내림차순 
		
		/*
		  			문제 
		  			나이기준 오름차순으로 하는데
		  			나이가 같으면 
		  			이름기준 내림 차순으로 나오게 해라. 
		 */
		
		int cmp = this.age - o.age;
		if(cmp == 0) {
			cmp = this.name.compareTo(o.name)*-1;
		}
		return cmp;
		
			
			
		
		} // end compareTo
	
	
	
	
	
	
	} 	// end Member implements Comparable<Member> 
	
	
	
	

