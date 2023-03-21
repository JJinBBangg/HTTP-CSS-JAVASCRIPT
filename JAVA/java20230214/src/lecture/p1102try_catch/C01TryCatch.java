package lecture.p1102try_catch;

public class C01TryCatch {
	public static void main(String[] args) {
		try {  // exception 발생할 수 있는 코드작성
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println(1);
		} catch(ArithmeticException e) {
			//발생한 exception을 잡아서 실행하는 코드
			
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(2);
		}
		System.out.println("Continue...");
	}

}
