package lecture.p1301generic;

import java.util.*;

public class C07Bounded {
	public static void main(String[] args) {
		
		MyClass07<String> o1 = new MyClass07<>();
		o1.setItem("java");
		o1.printItem();
		
		MyClass07<Scanner> o2 = new MyClass07<>();
		o2.setItem(new Scanner(""));
		o2.printItem();
	}
}

class MyClass07<T> {
	private T item;

	public void printItem() {
		// Object의 메소드 안전하게 실행가능
		// 왜냐하면 Object는 모든클래스의 조상클래스이기때문
		String str = item.toString();
		int hashCode = item.hashCode();
		boolean eqauls = item.equals(null);
		
		System.out.println(str+hashCode+eqauls);
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
