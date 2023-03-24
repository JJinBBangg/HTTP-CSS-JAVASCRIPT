package lecture.p0602field;

public class C03field {
	public static void main(String[] args) {
		MyClass03 var1 = new MyClass03();
		MyClass03 var2 = new MyClass03();
		System.out.println(var1.name);
		System.out.println(var1.height);
		
		System.out.println(var2.name);
		System.out.println(var2.height);
		
		var1.name = "son";
		var2.height = 169;
		System.out.println(var1.name);
		System.out.println(var1.height);
		
		System.out.println(var2.name);
		System.out.println(var2.height);
		
		
	}
}
