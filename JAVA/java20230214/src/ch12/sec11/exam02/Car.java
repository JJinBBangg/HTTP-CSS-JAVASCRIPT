package ch12.sec11.exam02;

public class Car {
	private String model;
	private String owner;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", owner=" + owner + "]";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
