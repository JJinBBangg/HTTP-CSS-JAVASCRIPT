package lecture.p1104throw;

public class C01Throw {
	public static void main(String[] args) throws Throwable{
		// Throwalbe 타입의 객체를 던질 수 있음.
		Throwable a = new Exception();
		
		throw a;
	}
}
