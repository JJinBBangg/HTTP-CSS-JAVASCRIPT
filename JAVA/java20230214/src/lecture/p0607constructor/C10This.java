package lecture.p0607constructor;

public class C10This {
	public static void main(String[] args) {
		MyClass10 o1= new MyClass10("son", 99, "01-02");
		MyClass10 o2= new MyClass10("park", 88);
		MyClass10 o3= new MyClass10("cha");
		
		o1.printField();
		o2.printField();
		o3.printField();
	}
}
