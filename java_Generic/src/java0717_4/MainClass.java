package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{  // �Լ��� �������̽� 
	public void move();
	
}


class A<T> {
		T item;
		
		@SafeVarargs
	final	void get( T... add) {  
			// �������� => �迭�� ����. ���������� ����� �� �ִ� �迭. ũ�Ⱑ ������ ���� ���� ����. 
			// �ٸ� final�� ���ؼ� �� ������ �ﴭ���� ?? �� �𸣰��� ���ۿ��� ã�ƺ��� 
		}
}


public class MainClass {

	@Deprecated
	static void aaa() {
		
	}
	
	public static void main(String[] args) {
		
		aaa();
		
		Date today = new Date();
		
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList ();
		

		
		
//		today.getYear();
	}

}

/*
		Annotation = �ٸ� ���α׷����� ������ ������ �����ϱ� ���� ���Ǵ� ������ �ּ��� ���� �ǹ�
		
		Ư�� �ڵ���� ��ǻ�Ϳ��� �������� 
		ǥ�� - annotation , ��Ÿ annotation
		
		@Override
		�����Ϸ����� �޼��带 �������̵� �ϴ� ���̶�� �˷��ش�. 
		
		@Deprecated
		������ ������� ���� ����̶�� �˷��ش�. 
		
		
		@SuperWarnings
			�����Ϸ� ��� ������� �ʰ� �ϵ��� ����
			
		- @SuppressWarnings("all") => ��� ��� ����	
													 ("deprecation") ������� �ʴ� ��� ��� ����	
													 ("null") null�� ���õ� ��� ����
													 ("unchecked") ��Ȯ�� ���۷��̼� ��� ���� 
													 ("unused") ������� �ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ��� ����
			
			@FunctionalInterface
			'�Լ��� �������̽�' ��� ���� �˷��ش�.  => �޼��带 �ϳ��� ������ �������̽��� ���´� �ǹ�.
			
			@SafeVaragrs
			���׸��� ���� ���� ������ �Ű������� ����� �� ��� ��Ÿ���� �ʱ� 
			
			��Ÿ annotation
			
			@Target	-  �ֳ����̼��� ������ �� ������ ��� ����
			@Documented	- javadoc�� �ۼ��� ������ ����
			@Inherited			- ����Ŭ������ ��ӵǵ��� �� �� ���
			@Retention			-  �ֳ����̼� �Ⱓ ���� ( ���� �߿��� ���� �� ���̳� Ư�� Ŭ���� ���Ͽ��� �����ϰ� �� ���̳�)
			@Repeatable		-  �ֳ� ���̼� �ݺ� ����
			
			
			
			
			
*/