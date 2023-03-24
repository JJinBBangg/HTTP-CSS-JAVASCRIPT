package lecture.p0703cast;

public class C09Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
		
	}
	public static void action(Animal a) {
		a.breath();
		if(a instanceof Horse h) {
			h.run();
		} else if( a instanceof Fish f) {
			f.swim();
		} else {
			System.out.println("말도 물고기도 아닙니다.");
		}
	}
}

