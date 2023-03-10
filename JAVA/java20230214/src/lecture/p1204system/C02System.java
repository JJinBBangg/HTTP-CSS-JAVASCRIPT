package lecture.p1204system;

public class C02System {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long startNano= System.nanoTime();
		for (long i = 0; i < 10_000_000_000_000_000L; i++) {
			int r = 3 * 5;
		}
		long end = System.currentTimeMillis();
		long endNano= System.nanoTime();
		System.out.println(end - start);
		System.out.println(endNano-startNano);
	}
}
