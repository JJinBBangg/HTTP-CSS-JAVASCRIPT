package lecture.p1405concurrency;

public class C01Concurrency {
	static int field;

	public static void main(String[] args) {
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}
		}, "Thread A");

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}

		}, "Thread B");

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// * 여러 쓰레드가 
		//  하나의 객체 상태를 변경하려고할 때 
		//  주의해서 코드를 작성해야한다.
		
		//해결책1 : 여러 쓰레드가 하나의 객체 상태를 변경하는 코드를
		//         작성하지 않는다.
		
		System.out.println(field);
	}
}
