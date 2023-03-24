package lecture.p0603method;

public class MyClass09 {
	void method1() {
		System.out.println("파라미터 없는 메소드");
	}

	void method1(int i) {
		System.out.println("정수 파라미터 1개 받는 메소드");
	}

	void method1(int i, int j) {
		System.out.println("정수 파라미터 2개 받는 메소드");
	}

	void method2(int[] i) {
		for (int arg : i) {
			System.out.println("받는 파라미터" + arg);
		}
	}

	// 가변 길이 아규먼트(varargs)
	void method3(int... args) {
		// args를 배열로 사용
		for (int arg : args) {
			System.out.println("가변길이 파라미터 : " + arg);
		}
	}

	// 가변길이 매개변수는 파라미터 목록에서 가장 오른쪽에 작성해야함
	void method4(String param, double d, int... value) {
		for (int a : value) {
			System.out.println(param + d + a);
		}
	}

}
