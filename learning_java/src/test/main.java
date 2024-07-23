package test;

public class main {

	public static void main(String[] args) {
		
		  try {
	            // 원본 객체 생성
	            Apple originalApple = new Apple("Red");

	            // 원본 객체 복제
	            Apple clonedApple = (Apple) originalApple.clone();

	            // 원본과 복제본 출력
	            System.out.println("Original Apple: " + originalApple);
	            System.out.println("Cloned Apple: " + clonedApple);

	            // 복제본의 색상 변경
	            clonedApple = new Apple("Green");

	            // 변경 후 출력
	            System.out.println("Modified Cloned Apple: " + clonedApple);
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
		

	}

}
