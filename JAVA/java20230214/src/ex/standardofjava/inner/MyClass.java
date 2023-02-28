package ex.standardofjava.inner;


public class MyClass {  
	class InstanceInner{
		int iv= 100;
		StaticInner as = new StaticInner();
	}
	static class StaticInner{
		int iv = 100;
		static int cv  = 300;
		MyClass d= new MyClass();
		MyClass.InstanceInner ac = d.new InstanceInner();
		
	}
	static void myMyethod() {
		class localInner{
			int iv = 400;
		}
	}
}

	

