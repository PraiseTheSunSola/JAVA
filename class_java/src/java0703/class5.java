package java0703;

public class class5 {

	public static void main(String[] args) {
		
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		
		System.out.println(num);
		
		
	}

}



class ReturnMth {
	
	int get() {
		
		return 10;
	}
	
	
	
	
	
} // ReturnMth