package lecture.p0603method;

public class MyClass11 {
	void mrthod1() {
		System.out.println("실행문1");
		System.out.println("실행문2");

		return; // 메소드를 종료
//		System.out.println("실행문3"); 
	}
	
	void method2() {
		System.out.println(1);
		if(true) {
			return;
		}
		System.out.println(2);
	}

}
