package lecture.p0607constructor;

public class MyClass02 {
	String model;
	int price;
	
	// 인스턴스 만들때 해야하는일
	// 생성자(constructor)
	// 주로 필드 초기화
	
	//생성자 이름은 클래스 명과 같다
	MyClass02(){ // 생성자
		System.out.println("인스턴스 만들 때 해야하는 일들");
	}
	
	void desc() {
		System.out.println(model+"모델 가격은 "+price+"원");
	}
}
