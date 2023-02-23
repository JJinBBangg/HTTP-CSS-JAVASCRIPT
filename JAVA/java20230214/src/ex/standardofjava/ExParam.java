package ex.standardofjava;

class Print1{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

public class ExParam {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("*");
		Print1 t1 = new Print1();
		t1.delimiter = "-";
		t1.a();
		t1.b();

		Print1.c("*");	
		
		Print1 t2 = new Print1();
		t2.delimiter = "*";
		t2.a();
		t2.b();

	}

}
