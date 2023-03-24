package lecture.p1403join;

public class C01Join {
	public static void main(String[] args) {
		System.out.println("메인쓰레드 시작");
		Thread t = new Thread(() -> {
			System.out.println("쓰레드 시작");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("쓰레드 종료");
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // t 쓰레드가 끝나길 기다린 후 진행

		System.out.println("메인쓰레드 종료");

	}
}
