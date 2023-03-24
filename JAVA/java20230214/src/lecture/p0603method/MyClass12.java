package lecture.p0603method;

public class MyClass12 {
	int method1() {

        // 1. 메소드 종료
		// 2. 오른쪽 값을 호출한 곳으로 return값 반환
		// return 뒤에 오는 값은 메소드 앞 리턴타입과 동일해야함
		return 3;
	}
	
	int method2() {
		// 메소드에 리턴타입을 명시하면
		// 해당타입의 값을 꼭 반환해야함
		if(true) {
			return 3;
		}
		return 5;
	}
	//자동형변환
	int method3() {
		int a = 3;
		return a;
	}
	int method4() {
		long a = 3;
		int b = 2;
//		return a;
		return b;
	}
	int method5() {
		short a = 600;
		return a;
	}
	double method6() {
		double d = 3.14;
		return d;
	}
	double method7() {
		long l = 30L;
		return l;
	}
	// 리턴이 없으면 void로 리턴타입을 명시
	void method8() {
//		return 3;
		return;  // 사용한다면 메소드 종료 목적으로만 사용가능
	}
}
