package lecture.p1405concurrency;

public class C02Concurrency {
	// synchronized 블럭 ( 동기화 블럭 )
	static int f1 = 0;
	static int field = 0;
	static int f2 = 0;

	public static void main(String[] args) {
		//intrinsic lock
		
		Object o = new Object();
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				f1++;
				synchronized (o) {
					field++;
				}
				f2++;
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				f1++;
				synchronized (o) {
					field++;
				}
				f2++;
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
		System.out.println(f1);
		System.out.println(field);
		System.out.println(f2);
	}
}
