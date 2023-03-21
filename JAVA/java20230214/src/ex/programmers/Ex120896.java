package ex.programmers;

import java.util.*;
import java.util.Map.*;

public class Ex120896 {
	public static void main(String[] args) {
		String s = "asdfasdf";
        String ans = "";
        String[] arr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for(String str : arr){
        	if(!map.containsKey(str)) {
        		map.put(str, 1);
        	}else {
        		map.put(str, map.get(str)+1);        		
        	}
        }
        Set<Entry<String, Integer>> entrys = map.entrySet();
        for(Map.Entry<String, Integer>entry : entrys) {
        	if(1 == entry.getValue()) {
        		ans += entry.getKey();
        	}
        }
		String[] arr1 = ans.split("");
		Arrays.sort(arr1);
		String answer = "";
		for(String r : arr1) {
			answer += r;
		}
	}
}
