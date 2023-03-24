package lecture.p0702polymorphism;

public class C09Polymorphism {
	public static void main(String[] args) {
		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();
		
		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();
		
		Weapon[] o5 = new Weapon[4];
		o5[0] = new Weapon();
		o5[1] = new Gun();
		o5[2] = new Bow();
		o5[3] = new Sword();
		
		o5[0].attack();
		o5[1].attack();
		o5[2].attack();
		o5[3].attack();
		
	}
}
