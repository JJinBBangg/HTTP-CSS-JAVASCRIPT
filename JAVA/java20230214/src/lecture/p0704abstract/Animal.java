package lecture.p0704abstract;

// 추상클래스 (abstract class)
// 이클래스로는 인스턴스를 만들 수 없음
public abstract class Animal {
	public void see() {
		System.out.println("눈으로 봅니다.");
	}
	// 추상메소드(abstract method)
	// 몸통(body)없는 메소드
	// 추상메서드가 있는 클래스는 추상클래스여야함.
	// 상속 받은 클래스에서 꼭 Override 해야함.
	public abstract void breath();	
	
}
