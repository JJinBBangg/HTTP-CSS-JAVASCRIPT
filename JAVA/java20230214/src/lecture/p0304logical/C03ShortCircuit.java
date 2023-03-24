package lecture.p0304logical;

public class C03ShortCircuit {
	public static void main(String[] args) {
		// &&
		// true && true : true
		// true && false : false
		// false && true : false
		// false && false : false

		int x = 10;
		if ((x++ > 0) && (x++ < 100)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 0) && (x++ < 5)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) && (x++ < 200)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) && (x++ < 0)) {
			System.out.println("실행됨4");
		}
		System.out.println(x);
		
		//&&를 &로 바꾸면  ShortCircuit 일어나지 않아 모두 12로바뀜		
	}
}
