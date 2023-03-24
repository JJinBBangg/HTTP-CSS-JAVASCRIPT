package lecture.p1402thread;

public class C01Sleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("메인쓰레드 시작");
		Thread.sleep(2000);
		System.out.println("메인쓰레드 종료");
	}
}
