package ch12.sec12;

import java.lang.reflect.*;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			printLine(printAnnotation);
			
			method.invoke(new Service());
			
			printLine(printAnnotation);
		}
	}
	public static void printLine(PrintAnnotation printAnnotation) {
			int number = printAnnotation.number();
		if(printAnnotation != null) {
			String value = printAnnotation.value();
			System.out.println(value);
		}
		System.out.println();
	}
}
