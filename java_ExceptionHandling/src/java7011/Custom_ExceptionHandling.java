package java7011;

class PasswordException extends Exception {
	public PasswordException(String msg) {
				super(msg);
		}
}


public class Custom_ExceptionHandling {

	static void setPassword(String password) throws PasswordException{
			if(password == null)
				 throw new PasswordException("��й�ȣ�� �Է��ϼ���");
			if(password.length() < 8)
				throw new PasswordException("8�� �̻� �Է��ϼ���");
			if(password.matches("[a-zA-Z]+"))
				throw new PasswordException("��й�ȣ�� ���ڳ� Ư������ ����");
	}
			//�� if�� �߿� �ϳ��� ����(throw)�� �߻����� ������ ��й�ȣ �����ϱ�
			// return ���̵� �޼��� ������ �����Ų��. 
			// ����ڰ� ���� ����ó�� Ŭ������ �ݵ�� throw�� ������Ѵ�. 
	
	
	public static void main(String[] args) {
		// ����� ���� ����ó�� Ŭ���� �����
		try {
				setPassword( "dsdsdsa");
				
		}catch ( PasswordException e) {
				System.out.println(e.getMessage());
		}

	}

}
