package lecture.p1102try_catch;

public class C08MultipleExample {
	public static void main(String[] args) {
		try {
			//여러 exception 발생가능
			
		} catch (RuntimeException e) {  
			e.printStackTrace();
			// 아래catch 블럭의 exception 보다 
			// 상위 타입의 exception catch 블럭을 먼저 작성하면 안된다.
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//			
//		} catch (ClassCastException e) {
//			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("continue...");
	}
}
