package java0716;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudy3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> url = new HashMap <> ();
		url.put(1, "login"); 		url.put(2, "signup");
		url.put(3, "notice_view"); 	url.put(4, "notice_write");
		
		
		
		
		// �� ����Ʈ���� ����ڰ� ���ϴ� �������� ���� �� ��û ó��
		HashMap<String, PageAction> map = new HashMap<>();
		
		map.put("login", new Login());
		map.put("notice_write", new NoticeWrite());
		map.put("signup", new SignUp());
		map.put("notice_view", new NoticeView());
		
		
		// ����Ʈ�� �޴��� �����ϰ� ����ڰ� �����ϸ� �ش� �޴� �������� �����ش�. 
		
		Scanner sun = new Scanner(System.in);
		
		System.out.println("=== �ڹ� ������ ����Ʈ ===");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. �� ����");
		System.out.println("4. �� �ۼ�");
		
		
		System.out.print("�޴� ���� : ");
		int menu = sun.nextInt();
		String cmd = null;
		
		
		/* 
		 �Ʒ��� ���� �������� ���� ��û�� ���� ó���� ���� �� ������ �������� 
		���� �þ�� �ڵ��� �絵 �þ�� �������� �������⿡ ���� ���� ����ȭ ���ش�. 
		
		String cmd = null;
		if(menu == 1) {
			cmd = "login";
		}else if (menu == 2) {
			cmd = "signup";
		}else if (menu == 3) {
			cmd = "notice_view";
		}else if (menu == 4) {
			cmd = "notice_write";
		}
		
		*/
		
		
		// ���� �ٸ� �� ���� Ŭ������ �������̽��� ��� cmd�� �����ϰ� .action(); ���� �����Ѵ�. 
		
		cmd = url.get(menu);
		
		PageAction obj = map.get(cmd);
		String view = obj.action();
		System.out.println(view);
		
		
		
		
	}	// end main

}	// HashMapStudy3
