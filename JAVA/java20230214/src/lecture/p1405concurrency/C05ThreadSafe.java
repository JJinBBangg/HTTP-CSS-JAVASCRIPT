package lecture.p1405concurrency;

import java.util.*;

public class C05ThreadSafe {
	static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) {
		Thread a = new Thread(() -> {
			for(int i =0; i<10000; i++) {
				list.add(1000);
				list.remove(0);
			}
		});
		Thread b = new Thread(() -> {
			for(int i =0; i<10000; i++) {
				list.add(2000);
				list.remove(0);
			}
		});
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.toString());
	}
}
