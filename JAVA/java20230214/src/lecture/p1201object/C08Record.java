package lecture.p1201object;

public class C08Record {
	public static void main(String[] args) {
		MyClass08 o = new MyClass08("son", 33);
		System.out.println(o);
		
		System.out.println(o.getName());
		System.out.println(o.getAge());
	}
}

class MyClass08 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyClass08 [name=" + name + ", age=" + age + "]";
	}

	public MyClass08(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
