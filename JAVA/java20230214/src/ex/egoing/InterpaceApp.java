package ex.egoing;
interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	@Override    // implements로 상속 시 반드시 overriding해서 사용해야함 
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	@Override
	public void print() {
		System.out.println("This is RealCal");
	}
}
public class InterpaceApp {
	public static void main(String[] args) {
		
		Printable c = new RealCal(); //RealCal class에 implements인 Printable를 instance로 지정
		Calculable d = new RealCal();// RealCal class에 implements인 Calculable를 instance로 지정
		System.out.println(d.sum(2,1)); 
		System.out.println(d.PI);
		c.print();
//		d.print();   //xx 
//		System.out.println(c.sum(2,1)); //xx
//		System.out.println(c.PI); //xx
		
	}
}
