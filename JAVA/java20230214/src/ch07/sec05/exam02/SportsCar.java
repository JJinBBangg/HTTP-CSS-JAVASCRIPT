package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
	}
	// final method는 Override 불가능
//	@Override
//	public void stop() {
//		System.out.println("스포츠 카를 멈춤");
//		speed = 0;
//	}
}
