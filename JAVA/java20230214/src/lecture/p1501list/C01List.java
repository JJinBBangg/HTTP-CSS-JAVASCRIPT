package lecture.p1501list;

import java.util.*;

import javax.swing.plaf.synth.*;

public class C01List {
	// java.util.List
	// 순서가 있는 콜렉션
	// 각 요소(element, 원소)는 index로 접근가능
	
	public static void main(String[] args) {
		//새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		// element 추가
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		// element 얻기
		String str1 = list.get(0);
		String str2 = list.get(1);
		String str3 = list.get(2);
		String str4 = list.get(3);
		
		// list 크기
		int size = list.size(); 
		
		// 특정 index의 element 지우기
		list.remove(2);
		
		System.out.println("지운 후 크기 : "+ list.size());  // 3
		System.out.println("지운 후 2번 index : "+ list.get(2)); // 3번 index 였던 "java"가 2번 index로 저장
		
		list.set(2, "react");		
	}
}
		
	// 컬렉션(collection)
	// 여러 객체를 모아 놓은 것

	// 프레임 웍(framework)
	// 표준화, 정형화된 체계적인 프로그램 방식
	
	// library (기능 제공) : JavaAPI 등
	
	// 컬렉션 프레임웍(collection framework)
	// 컬렉션을 다루기 위한 표준화된 프로그래밍 방식
	// 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스 제공
	
	// 컬렉션 클래스(collection class)
	// List, Set, Map는 interface
	// 다수의 데이터를 저장할 수 있는 클래스 예)Vector, ArrayList, HashSet
	
	// 1.List
	// 순서가 있는 데이터의 집합, 데이터의 중복을 허용
	// 구현 클래스 : ArrayList, LinkedList, Stack, Vetor 등
	
	// 2.Set 
	// 순서를 유지하지 않는 집합, 데이터의 중복을 허용하지 않음
	// 구현 클래스 : HashSet, TreeSet
	  
	// 3. Map
	// 키(Key)와 값(value)의 쌍으로 이루어진 데이터 집합
	// 순서가 없고 키(Key)는 중복허용X, 값(value)는 중복허용 
	// 예 ) id와 password, 지역명과 지역번호(02 서울)
	// 구현 클래스 : HashMap, TreeMap, Hashtable, Properties 등
	
	// Collection
	// List Set 공통부분을 뽑아서 Collection 

