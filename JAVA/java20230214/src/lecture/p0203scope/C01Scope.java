package lecture.p0203scope;

public class C01Scope {
		public static void main(String[] args) {
			// 변수의 사용범위(Scope)
			// 선언된 블럭 안에서만 사용가능
			
			int v1 = 3;
			if(true) {
				System.out.println(v1);
				int v2 = 5;
				System.out.println(v2);
			}
//			System.out.println(v2); // xx
		}
}
