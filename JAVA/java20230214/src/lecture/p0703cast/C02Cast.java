package lecture.p0703cast;

public class C02Cast {
	public static void main(String[] args) {
		Super02 o1 = new Sub02();
		
		Sub02 o2 = (Sub02) o1;
		
//		Sub02 o3 = (Sub02) new Super02(); //exception 발생
		
	}
}

class Super02 {

}

class Sub02 extends Super02 {

}