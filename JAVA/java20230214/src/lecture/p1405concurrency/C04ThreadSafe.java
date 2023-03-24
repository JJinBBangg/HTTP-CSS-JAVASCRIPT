package lecture.p1405concurrency;

import java.util.concurrent.atomic.*;

public class C04ThreadSafe {
	static int field = 0;
	static AtomicInteger atomicField = new AtomicInteger(0);

	public static void main(String[] args) {
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicField.getAndIncrement();
			}
		});
		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
				atomicField.getAndIncrement();
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
		System.out.println(field);
		System.out.println(atomicField);

	}
}
