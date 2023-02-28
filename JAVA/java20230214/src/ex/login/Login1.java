package ex.login;

import java.util.Map;
import java.util.Scanner;

public class Login1 {
	public static void login(Map<String, String> map, Scanner scan) {
		String id;
		String pwd;
		
		if (map.isEmpty()) {
			System.out.println("회원가입해라");
		} else {
			while (!map.isEmpty()) {
				System.out.println("아이디와 비밀번호를 입력해주세요.");
				System.out.print("아이디 : ");
				id = scan.nextLine();
				System.out.print("비밀번호 : ");
				pwd = scan.nextLine();
				System.out.println();

				if (map.containsKey(id)) {
					if (map.get(id).equals(pwd)) {
						System.out.println("로그인 되었습니다.");
						break;
					} else {
						System.out.println("비밀번호 오류. 다시 입력해주세요.");
					}
				} else {
					System.out.println("입력하신 아이디가 존재하지 않습니다.");
				}
			}
		}
//	            System.out.println("회원가입해라");
	}
}
