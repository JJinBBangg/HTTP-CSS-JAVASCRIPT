package lecture.p0508regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = "     asd      sd          sd       sd ";
		String str2 = str1.replaceAll("\\s", "");
		System.out.println(str1);
		System.out.println(str2);
	
		String str3 = "sdfsdf , dsf dsf sdf   ,     sdfsdf";
		String[] str4 = str3.split("\s*,\s*");
		System.out.println(Arrays.toString(str4));
	}
}
