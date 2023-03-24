package lecture.p0703cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish());
		System.out.println("실행흐름 이어감...");
	}

	public static void method1(Animal a) {
		a.breath();
		if (a instanceof Horse) {
			Horse h = (Horse) a;
			h.run();
		}
	}
}
