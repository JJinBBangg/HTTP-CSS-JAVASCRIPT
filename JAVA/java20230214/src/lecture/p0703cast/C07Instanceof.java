package lecture.p0703cast;

public class C07Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
	}
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Horse) {
			Horse h = (Horse) a;
			h.run();
		} else if (a instanceof Fish) {
			Fish f = (Fish) a;
			f.swim();
		}else {
			System.out.println("말도 아니고 물고기도 아닙니다.");
		}
		
	}
}
