package lecture.p0604static;

public class MyClass03 {
	String name;

	void hello() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("오늘은"+ now() + "입니다.");
	}

	String now() {
		return "2030년2월28일";
	}
}
