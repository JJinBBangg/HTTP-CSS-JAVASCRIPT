package ex.thisisjava.exam1302;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<>();
		container1.setValue("홍길동");
		String str = container1.getValue();
		
		Container<Integer> container2 = new Container<>();
		container2.setValue(3);
		int i = container2.getValue();
		
	}
}
