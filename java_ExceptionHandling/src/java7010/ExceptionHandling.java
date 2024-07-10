package java7010;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		

		try {
			// ������ ����Ǵ� �ڵ带 try �ȿ� ��ġ
			
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
			
			n.printStackTrace();  // �����޽��� Ȯ�� - �׽�Ʈ��. ��� �� ������ �ִ��� ã���� 
			
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			
			System.out.println("���ڿ� �Է��ض�!");
			
			
			/*  catch 	(NullPointerException n) {} �� catch (Exception e) {} ���� �ø� ����
			  		if�� ����ϴ°� ó�� �����ϸ�  catch (Exception e)�� ���� �ִٸ� Exception�� 
			  		���� �� �ֻ��� interface�̱� ������ �ٸ� ���ܰ� ���� ����. �׷��� ������ NullPointer�� ���� �д�. 
			  		catch �ȿ�  System.out.println()�� �ϳ���! ������ � �������� �˷���� �ϴ��� �𸣱� ������ 
			 */
			
		} catch (Exception e) {  // e�� ���Ƿ� ���� �������� 
			
			System.out.println(" 0���� ������ �ϸ� �ȵ�!");
			
			
			/*	������ ���� ���α׷��� ���� �Ǵµ�, �� ������ catch���� ���� è.  
					����ä���� ������ �˾ƾ� �����ϴ�. 
					���� ������ ������ �𸣰ڴٸ� Exception�� �ᵵ �ذ��� �ȴ�. Exception�� ���� �� �ֻ����̱� ������
					�ٸ� catch ������ ������ �� Exception�� �����ؼ� � ������ �������� �𸣱� ������ ��Ʈ�� �ٸ��� �� ���� ����. 
					NullPointerException -> ��ü�� ���ٴ� �� 
			 */
			
			
		}
		
				System.out.println(" ���Ⱑ ���α׷� ��");
		
		
	} // end main

} // end ExceptionHandling

/*
		����ó��
		- ���α׷� ���� �� ���� �߻��ϸ� ��� ���α׷� ����.
		����ó���� ���ָ� ������ �߻��ص� ���α׷��� ���� ���� �ʴ´�. 
		- ����ڰ� �߸��� ���� �Է��ϴ� ��쿡 �˷��� �� �ִ�. 
		- '������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�.'
		
		�ڹٿ��� ���ܴ� Exception �̶�� interface 
		������ Error
*/