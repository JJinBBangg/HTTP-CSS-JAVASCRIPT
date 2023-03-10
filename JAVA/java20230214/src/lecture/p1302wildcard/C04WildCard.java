package lecture.p1302wildcard;

public class C04WildCard {
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
		
	}

	public static void printItem(MyClass04<? extends Number> param) {
		Number num1 = param.getItem();
		System.out.println(num1.doubleValue());
		Object num2 = param.getItem();
	}
}

class MyClass04<T> {
	public T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}