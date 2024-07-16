package java0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {
		
	
		//	해싱은 해시 함수에 문자열 입력값을 넣어서 특정한 값으로 추출하는 것을 의미
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		
		// .put();  => key와 value를 저장할 수 있는 메서드
		
		map.put("이순신", 19990405); 
		map.put("김춘추", 19900101);
		map.put("장영실", 20110718);
		map.put("이도", 20051103);
		map.put("김춘추", 20091010);
		map.put("이성계", 19990405);
		
		// .putIfAbsent(); => 같은 키가 존재한다면 저장 하지 않고, 없다면 저장해주는 메서드
		
		map.putIfAbsent("장영실", 1222);  
		
		
		System.out.println(map);
		
		
	//  .println(참조변수.get("key") );  map은 index를 사용하지 않고 형태만 비슷, 불러올 key를 입력한다.
	//	key에 매칭되는 value 출력 
		
		System.out.println(map.get("이도") );    
		
		
		// value 수정 변경하고하 하는 key를 value를 수정하기에 key를 앞에, 변경하려면 value 내용을 뒤에 적는다. 
		
		map.replace("이성계", 19760505);
		
		//   .containsKey => 해당 HashMap에 특정 key가 존재하는지 확인할때 사용 true, false로 출력
		//   .containsValue => 해당 HashMap에 특정 Value가 존재하는지 확인할때 사용 true, false로 출력
		
		System.out.println(map.containsKey("김정호"));
		System.out.println(map.containsValue(1222));
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		//set  또는 collection 변환
		
		Set<String> keys	= map.keySet();
		
		System.out.println(keys);
		
		// map은 반복문을 사용할 수 없다.  사용하고자 한다면 map을 Set으로 변환 후 사용한다. 
		
		for(String name : keys) {
				System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
		
		// 키와 값을 하나로 합쳐서 출력할 때 사용  / 명령어에 대한 처리 
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet(); 
		System.out.println(entry);
		
		
		//  (매개변수 , 매개변수)  -> System.out.println(키 + " " + 값)); 
		// 별도의 변환 없이도 .forEach(); 사용가능 
		
		map.forEach((k,v) -> System.out.println(k+ " " + v));
		
		
		
		
		
		
		
		
		
		
	} 	//  end main

}	//	end HashMapStudy1

/*
		HashMap ( 이녀석은 Collection interface가 아니고 key와 value로 이루어진 Map interface다. ) 
		- 순차적으로 저장되지 않는다. 
		- Key : value 
		- Key 중복 혀옹 되지 않는다. 
		-value 중복 허용
		-Map은 색인 검색에 특화 되어있다.  (색인은 어떤 꾸러미에 들어있는 내용(Database)에 대한 지름길 정보를 가진 일종의 표)
		-메모리 공간을 많이 소비한다. 
		Key와 Value 두 가지를 사용하기 때문에 타입도  두 가지를 사용한다. 
*/