package lecture.p1602lambda;

public class C02Lambda {
	public static void main(String[] args) {
		// 파라미터가 없으면 빈() 사용
		// 메소드 body는 {};
		
		MyInterface02 o1 = () -> {
			//메소드 body
			System.out.println("메소드 body 작성");
		};
		o1.method();
		// 메소드의 명령문이 하나이면 중괄호 생략가능
		
		MyInterface02 o2 = () -> {
			//메소드 body
			System.out.println("명령문이 여러개1");
			System.out.println("명령문이 여러개2");
		};
		
		// 생략가능하면 생략!
		// 중괄호 생략가능 시 생략하는 것이 해석하기에 용의함.
		MyInterface02 o3 = () -> System.out.println("명령문 하나");
		
	}
}

@FunctionalInterface
interface MyInterface02 {
	void method();
}