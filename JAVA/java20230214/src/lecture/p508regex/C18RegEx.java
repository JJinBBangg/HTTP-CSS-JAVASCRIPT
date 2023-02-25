package lecture.p508regex;

public class C18RegEx {
	public static void main(String[] args) {
		// 특수기호...
		String my_string = "nice to meet you";
		String answer = "";
		String[] str = { "a", "e", "i", "o", "u" };
		for (String a : str) {
			answer = my_string.replaceAll(a, "");
		}
		System.out.println(answer);
	}
}
