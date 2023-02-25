package ex.programmers;

public class Ex120956 {
	public static void main(String[] args) {
		String[] babbling = { "aya", "yee", "u", "maa", "wyeoo" };

		int answer = babbling.length;
		String[] a = new String[babbling.length];
		for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].contains("aya")) {
				babbling[i] = babbling[i].replace("aya", " ");
			}
			if (babbling[i].contains("ye")) {
				babbling[i] = babbling[i].replace("ye", " ");
			}
			if (babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("woo", " ");
			}
			if (babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("ma", " ");
			}
			if (babbling[i].matches(".*[a-z].*")) {
				answer--;
			}
		}
		System.out.println(answer);
//		return answer;
	}

}
