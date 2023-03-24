package lecture.p0605this;

public class MyClass02 {
	String name;
	String name1;

	void printName(String name) {
		this.name = name;
		String name1 = "park";
		System.out.println(name1);
		System.out.println(this.name1);
	}
	void setName(String name) {
		this.name = name;
	}

}
