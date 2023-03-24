package lecture.p1404name;

public class C03Name {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
		});
		t1.setName("작업쓰레드1");
		t1.start();
	}
}
