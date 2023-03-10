package lecture.p1301generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o1.handleItem();
		
//		MyClass08<String> o1 = new MyClass08<>("java");
	}
}

class MyClass08<T extends Number> {
	private T item;

	public MyClass08(T item) {
		this.item = item;
	}

	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);

		// item이 Number 또는 그 하위 타입이므로
		// Number 의 메소드를 실행할 수 있음.
		int i = item.intValue();
		double d = item.doubleValue();
		
//		if(item instanceof Number numItem) {
//			int i = numItem.intValue();
//			double d = numItem.doubleValue();
//		}
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
