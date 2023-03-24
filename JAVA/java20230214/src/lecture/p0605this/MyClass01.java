package lecture.p0605this;

public class MyClass01 {
	String name;

	void printName() {
		System.out.println(this.name);
		System.out.println(this.now());
	}

	String now() {
		return "세시 십분";
	}
}
