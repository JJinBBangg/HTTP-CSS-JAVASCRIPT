package lecture.p0702polymorphism;

public class C08Polymorphism {
	public static void main(String[] args) {
		Gun o1 = getGun();
		Weapon o2 = getGun();
		Weapon o3 = getBow();
		Weapon o4 = getSword();
		
		o2.attack();
		o3.attack();
		o4.attack();
	}
	
	public static Gun getGun() {
		return new Gun();
	}
	public static Bow getBow() {
		return new Bow();		
	}
	public static Sword getSword() {
		return new Sword();		
	}
}
