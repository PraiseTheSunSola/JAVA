package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class class3 {

	public static void main(String[] args) {
		
		Member member1 = new Member("�̼���", 31, "����");
		Member member2 = new Member("������", 29, "���������");
		Member member3 = new Member("�念��", 45, "�߸�");
		// �¾ �⵵
		
		
		// �⵵ - 	.getYear();
		// �� - 		.getMonthValue();
		// �� - 		.getDayOfMonth(); 
		// ���� - 	.getDayOfWeek().getValue();
		// 1(������), 2(ȭ����), ... , 7(�Ͽ���)
		
		
		// ��ó�� �ص� ���������� ������ �ڱ� �ڽſ��� ����� �����̴�. �׷��� �̰��� �ٲٱ� ���� this�� ����Ѵ�.
		// �׷��� void birth�� �ν��Ͻ� �޼��� �Ķ�̴�((	)) ���� ���� �Ű����� �ڸ��� this�� �ִ´�. 
		// member1.birth(member1); ->  member1.birth( ); �� ����� �ȴ�. 
		
		member1.birth(	);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// �߻� Ŭ���� = ��ü�� ������ �� �ϴ� Ŭ����  = new �����ڸ� ������� �� ��
		// ������ ��ü �ȿ� ���Ĺ� C�� ����ִ� �͸� ��ü ���� �� ����.
		// Ŭ���� ������ Ŭ���� �̸����� �ҷ����°� ������.
		
		
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int �� = cal.get( Calendar.MONTH) + 1; 
//		int �� = cal.get(Calendar.DAY_OF_MONTH);
//		int ���� = cal.get(Calendar.DAY_OF_WEEK); // �Ͽ����� 1���� ������
		
		
//		System.out.println( year);
		
//		Date today = new Date();
//		System.out.println(today.get); 	//getYear ���� ��� ��������� �ƴϴ�.
		
		
		
		
		
	}

}

class Member {
		String name;	 // �̸�
		int age;		// ����
	    String job;	//����
	    // �⺻ �����ڸ޼���
	    Member() {
	    	// �Ű������� �ִ� ������ �޼��� 
	    }
	    
	    Member( String name, int age, String job) {
	    	this.name= name;
	    	this.age=age;
	    	this.job=job;
	    }
	    
	    // �¾ �⵵ �����ΰ� ����ϴ� �޼��� 
	    // ���� ���ٰ� ǥ�����ִ� ������Ÿ�� = void;
	    
	    void birth(	) {
	    	
			LocalDate today = LocalDate.now();		
			int nowYear = today.getYear();
			// ȭ�� ��� - �̼��� �¾ �⵵ : 0000��
			
			int birthYear1 = nowYear -this.age;
			System.out.printf("%s �¾ �⵵ : %d�� \n", this.name, birthYear1);
	    }
	    
}


// �޼��峪 �Լ��� ����ϴ� ���� 
// �迭, ��� - �ݺ��� - �ܼ� ���
//�޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ��������.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�. 
// ���� �� �⺻ ������ ��� ���� �ͼ������ٸ� �� �Ŀ� ���ȭ ��Ű�� ������ �ؾ��Ѵ�. (�ڵ带 ��ɺ� �������� �и��ؼ� �����)
// 