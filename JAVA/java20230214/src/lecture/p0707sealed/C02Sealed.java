package lecture.p0707sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub21{}

sealed class Sub21 extends Super02 permits Sub23{}

final class Sub23 extends Sub21{}
