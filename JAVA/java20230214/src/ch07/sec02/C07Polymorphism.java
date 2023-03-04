package ch07.sec02;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		Fish a3 = (Fish)a2;
		a2.a = 3;
		
		System.out.println(a3.a);
		a3.breath();
		System.out.println(a2.a);

		a1.breath();
		a2.breath();
//		Horse o1 = (Horse)new Animal(); 
//		o1.breath();
	}
}

class Animal{
	int a= 0;
	
	public void breath() {
		System.out.println("호흡한다.");
	}
}
class Horse extends Animal{
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}
class Fish extends Animal{

	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
}
