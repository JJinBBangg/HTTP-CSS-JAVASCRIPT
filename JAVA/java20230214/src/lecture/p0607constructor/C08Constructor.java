package lecture.p0607constructor;

public class C08Constructor {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 33, "01-02", false);
		MyClass08 o2 = new MyClass08("park", 55, null, false);
		
		o2.birthDate = "01-24";
		
		MyClass08 o3 = new MyClass08("cha", 77, true);
		o3.birthDate = "03-04";
		
	}
}
