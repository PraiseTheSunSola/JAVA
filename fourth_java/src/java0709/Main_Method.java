package java0709;

public class Main_Method {

	public static void main(String[] args) {
		
		// ��� ���踦 ���� �� �ϴ� ���¿��� �������� �����Ϸ��� �������̽��� ����Ѵ�.
		move d = new dog();
		move c = new cat();
		d.moving();
		c.moving();
	}

}
class dog implements move {
	@Override
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}
class cat implements move {
	@Override
	public void moving() {
		System.out.println("��� ��� �̵��Ѵ�.");
	}
}

interface move {
	static int a= 10;
	public void moving();
}

/* 
	�������̽� - �߻�Ŭ������ �� ����
		- �߻�޼��常 ����
		- �ν��Ͻ����� �Ұ���
		- (8���� ���ĺ���) static ����, static �޼��� ���� ����
		- ��ü �����Ұ�
		- Ŭ�����鿡 ����Ǿ� ���ȴ�. 
		- ������ ������ ���� ����Ѵ�. 
		- ���α׷��� �⺻Ʋ�� ������ �� �ִ�. 
		
		�������� Ŭ���̾�Ʈ���� �������� �����Ѵ�. 
		Ŭ���̾�Ʈ�� ��û�� �޾��ִ� �޼���
		Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼��� 
		
		interface�� �������� Ŭ�������� interface�� ������ �ִ� �߻�Ŭ������ ����������Ѵ�.
 */