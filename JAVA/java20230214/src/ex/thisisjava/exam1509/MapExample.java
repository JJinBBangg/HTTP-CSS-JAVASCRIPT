package ex.thisisjava.exam1509;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore=0;
		
		Set<String> keySet = map.keySet();
		for(String k : keySet) {
			int score = map.get(k);
			maxScore = Math.max(maxScore, score);
			if(maxScore == score) {
				name = k;
			}
			totalScore += score;
		}
		System.out.println("평균 점수 : " + totalScore / map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : "+ name);
	}
}
