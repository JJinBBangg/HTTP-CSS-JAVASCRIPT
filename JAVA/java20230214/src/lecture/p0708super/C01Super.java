package lecture.p0708super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
	}
}

class Super01 {
	// 이 클래스로 인스턴스 만들 때 해야하는 일(생성자 실행)
	Super01(){
		
	}
}

class Sub01 extends Super01 {
	Sub01(){
	// 이 클래스로 인스턴스 만들 때 해야하는 일
	// 상위 클래스 생성자 호출 코드
    //	System.out.println("어떤일.."); // 생성자 실행은 처음에 작성되어야함 
		super(); // 작성하지 않으면 컴파일러가 자동으로 삽입함.
		
	// 이전 상위 클래스 초기화를 우선으로 실시
		System.out.println("하위클래스 초기화 코드");
	}
}
