package java0708;

import java.util.Scanner;

public class DbTest {

	static Scanner sun= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Dao dao = new Dao();
		
	switch () {
	case 1:
		
	
		System.out.print("�л� �̸� : ");
		String name = sun.nextLine();
		
		System.out.print("���� ���� : ");
		int kor = sun.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sun.nextInt();
		
		System.out.print("���� ���� : ");
		int mat = sun.nextInt();
		
		Member member = new Member(name,kor,eng,mat);
		// new�� ���� ������� ��ü�� �޼ҵ� ������ �Ϸ�ǵ� �������� �ʰ� ���α׷��� ����� �� ���� ���� �ȴ�. ( �޸𸮿���)
		
		
		total_avg(member);
		System.out.println(member);
		
		// �����ͺ��̽��� ���� 
		
		dao.insert(member);
		break;
		
	case 2: // ������ ���� ���
		break;
	}
		
	} // end mian

	// ���� �޸� ������ ����ϰ� �ֱ⿡ �Ʒ��� �޼���� return�� �ʿ䰡 ����.
	static void total_avg(Member m) {
		int total = m.getKor() + m.getEng() + m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
		
	}
	
}//  DbTest end 
