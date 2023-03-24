package ch15.sec04.exam02;

import java.security.KeyStore.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

public class HashtableExample {
	public static void main(String[] args) {
//		Map<String, Integer> map = new Hashtable<>();
		Map<String, Integer> map = new ConcurrentHashMap<>();
		
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int size = map.size();
		System.out.println("총 엔트리 수 : "+ size);
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for(Entry<String, Integer> entry : entrys) {
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());  // 순서가 없음.
		}
	}
}
