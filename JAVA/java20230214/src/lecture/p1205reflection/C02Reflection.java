package lecture.p1205reflection;

import java.lang.reflect.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;

		// 이름(full name)
		System.out.println(class1.getName());

		// 이름(simple)
		System.out.println(class1.getSimpleName());

		// 패키지 정보
		System.out.println(class1.getPackageName());

		// 생성자 확인
		Constructor[] constructors = class1.getConstructors();

		// 필드
		Field[] fields = class1.getFields();

		// 메소드
		Method[] methods = class1.getMethods();
	}
}
