package java0716;

import java.util.TreeMap;

public class TreeMap_study {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(15));
		System.out.println(tree.floorKey(33));
		System.out.println(tree.floorEntry(15));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
		// .floorKey()는 찾고자 하는것과 같거나 보다 작은 키를 출력함.
		// .floorEntry()는 찾고자 하는것과 같거나 보다 작은 키와 값을 출력함.
		// 나머지 메서드 설명은 구글에서 찾아서 이곳에 적자 
	}

}
/*
 		정렬과 검색을 하고자 할 때 TreeMap을 사용함.
 		입력한 키보다 작은것에 해당할 때 정렬함.
 		
 */

