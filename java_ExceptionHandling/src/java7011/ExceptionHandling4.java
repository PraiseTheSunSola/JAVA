package java7011;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		// ���Ͽ� ����
		// ���۸� �̿��ؼ� �������� ����� �ӵ��� �����Ϳ� ������ ��Ȱ�� �ӽ� �����̴�. 
		
		//���� ó�� - �ڵ��ڿ���ȯ ����ϱ�
		// �ܼ�â�� �ѱ��� ������ ������ data ������ �ٸ��̸����� ����  �ϱ� ���� �ϴܿ� ���ڵ��� utf-8�̸� ANSI��, ANSI�� utf-8��
		
		// �Ʒ����� br.close(); �� ���� �ʾƵ� �˾Ƽ� �ݱⰡ �ȴ�. 
		
		try(BufferedReader br = new BufferedReader( new FileReader("c:/test2/data.txt")) ) 
		{
				String text = br.readLine();
				System.out.println( text);
		
		
		
		}catch(Exception e) {
			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
		}
		
		
		
		
		
		
		
		
		
		/*
		BufferedWriter br = null;
		try {
			
				br = new BufferedWriter(new FileWriter("c:/Test2/data.txt"));
				String name = "�ֶ�";
				br.write("�ֶ� 35 �ƽ������" + name.substring(10)); 	//  write�� �Ѵٰ� �ؼ� data ���Ͽ� ������ ������� �ʴ´�.  �޸𸮿� �Է��ѰŰ� �ϵ��ũ�� �����Ų�� �ƴϴ�. 
				
				br.close(); 
				
		}catch(Exception e) {
			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
			try {
			br.close(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		*/
			/*
			 br�� try ��Ȱȣ �ȿ� �ִ� ������������ br�� ������ ����. 
			 �� �� try catch�� �� ���������Ѵ�. �� ���� ���Ⱑ ���� �ʾ������� ����ؼ� 
			 �ٸ� �̷��Դ� �����ϴ� �ڵ��ڿ���ȯ�� ����ϸ� .close();  ���� �ʾƵ� �ݾ��� �� �ִ�. 
			 */
		
		
		
	}

}

/*
���� ó�� - �ڵ��ڿ���ȯ
���� �б�, ���⸦ �Ϸ��� ������ ������Ѵ�. 
������ ��� ����� �������� ���� �ڿ��� �ݳ��ؾ� �Ѵ�. 
���� �ݱ⸦ ����� �Ѵ�.  ���� ������ �޸� ��뷮�� �״���̰� �ٸ� �۾��� �� �޸𸮰� �������� �� �ִ�. 
�����ͺ��̽� �����͸� �����ϰų� �������� ������ �ߴٸ� �ݱ⸦ ������Ѵ�. 
������ �߻��ص� �ݾ�����Ѵ�. �޸� ȸ���� ���ؼ� 
*/