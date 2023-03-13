package ch16.sec04;

public class Person {
	public void action(Calculator calculator) {
		double result = calculator.cal(10, 4);
		System.out.println("결과 : "+result);
	}
}
