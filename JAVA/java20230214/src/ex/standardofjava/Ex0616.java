package ex.standardofjava;


//
//class ac {
//	String i;
//	public void change(String i) {
//		this.i = i;
//	}
//}
//class c8 extends ac{
//	public void E (String str){
//		String a = str + "456";
//		super.i = a;
//	}
//}
//
//public class Ex0616 {
//	public static void main(String[] args) {
//		String str = "Asdf";
//		ac ac =  ();
//		
//	}
//}




class c8 {
	public String i(String r) {
		String a = r +"456";
		return a;
	}
}
class a2{
	public void change(String d) {
		c8 c8 = new c8();
		System.out.println(c8.i(d));
	}
}
public class Ex0616 {
	public static void main(String[] args) {
		String str = "Asdf";
		a2 a2 =  new a2();
		a2.change(str);
//		System.out.println(a2.change(str));	
	}
}
