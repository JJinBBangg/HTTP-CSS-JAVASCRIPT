package lecture.p1401thread;

public class C06Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread06());
		t1.start();
		while(true) {
			System.out.println("@@@@@@main thread@@@@@@@");
		}
	}
}

class MyThread06 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("##작업 스레드##");
		}
	}
}