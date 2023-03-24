package lecture.p0304logical;

public class C02Logical {
	public static void main(String[] args) {
		// ^ xor : exclusive or(배타적 논리합)
		// 피연산자가 결과가 다르면 true
		// 같으면 false

		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(true ^ true); // false
		System.out.println(false ^ false); // false

		// & (and)
		// 피연산자가 모두 true이면 true
		// 나머지는 모두 false

		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false);// false

		// | (or)
		// 피연산자가 모두 false이면 true
		// 나머지는 모두 false

		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false);// false

	}
}

