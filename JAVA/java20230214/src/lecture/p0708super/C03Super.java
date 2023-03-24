package lecture.p0708super;

public class C03Super {

}

class Super03{
	Super03(int i) {
		
	}
}

class Sub03 extends Super03{
	Sub03() {
		//자동으로 삽입되는 상위 클래스 기본생성자 호출
		// 는 작동하지 않음(없어서)
//		super();
		// 따라서 명시적 호출해야함
		super(1);
	}
}
