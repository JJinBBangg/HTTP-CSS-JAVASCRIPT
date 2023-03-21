package ex.thisisjava.exam1107;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws Exception {
		if (!id.equals("blue")) {
			throw new NotExistIDException(id+"아이디가 존재하지 않습니다.");
		}

		if (!password.equals("12345")) {
			throw new NotExistIDException("비밀번호가 일치하지 않습니다.");
		}
	System.out.println("blue 계정으로 로그인에 성공했습니다.");
	}
}

class NotExistIDException extends Exception {


	public NotExistIDException() {
		super();
	}

	public NotExistIDException(String message) {
		super(message);
	}

}

class WrongPasswordException extends Exception {

	public WrongPasswordException() {
		super();
	}

	public WrongPasswordException(String message) {
		super(message);
	}

}