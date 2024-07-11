package java7011;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		// 파일에 쓰기
		// 버퍼를 이용해서 가져오는 방식은 속도나 데이터에 완충제 역활로 임시 공간이다. 
		
		//예외 처리 - 자동자원반환 사용하기
		// 콘솔창에 한글이 깨져서 나오면 data 파일을 다른이름으로 저장  하기 전에 하단에 인코딩을 utf-8이면 ANSI로, ANSI면 utf-8로
		
		// 아래에선 br.close(); 를 하지 않아도 알아서 닫기가 된다. 
		
		try(BufferedReader br = new BufferedReader( new FileReader("c:/test2/data.txt")) ) 
		{
				String text = br.readLine();
				System.out.println( text);
		
		
		
		}catch(Exception e) {
			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");
		}
		
		
		
		
		
		
		
		
		
		/*
		BufferedWriter br = null;
		try {
			
				br = new BufferedWriter(new FileWriter("c:/Test2/data.txt"));
				String name = "솔라";
				br.write("솔라 35 아스토라기사" + name.substring(10)); 	//  write만 한다고 해서 data 파일에 내용이 저장되진 않는다.  메모리에 입력한거고 하드디스크에 저장시킨건 아니다. 
				
				br.close(); 
				
		}catch(Exception e) {
			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");
			try {
			br.close(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		*/
			/*
			 br이 try 중활호 안에 있는 지역변수여서 br을 밖으로 뺀다. 
			 그 후 try catch를 또 만들어줘야한다. 왜 파일 열기가 되지 않았을때를 대비해서 
			 다만 이렇게는 복잡하니 자동자원반환을 사용하면 .close();  하지 않아도 닫아줄 수 있다. 
			 */
		
		
		
	}

}

/*
예외 처리 - 자동자원반환
파일 읽기, 쓰기를 하려면 파일을 열어야한다. 
파일을 열어서 사용이 끝났으면 사용된 자원을 반납해야 한다. 
파일 닫기를 해줘야 한다.  하지 않으면 메모리 사용량은 그대로이고 다른 작업할 때 메모리가 부족해질 수 있다. 
데이터베이스 데이터를 저장하거나 가져오는 행위를 했다면 닫기를 해줘야한다. 
오류가 발생해도 닫아줘야한다. 메모리 회수를 위해서 
*/