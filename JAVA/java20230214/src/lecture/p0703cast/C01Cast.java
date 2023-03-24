package lecture.p0703cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
		
		Horse h1 = (Horse) a1; // 강제 형변환
		h1.run(); // ok
		
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim(); // xx
		
		Fish f1 = (Fish) a2;
		f1.swim();
	}
}

class Animal{
	public void breath(){
		System.out.println("호흡한다.");
	}
}
class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
	public void swim() {
		System.out.println("헤엄친다.");
	}
}
class Horse extends Animal{
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
	public void run() {
		System.out.println("달린다.");
	}
}
