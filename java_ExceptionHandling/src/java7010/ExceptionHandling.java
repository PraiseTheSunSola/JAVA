package java7010;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		

		try {
			// 오류가 예상되는 코드를 try 안에 배치
			
			String name= null;
			String a = "aaa";
			String b = "aaa";
			String c = null;
			
			name.length();
			a.length();
			b.length();
			c.length();
			
			System.out.println( 10 / 0);
		
			
		} catch 	(NullPointerException n) {
			
			n.printStackTrace();  // 오류메시지 확인 - 테스트용. 어디 쯤 오류가 있는지 찾을때 
			
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			
			System.out.println("문자열 입력해라!");
			
			
			/*  catch 	(NullPointerException n) {} 를 catch (Exception e) {} 위에 올린 이유
			  		if문 사용하는것 처럼 생각하면  catch (Exception e)가 위에 있다면 Exception은 
			  		예외 중 최상위 interface이기 때문에 다른 예외가 뜨질 않음. 그렇기 때문에 NullPointer를 위에 둔다. 
			  		catch 안에  System.out.println()는 하나만! 이유는 어떤 문장으로 알려줘야 하는지 모르기 때문에 
			 */
			
		} catch (Exception e) {  // e는 임의로 정한 참조변수 
			
			System.out.println(" 0으로 나누기 하면 안돼!");
			
			
			/*	오류가 나면 프로그램이 종료 되는데, 이 오류를 catch에서 가로 챔.  
					가로채려면 오류를 알아야 가능하다. 
					만약 오류의 종류를 모르겠다면 Exception만 써도 해결은 된다. Exception이 예외 중 최상위이기 때문에
					다만 catch 종류가 많아질 때 Exception만 기입해선 어떤 종류의 오류인지 모르기 때문에 멘트도 다르게 할 수가 없다. 
					NullPointerException -> 객체가 없다는 뜻 
			 */
			
			
		}
		
				System.out.println(" 여기가 프로그램 끝");
		
		
	} // end main

} // end ExceptionHandling

/*
		예외처리
		- 프로그램 실행 중 에러 발생하면 즉시 프로그램 종료.
		예외처리를 해주면 에러가 발생해도 프로그램은 종료 되지 않는다. 
		- 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다. 
		- '에러나 오류를 해결하는 방법이 아니고, 회피하는 방법이다.'
		
		자바에서 예외는 Exception 이라는 interface 
		오류는 Error
*/