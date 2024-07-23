package test;

public class main {

	public static void main(String[] args) {
		
		  try {
	            // ���� ��ü ����
	            Apple originalApple = new Apple("Red");

	            // ���� ��ü ����
	            Apple clonedApple = (Apple) originalApple.clone();

	            // ������ ������ ���
	            System.out.println("Original Apple: " + originalApple);
	            System.out.println("Cloned Apple: " + clonedApple);

	            // �������� ���� ����
	            clonedApple = new Apple("Green");

	            // ���� �� ���
	            System.out.println("Modified Cloned Apple: " + clonedApple);
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
		

	}

}
