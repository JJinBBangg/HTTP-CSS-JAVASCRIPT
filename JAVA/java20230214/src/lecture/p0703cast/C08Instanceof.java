package lecture.p0703cast;

public class C08Instanceof {
	public static void main(String[] args) {
		Super08 o1 = new Sub08();
		if(o1 instanceof Sub08) {
			Sub08 o2 = (Sub08) o1;
			// o2의 메소드 실행
		}
		//위코드블럭 생략
		//pattern matching for instanceof
		if (o1 instanceof Sub08 o2) {
			
		}
	}
}

class Super08 {

}

class Sub08 extends Super08 {

}
