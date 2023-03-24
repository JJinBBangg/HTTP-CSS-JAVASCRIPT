package lecture.p0902anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의
	// 지역변수(파라미터)를 사용할 수 있다.
	// 이때 이 지역변수(파라미터는) final이어야한다.

	public static void main(String[] args) {
		final int i = 10;
		class LocalClass {
			void method1() {
				System.out.println(i); // final인 지역변수만 사용가능
			}
		}
	}
	
	public void method1() {
		int i = 1;  // XX -> effectively final 값을 1번만 할당해서 사실상 final과 같음.
		
 		class LocalClass{
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	public void method2(final int param) {
		class LocalClass{
			void method3() {
				System.out.println(param);
			}
		}
	}
	
	public void method3(int param) {  
//		param = 3; // final 로 사용되지 않으면 로컬클래스에서 사용불가능
		class LocalClass{
			void method4() {
				System.out.println(param);// 메소드 호출 시 값을 1번만 받으면 final 아니여도 사용가능
			}
		}
	}
}
