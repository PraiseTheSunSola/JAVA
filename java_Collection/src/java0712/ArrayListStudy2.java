package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		/*
		 우리은행, 1004-91-123455, 이순신, 3450000
		 농협, 34-123-349393, 김유신 513350
		 신한은행, 394-3412-2323, 박팽년, 891003
		 국민은행, 39-2384-19939, 최무선, 899900
		 우리은행, 1002-93-878888, 문익점, 28300
		 신한은행, 293-0123-1234, 이율곡, 98000
		 우리은행, 1006-23-123456, 김시민, 1920000
		 국민은행, 23-2555-29991, 이율곡, 932000
		 */
		
		/*
		 		문제1. 우리은행을 이용하는 사람들 정보만 출력
		 		문제2. 잔액이 100만원인 사람들 정보만 출력
		 		문제3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고 
		 				   없으면 우리은행 계좌 개설(1007-23-128954)
		 */
		
		
		ArrayList<Asset> customer = new ArrayList <>();
		
		
		customer.add(new Asset("우리은행", 3450000, "1004-91-123455","이순신"));
		customer.add(new Asset("농협", 513350, "34-123-349393", "김유신" ));
		customer.add(new Asset("신한은행", 891003, "394-3412-2323", "박팽년"));
		customer.add(new Asset("국민은행", 899900, "39-2384-19939", "최무선"));
		customer.add(new Asset("우리은행", 28300, "1002-93-878888", "문익점"));
		customer.add(new Asset("신한은행", 98000, "293-0123-1234", "이율곡"));
		customer.add(new Asset("우리은행", 1920000, "1006-23-123456","김시민"));
		customer.add(new Asset("국민은행", 932000, "23-2555-29991", "이율곡"));
		
		
		// 문제1. 우리은행을 이용하는 사람들 정보만 출력
		System.out.println(" === 우리 은행 고객만 출력 ====");
		for( Asset 우리 : customer) {
			if(우리.getBank().equals("우리은행")) {
				System.out.println(우리);
			}
				
		}
		
		//  문제2. 잔액이 100만원인 사람들 정보만 출력
		System.out.println(" === 잔액이 100만원인 사람들 정보만 출력 ====");
		customer.forEach(백만 -> {
			if(백만.getBalance() >= 1000000) {
				System.out.println(백만);
			}
		});
		
		
		/*문제3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고 
		     		   없으면 우리은행 계좌 개설(1007-23-128954)
		 */
		
		System.out.println(" === 잔액이 100만원인 사람들 정보만 출력 ====");
		
		Asset asset = new Asset("우리은행", 0, "1007-23-128954", "최무선");
		if( !customer.contains(asset) ) {
			customer.add(asset);
		}
		
		customer.forEach(info -> System.out.println(info));
		
		
		
	}

}
