package java0719;

public enum ThState {

	// ���� �̸����� �� ��  key == value 
	//  ������� Ŭ����ó�� ����� �� �ִ� ��� => Enum 
	
	NEW, RUNNABLE, BLOCKED,
	WATING, TIMED_WATING,
	TERMINATED
	
	/*
	int num;
	ThState(int num) {
			this.num= num;
	}
	
	int getNum() {
		return this.num;
	}
	
	*/
	
}	// ThState

/*
 
	final ������Ÿ�� ���� = ������ ����°� ���� 
	Enum��  ����ϸ� �� �����Ӱ� ����� �� ����
	
	�������� ������� �ѹ��� ������ �޼���� ��� �����ϴ°� ���� 
	
	���� ������� �������� �� ����
*/