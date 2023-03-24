package lecture.p0611capsule;

public class MyClass01 {
	private int age;
	
	void setAge(int age) {
		if(age < 0) {
			this.age = 0;
			return;
		}
		this.age = age;
	}
	public void desc() {
		System.out.println("나이는 " + this.age + "입니다.");
	}
}
