package lecture.p1404name;

public class C04Name {
	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			System.out.println(Thread.currentThread());
		}, "작업쓰레드1");
		t1.start();
	}
}
