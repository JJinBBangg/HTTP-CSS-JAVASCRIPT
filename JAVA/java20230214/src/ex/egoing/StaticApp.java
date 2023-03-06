package ex.egoing;
class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar); // Error
	}
	
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // Ok
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
//		Foo.instanceMethod(); // Error
		
        Foo f1 = new Foo();
        Foo f2 = new Foo();
      
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
      
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
      
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
        
		// instance 생성 시 
		// class에서 class 소속 소스 사용가능하나
		// 수정 시 class 에서도 수정됨
		// class에서 instance 소속 소스들은 복제 되어 instance에서 
		// 수정 하여도 class 파일에 영향을 미치지 않고 자유롭게 수정하여 사용가능
	}
}
