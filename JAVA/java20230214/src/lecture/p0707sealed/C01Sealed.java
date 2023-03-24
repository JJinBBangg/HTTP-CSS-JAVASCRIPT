package lecture.p0707sealed;

public class C01Sealed {
	
}
// sealed
sealed class Super01 permits Sub11, Sub12{}

final class Sub11 extends Super01{}
final class Sub12 extends Super01{}


//final class Sub23 extends Super01{}
