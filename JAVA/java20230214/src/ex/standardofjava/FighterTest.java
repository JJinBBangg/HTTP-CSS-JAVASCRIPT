package ex.standardofjava;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable {
	void move(int x, int y); // public abstract 생략됨(상속 받은 클래스에서 사용해야함 )

	void attack(Fightable f);
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { //오버라이딩 규칙 : 조상(public)보다 자손에서 좁은 범위의 접근제어자 사용불가
		System.out.println("[" + x + "," + y + "]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
		
	} 
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}

}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100,200);
		f.attack(new Fighter());
		f.stop();
		
		
		Unit i = new Fighter();
		i.move(123, 345);
//		i.attack(); // Unit에 attack()없어서 사용불가
	}
}
