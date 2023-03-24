package lecture.p0805cast;

import java.io.*;
import java.lang.constant.*;

public class C04Instanceof {
	public static void main(String[] args) {
		String s = "java";
		
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof CharSequence);
		System.out.println(s instanceof Comparable);
		System.out.println(s instanceof Serializable);
		System.out.println(s instanceof Constable);
		System.out.println(s instanceof ConstantDesc);
	}
}
