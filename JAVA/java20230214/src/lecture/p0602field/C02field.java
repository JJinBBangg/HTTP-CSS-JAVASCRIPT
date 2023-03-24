package lecture.p0602field;

public class C02field {
	public static void main(String[] args) {
		MyClass02 var1 = new MyClass02();
		
//		int a;
//		System.out.println(a);   초기화하지 않은 변수는 사용할 수 없음
		
		System.out.println(var1.age);
		System.out.println(var1.married);
		System.out.println(var1.name);
	}
}
