package ex.standardofjava;

class Car {
	String color;
	String gearType;
	int door;
	Car(String c, String t, int d) {
		 color = c;
		 gearType = t;
		 door = d;
	}
	Car(String c, String t) {
		 color = c;
		 gearType = t;
	}
	Car(){
		this("red", "auto");
	}
}


public class exSanSungThis {
	public static void main(String[] args) {
		Car m = new Car();
		System.out.println(m.color);
		}
}
