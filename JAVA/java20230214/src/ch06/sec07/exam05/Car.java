package ch06.sec07.exam05;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car(String model) {
		this(model, "흰색", 250);
	}

	Car(String model, String color) {
		this(model, color, 220);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
