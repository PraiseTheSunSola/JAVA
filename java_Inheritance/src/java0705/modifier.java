package java0705;

public class modifier {
	
	public static void main(String[] args) {
		
		// �������� ���� �̸����� �����ϴ°� �ƴ� �޼��� �̸����� �����Ѵ�. 
		
		
		Book book = new Book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		
		System.out.println(book.getTitle());
		
		Book book2 = new Book("JAVA, ��, ������", "�̺���", 564);
		
		System.out.println( book2);
		
		
		
		
	}
}
