package lecture.p1401thread;

public class C05Thread {
	public static void main(String[] args) {
		MyThread5 t1 = new MyThread5();
		t1.start();
		while(true) {
			System.out.println("@@@@@@main thread@@@@@@");
		}
	}
}
// thread 만드는 두번째 방법
// thread 클래스 상송
// run메소드 재정의
class MyThread5 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("####쓰레드 작업중####");
		}
	}
}
