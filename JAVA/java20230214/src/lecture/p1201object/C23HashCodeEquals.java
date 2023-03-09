package lecture.p1201object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		// 중복을 허용하지않는 원소 모임(Collection)
		Set set = new HashSet();
		
		System.out.println(set.size());
		
		set.add(100);
		
		System.out.println(set.size());
		
		set.add(200);
		
		System.out.println(set.size());
		
		set.add(100);
		
		System.out.println(set.size());
		
		System.out.println(set.add(100)); // 이미 존재하므로 false 출력되고 추가하지않음.
	}
	
}
