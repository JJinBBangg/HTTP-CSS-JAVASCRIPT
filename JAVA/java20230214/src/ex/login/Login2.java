package ex.login;

import java.util.Map;
import java.util.Scanner;

public class Login2 {
	public static void signIn(Map<String, String> map, Scanner scan) {
		String id;
		String pwd;
		System.out.println("아이디를 입력해주세요.4~10");
		id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.4~10");
		pwd = scan.nextLine();
		if ((4 <= id.length() && id.length() <= 10) && (4 <= pwd.length() && pwd.length() < 10)) {
			if (!map.containsKey(id)) {
				map.put(id, pwd);
				System.out.println("회원가입 성공");
				
			} else {
				System.out.println("중복 아이디");
			}

		} else {
			System.out.println("글자수 확인");
		}
	}
}